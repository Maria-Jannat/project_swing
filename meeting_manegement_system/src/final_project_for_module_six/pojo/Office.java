package final_project_for_module_six.pojo;

public class Office {

    private int officeId;
    private String officeName;
    private OfficeType type;
    private String address;
    private String email;
    private String contactNumber;

    public Office() {
    }

    public Office(int officeId, String officeName, OfficeType type, String address, String email, String contactNumber) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.type = type;
        this.address = address;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public Office(String officeName, OfficeType type, String address, String email, String contactNumber) {
        this.officeName = officeName;
        this.type = type;
        this.address = address;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public Office(int officeId) {
        this.officeId = officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public void setType(OfficeType type) {
        this.type = type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getOfficeId() {
        return officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public OfficeType getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

}
