package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
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

public class PositionServiceImplementation extends CommonServiceAdapter<Position> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table position_table (Position_Id int(6) primary key auto_increment,"
                + "Position_Name varchar(50) not null,"
                + "Remark varchar(300) not null)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Position t) {
        String sql = "insert into position_table(Position_Name,Remark) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getPositionName());
            ps.setString(2, t.getRemark());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Position t) {
        String sql = "update position_table set Position_Name = ?, Remark = ? where Position_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getPositionName());
            ps.setString(2, t.getRemark());
            ps.setInt(3, t.getPositionId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Position_Id) {
        String sql = "delete from position_table where Position_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Position_Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Position get(int Position_Id) {
        Position position = null;
        String sql = "select * from position_table where Position_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Position_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                position = new Position(rs.getInt("Position_Id"), rs.getString("Position_Name"), rs.getString("Remark"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return position;
    }

    @Override
    public Position getByName(String Position_Name) {
        Position position = null;
        String sql = "select * from position_table where Position_Name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Position_Name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                position = new Position(rs.getInt("Position_Id"), rs.getString("Position_Name"), rs.getString("Remark"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return position;
    }

    @Override
    public List<Position> getList() {
        List<Position> positions = new ArrayList<>();
        String sql = "select * from position_table";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Position position = new Position(rs.getInt("Position_Id"), rs.getString("Position_Name"), rs.getString("Remark"));
                positions.add(position);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return positions;
    }

    @Override
    public Position getPositionByPostId(int Positon_Id) {
        Position position = null;
        String sql = "select distinct  p.Position_Id ,p.Position_Name, p.Remark from position_table p, employee e where p.Position_Id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Positon_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                position = new Position(rs.getInt("Position_Id"), rs.getString("Position_Name"), rs.getString("Remark"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PositionServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return position;
    }

    @Override
    public Position getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
