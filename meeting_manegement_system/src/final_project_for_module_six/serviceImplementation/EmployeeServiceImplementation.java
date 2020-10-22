package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.pojo.Department;
import final_project_for_module_six.pojo.Employee;
import final_project_for_module_six.pojo.Position;
import final_project_for_module_six.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeServiceImplementation extends CommonServiceAdapter<Employee> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table employee(Employee_Id int(6) primary key auto_increment,"
                + "Employee_Name varchar(50) not null,"
                + "Employee_Email varchar(50) not null unique,"
                + "Position_Id int(6),"
                + "Department_Id int(6),"
                + "Employee_Status varchar(8) not null,"
                + "Description varchar(300) not null,"
                + "FOREIGN KEY(Position_Id) REFERENCES position_table(Position_Id),"
                + "FOREIGN KEY(Department_Id) REFERENCES department(Department_Id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created. Evet ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Employee t) {
        String sql = "insert into employee(Employee_Name,Employee_Email,Position_Id,Department_Id,Employee_Status,Description) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getEmployeeName());
            ps.setString(2, t.getEmployeeEmail());
            ps.setInt(3, t.getDesignation().getPositionId());
            ps.setInt(4, t.getDepartment().getDepartmentId());
            ps.setString(5, t.getEmployeeStatus());
            ps.setString(6, t.getDescription());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Employee t) {
        String sql = "update employee set Employee_Name = ?, Employee_Email = ?, Position_Id = ?, Department_Id = ?, Employee_Status = ?, Description = ? where Employee_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getEmployeeName());
            ps.setString(2, t.getEmployeeEmail());
            ps.setInt(3, t.getDesignation().getPositionId());
            ps.setInt(4, t.getDepartment().getDepartmentId());
            ps.setString(5, t.getEmployeeStatus());
            ps.setString(6, t.getDescription());
            ps.setInt(7, t.getEmployeeId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Employee_Id) {
        String sql = "delete from employee where Employee_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Employee_Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Employee get(int Employee_Id) {
        Employee employee = null;
        String sql = "select * from employee where Employee_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Employee_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                employee = new Employee(rs.getInt("Employee_Id"), rs.getString("Employee_Name"), rs.getString("Employee_Email"),
                        new Position(rs.getInt("Position_Id")), new Department(rs.getInt("Department_Id")), rs.getString("Employee_Status"), rs.getString("Description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
    public List<Employee> getList() {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("Employee_Id"), rs.getString("Employee_Name"), rs.getString("Employee_Email"), new Position(rs.getInt("Position_Id")),
                        new Department(rs.getInt("Department_Id")), rs.getString("Employee_Status"), rs.getString("Description"));
                employees.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }

    @Override
    public Employee getByName(String Employee_Name) {
        Employee employee = null;
        String sql = "select * from employee where Employee_Name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Employee_Name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                employee = new Employee(rs.getInt("Employee_Id"), rs.getString("Employee_Name"), rs.getString("Employee_Email"), new Position(rs.getInt("Position_Id")),
                        new Department(rs.getInt("Department_Id")), rs.getString("Employee_Status"), rs.getString("Description"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
    public Employee getEmployeeByEmpId(int Employee_Id) {
        Employee employee = null;
        String sql = "select distinct  e.Employee_Id ,e.Employee_Name, e.Employee_Email, e.Position_Id , e.Department_Id , e.Employee_Status , e.Description from employee e, meeting m where e.Employee_Id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Employee_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                employee = new Employee(rs.getInt("Employee_Id"), rs.getString("Employee_Name"), rs.getString("Employee_Email"), new Position(rs.getInt("Position_Id")),
                        new Department(rs.getInt("Department_Id")), rs.getString("Employee_Status"), rs.getString("Description"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
    public Employee getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
