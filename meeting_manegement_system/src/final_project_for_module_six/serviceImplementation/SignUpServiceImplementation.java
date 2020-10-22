package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.pojo.SignUp;
import final_project_for_module_six.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUpServiceImplementation extends CommonServiceAdapter<SignUp> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table sign_up(id int(6) primary key auto_increment,"
                + "full_name varchar(50) not null,"
                + "email varchar(50) not null,"
                + "username varchar(50) not null,"
                + "password varchar(50) not null)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Sign_UP Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void save(SignUp t) {
        String sql = "insert into sign_up(full_name, email, username, password) values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getFullName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getUserName());
            ps.setString(4, t.getPassword());
            ps.executeUpdate();
            System.out.println("::::: Sign Up Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SignUpServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SignUp t) {
        String sql = "update sign_up set full_name=?, email=?, username=?, password=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getFullName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getUserName());
            ps.setString(4, t.getPassword());
            ps.setInt(5, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Signed_Up Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SignUpServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from sign_up where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: User Disabled Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SignUpServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SignUp get(int id) {
        SignUp signUp = null;
        String sql = "select * from sign_up where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                signUp = new SignUp(rs.getInt("id"), rs.getString("full_name"), rs.getString("email"),
                        rs.getString("username"), rs.getString("password"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SignUpServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return signUp;
    }

    @Override
    public SignUp getUserByUsernameAndPassword(String username, String password) {
        SignUp signUp = null;
        String sql = "select * from sign_up where username=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                signUp = new SignUp(rs.getInt("id"), rs.getString("full_name"), rs.getString("email"),
                        rs.getString("username"), rs.getString("password"));
            }

        } catch (SQLException ex) {
            signUp = null;
        }
        return signUp;
    }

    @Override
    public List<SignUp> getList() {
        List<SignUp> signUps = new ArrayList<>();
        String sql = "select * from user";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SignUp signUp = new SignUp(rs.getInt("id"), rs.getString("full_name"), rs.getString("email"),
                        rs.getString("username"), rs.getString("password"));
                signUps.add(signUp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SignUpServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

        return signUps;
    }

    @Override
    public SignUp getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SignUp getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SignUp getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SignUp getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
