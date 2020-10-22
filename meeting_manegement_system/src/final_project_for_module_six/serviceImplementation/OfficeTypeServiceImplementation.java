package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
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

public class OfficeTypeServiceImplementation extends CommonServiceAdapter<OfficeType> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table office_type (Id int(6) primary key auto_increment,"
                + "Name varchar(50) not null)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(OfficeType t) {
        String sql = "insert into office_type(Name) values(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTypeName());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(OfficeType t) {
        String sql = "update office_type set Name = ? where Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTypeName());
            ps.setInt(2, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Id) {
        String sql = "delete from office_type where Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public OfficeType get(int Id) {
        OfficeType officeType = null;
        String sql = "select * from office_type where Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                officeType = new OfficeType(rs.getInt("Id"), rs.getString("Name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return officeType;
    }

    @Override
    public OfficeType getByName(String Name) {
        OfficeType officeType = null;
        String sql = "select * from office_type where Name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                officeType = new OfficeType(rs.getInt("Id"), rs.getString("Name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return officeType;
    }

    @Override
    public List<OfficeType> getList() {
        List<OfficeType> officeTypes = new ArrayList<>();
        String sql = "select * from office_type";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                OfficeType officeType = new OfficeType(rs.getInt("Id"), rs.getString("Name"));
                officeTypes.add(officeType);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OfficeTypeServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return officeTypes;
    }

    @Override
    public OfficeType getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficeType getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OfficeType getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
