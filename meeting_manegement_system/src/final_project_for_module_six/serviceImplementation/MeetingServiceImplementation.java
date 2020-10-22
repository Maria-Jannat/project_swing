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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeetingServiceImplementation extends CommonServiceAdapter<Meeting> {

    static Connection conn = DatabaseConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table meeting(Meeting_Id int(6) primary key auto_increment,"
                + "Meeting_Agenda varchar(50) not null,"
                + "Meeting_Details varchar(500) not null,"
                + "Meeting_Place varchar(50) not null,"
                + "Attendees varchar(500) not null,"
                + "Called_By int(6) not null,"
                + "Office_Name int(6) not null,"
                + "Set_Meeting_Date varchar(40) not null,"
                + "Set_Meeting_Time varchar(40) not null,"
                + "Meeting_Duration varchar(50),"
                + "Meeting_Status varchar(50) not null,"
                + "Meeting_Created_DateTime datetime,"
//                + "FOREIGN KEY(Attendees) REFERENCES employee(Employee_Id),"
                + "FOREIGN KEY(Called_By) REFERENCES employee(Employee_Id),"
                + "FOREIGN KEY(Office_Name) REFERENCES office(Office_Id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::: Table Created. Evet ::::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Meeting t) {
        String sql = "insert into meeting(Meeting_Agenda, Meeting_Details, Meeting_Place, Attendees, Called_By, Office_Name, Set_Meeting_Date, Set_Meeting_Time, Meeting_Duration, Meeting_Status, Meeting_Created_DateTime) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMeetingAgenda());
            ps.setString(2, t.getDetails());
            ps.setString(3, t.getMeetinPlace());
            ps.setString(4, t.getAttendees());
            ps.setInt(5, t.getCalledBy().getEmployeeId());
            ps.setInt(6, t.getOfficeName().getOfficeId());
            ps.setString(7, t.getSetMeetingDate());
            ps.setString(8, t.getSetMeetingTime());
            ps.setString(9, t.getMeetingDuration());
            ps.setString(10, t.getMeetingStatus());
            ps.setTimestamp(11, Timestamp.valueOf(t.getMeetingCreatedDateTime()));
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(MeetingServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Meeting t) {
        String sql = "update meeting set Meeting_Agenda = ?, Meeting_Details = ?, Meeting_Place = ?, Called_By = ?, Office_Name = ?, Set_Meeting_Date = ?, Set_Meeting_Time = ?, Meeting_Duration = ?, Meeting_Status = ?, Meeting_Created_DateTime = ? where Meeting_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMeetingAgenda());
            ps.setString(2, t.getDetails());
            ps.setString(3, t.getMeetinPlace());
//            ps.setString(4, t.getAttendees());
            ps.setInt(4, t.getCalledBy().getEmployeeId());
            ps.setInt(5, t.getOfficeName().getOfficeId());
            ps.setString(6, t.getSetMeetingDate());
            ps.setString(7, t.getSetMeetingTime());
            ps.setString(8, t.getMeetingDuration());
            ps.setString(9, t.getMeetingStatus());
            ps.setTimestamp(10, Timestamp.valueOf(t.getMeetingCreatedDateTime()));
            ps.setInt(11, t.getMeetingId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(MeetingServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int Meeting_Id) {
        String sql = "delete from meeting where Meeting_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Meeting_Id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MeetingServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Meeting get(int Meeting_Id) {
        Meeting meeting = null;
        String sql = "select * from meeting where Meeting_Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Meeting_Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
//   Meeting_Agenda = ?, Meeting_Details = ?, Meeting_Place = ?, Attendees = ?, Called_By = ?, Office_Name = ?, Set_Meeting_Date = ?, Set_Meeting_Time = ?, Meeting_Duration = ?, 
//   Meeting_Status = ?, Meeting_Created_DateTime = ? where Meeting_Id = ?"   

                meeting = new Meeting(rs.getInt("Meeting_Id"), rs.getString("Meeting_Agenda"), rs.getString("Meeting_Details"), rs.getString("Meeting_Place"), 
                        rs.getString("Attendees"), new Employee(rs.getInt("Called_By")), new Office(rs.getInt("Office_Name")), rs.getString("Set_Meeting_Date"),
                        rs.getString("Set_Meeting_Time"), rs.getString("Meeting_Duration"), rs.getString("Meeting_Status"), rs.getTimestamp("Meeting_Created_DateTime").toLocalDateTime());
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeetingServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meeting;
    }

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
            Logger.getLogger(MeetingServiceImplementation.class.getName()).log(Level.SEVERE, null, ex);
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
