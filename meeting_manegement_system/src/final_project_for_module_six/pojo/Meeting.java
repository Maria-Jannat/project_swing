package final_project_for_module_six.pojo;

import java.time.LocalDateTime;
import java.util.Date;

public class Meeting {

    private int meetingId;
    private String meetingAgenda;
    private String details;
    private String meetinPlace;
    private String attendees;
    private Employee calledBy;
    private Office officeName;
    private String setMeetingDate;
    private String setMeetingTime;
    private String meetingDuration;
    private String meetingStatus;
    private LocalDateTime meetingCreatedDateTime;

    public Meeting() {
    }

    public Meeting(int meetingId, String meetingAgenda, String details, String meetinPlace, String attendees, Employee calledBy, Office officeName, String setMeetingDate, String setMeetingTime, String meetingDuration, String meetingStatus, LocalDateTime meetingCreatedDateTime) {
        this.meetingId = meetingId;
        this.meetingAgenda = meetingAgenda;
        this.details = details;
        this.meetinPlace = meetinPlace;
        this.attendees = attendees;
        this.calledBy = calledBy;
        this.officeName = officeName;
        this.setMeetingDate = setMeetingDate;
        this.setMeetingTime = setMeetingTime;
        this.meetingDuration = meetingDuration;
        this.meetingStatus = meetingStatus;
        this.meetingCreatedDateTime = meetingCreatedDateTime;
    }

    public Meeting(String meetingAgenda, String details, String meetinPlace, String attendees, Employee calledBy, Office officeName, String setMeetingDate, String setMeetingTime, String meetingDuration, String meetingStatus, LocalDateTime meetingCreatedDateTime) {
        this.meetingAgenda = meetingAgenda;
        this.details = details;
        this.meetinPlace = meetinPlace;
        this.attendees = attendees;
        this.calledBy = calledBy;
        this.officeName = officeName;
        this.setMeetingDate = setMeetingDate;
        this.setMeetingTime = setMeetingTime;
        this.meetingDuration = meetingDuration;
        this.meetingStatus = meetingStatus;
        this.meetingCreatedDateTime = meetingCreatedDateTime;
    }

    public Meeting(String meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public void setMeetingAgenda(String meetingAgenda) {
        this.meetingAgenda = meetingAgenda;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setMeetinPlace(String meetinPlace) {
        this.meetinPlace = meetinPlace;
    }

    public void setAttendees(String attendees) {
        this.attendees = attendees;
    }

    public void setCalledBy(Employee calledBy) {
        this.calledBy = calledBy;
    }

    public void setOfficeName(Office officeName) {
        this.officeName = officeName;
    }

    public void setSetMeetingDate(String setMeetingDate) {
        this.setMeetingDate = setMeetingDate;
    }

    public void setSetMeetingTime(String setMeetingTime) {
        this.setMeetingTime = setMeetingTime;
    }

    public void setMeetingDuration(String meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public void setMeetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public void setMeetingCreatedDateTime(LocalDateTime meetingCreatedDateTime) {
        this.meetingCreatedDateTime = meetingCreatedDateTime;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public String getMeetingAgenda() {
        return meetingAgenda;
    }

    public String getDetails() {
        return details;
    }

    public String getMeetinPlace() {
        return meetinPlace;
    }

    public String getAttendees() {
        return attendees;
    }

    public Employee getCalledBy() {
        return calledBy;
    }

    public Office getOfficeName() {
        return officeName;
    }

    public String getSetMeetingDate() {
        return setMeetingDate;
    }

    public String getSetMeetingTime() {
        return setMeetingTime;
    }

    public String getMeetingDuration() {
        return meetingDuration;
    }

    public String getMeetingStatus() {
        return meetingStatus;
    }

    public LocalDateTime getMeetingCreatedDateTime() {
        return meetingCreatedDateTime;
    }

}
