package final_project_for_module_six.serviceImplementation;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.pojo.Employee;
import final_project_for_module_six.pojo.Meeting;
import final_project_for_module_six.pojo.Office;
import final_project_for_module_six.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeetingCancelServiceImplementation extends CommonServiceAdapter<Meeting> {

    static Connection conn = DatabaseConnection.getInstance();

//    @Override
//    public void createTable() {
//        String sql = "create table meeting_cancel (meeting_status varchar(50) not null)";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.execute();
//            System.out.println(":::::: Table Created. Evet ::::::");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }

//    @Override
//    public void save(MeetingCancel t) {
//        String sql = "insert into meeting_cancel(meeting_status) values(?)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, t.getMeetingStatus());
//            ps.executeUpdate();
//            System.out.println("::::: Data Inserted Successfully :::::");
//        } catch (SQLException ex) {
//            Logger.getLogger(MeetingCancelServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    @Override
    public void update(Meeting t) {
        String sql = "update meeting set meeting_status = ? where meeting_status = \"upcoming\"";
//        String sql = "update meeting set meeting_status = ? where meeting_id IS NOT NULL";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMeetingStatus());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(MeetingCancelServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//
//    @Override
//    public void delete(int Meeting_Id) {
//        String sql = "delete from meeting where Meeting_Id = ?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, Meeting_Id);
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(MeetingCancelServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    @Override
//    public MeetingCancel get(int Id) {
//        MeetingCancel meeting = null;
//        String sql = "select * from meeting_cancel where Id = ?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, Id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {  
//                meeting = new MeetingCancel(rs.getString("meeting_status"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MeetingCancelServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return meeting;
//    }
//
    @Override
    public List<Meeting> getList() {
        List<Meeting> meetings = new ArrayList<>();
        String sql = "select * from meeting";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Meeting meeting = new Meeting(rs.getInt("Meeting_Id"), rs.getString("Meeting_Agenda"), rs.getString("Meeting_Details"), rs.getString("Meeting_Place"), 
                        rs.getString("Attendees"), new Employee(rs.getInt("Called_By")), new Office(rs.getInt("Office_Name")), rs.getString("Set_Meeting_Date"),
                        rs.getString("Set_Meeting_Time"), rs.getString("Meeting_Duration"), rs.getString("Meeting_Status"), rs.getTimestamp("Meeting_Created_DateTime").toLocalDateTime());
                meetings.add(meeting);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeetingCancelServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meetings;
    }

    @Override
    public Meeting getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meeting getPositionByPostId(int Position_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meeting getDepartmentByDeptId(int Department_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meeting getEmployeeByEmpId(int Employee_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
