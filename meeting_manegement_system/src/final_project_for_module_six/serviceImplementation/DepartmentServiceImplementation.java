package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.pojo.Department;
import final_project_for_module_six.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepartmentServiceImplementation extends CommonServiceAdapter<Department> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table department(department_id int(6) primary key auto_increment,"
                + "department_name varchar(50) not null,"
                + "remark varchar(300) not null)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Department t) {
        String sql = "insert into department(department_name,remark) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getDepartmentName());
            ps.setString(2, t.getRemark());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Department t) {
        String sql = "update department set department_name = ?, remark = ? where department_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getDepartmentName());
            ps.setString(2, t.getRemark());
            ps.setInt(3, t.getDepartmentId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Department_Id) {
        String sql = "delete from department where department_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Department_Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Department get(int Department_Id) {
        Department department = null;
        String sql = "select * from department where department_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Department_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                department = new Department(rs.getInt("department_id"), rs.getString("department_name"), rs.getString("remark"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return department;
    }

    @Override
    public Department getByName(String Department_Name) {
        Department department = null;
        String sql = "select * from department where department_name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Department_Name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                department = new Department(rs.getInt("department_id"), rs.getString("department_name"), rs.getString("remark"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return department;
    }

    @Override
    public List<Department> getList() {
        List<Department> departments = new ArrayList<>();
        String sql = "select * from department";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Department department = new Department(rs.getInt("department_id"), rs.getString("department_name"), rs.getString("remark"));
                departments.add(department);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departments;
    }

    @Override
    public Department getDepartmentByDeptId(int Department_Id) {
        Department department = null;
        String sql = "select distinct  d.department_id ,d.department_name, d.remark from department d, employee e where d.department_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Department_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                department = new Department(rs.getInt("department_id"), rs.getString("department_name"), rs.getString("remark"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return department;
    }

    @Override
    public Department getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
