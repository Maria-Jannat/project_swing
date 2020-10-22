package final_project_for_module_six.pojo;

public class MeetingCancel {


    private String meetingStatus;

    public MeetingCancel() {
    }

    public MeetingCancel( String meetingStatus) {
        this.meetingStatus = meetingStatus;
    }


    public String getMeetingStatus() {
        return meetingStatus;
    }

    public void setMeetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

}
