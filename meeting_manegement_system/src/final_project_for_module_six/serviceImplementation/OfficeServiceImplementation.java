package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.pojo.Office;
import final_project_for_module_six.pojo.OfficeType;
import final_project_for_module_six.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OfficeServiceImplementation extends CommonServiceAdapter<Office> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table office(Office_Id int(6) primary key auto_increment,"
                + "Office_Name varchar(50) not null unique,"
                + "Type int(6) not null,"
                + "Address varchar(300) not null,"
                + "Email varchar(50) not null unique,"
                + "Contact_Number varchar(15) not null unique,"
                + "FOREIGN KEY(Type) REFERENCES office_type(Id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created. Evet ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Office t) {
        String sql = "insert into office(Office_Name,Type,Address,Email,Contact_Number) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getOfficeName());
            ps.setInt(2, t.getType().getId());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getContactNumber());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Office t) {
        String sql = "update office set Office_Name = ?, Type = ?, Address = ?, Email = ?, Contact_Number = ? where Office_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getOfficeName());
            ps.setInt(2, t.getType().getId());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getContactNumber());
            ps.setInt(6, t.getOfficeId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Office_Id) {
        String sql = "delete from office where Office_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Office_Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Office get(int Office_Id) {
        Office office = null;
        String sql = "select * from office where Office_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Office_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                office = new Office(rs.getInt("Office_Id"), rs.getString("Office_Name"), new OfficeType(rs.getInt("Type")), rs.getString("Address"),
                        rs.getString("Email"), rs.getString("Contact_Number"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return office;
    }

    @Override
    public List<Office> getList() {
        List<Office> offices = new ArrayList<>();
        String sql = "select * from office";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Office office = new Office(rs.getInt("Office_Id"), rs.getString("Office_Name"), new OfficeType(rs.getInt("Type")), rs.getString("Address"),
                        rs.getString("Email"), rs.getString("Contact_Number"));

                offices.add(office);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return offices;
    }

    @Override
    public Office getByName(String Office_Name) {
        Office office = null;
        String sql = "select * from office where Office_Name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Office_Name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                office = new Office(rs.getInt("Office_Id"), rs.getString("Office_Name"), new OfficeType(rs.getInt("Type")), rs.getString("Address"),
                        rs.getString("Email"), rs.getString("Contact_Number"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(OfficeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return office;
    }

    @Override
    public Office getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Office getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Office getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
