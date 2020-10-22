package final_project_for_module_six.pojo;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private Position designation;
    private Department department;
    private String employeeStatus;
    private String description;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeEmail, Position designation, Department department, String employeeStatus, String description) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.designation = designation;
        this.department = department;
        this.employeeStatus = employeeStatus;
        this.description = description;
    }

    public Employee(String employeeName, String employeeEmail, Position designation, Department department, String employeeStatus, String description) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.designation = designation;
        this.department = department;
        this.employeeStatus = employeeStatus;
        this.description = description;
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setDesignation(Position designation) {
        this.designation = designation;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public Position getDesignation() {
        return designation;
    }

    public Department getDepartment() {
        return department;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public String getDescription() {
        return description;
    }

}

//        jDateChooser.getDateFormatString().trim(),
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String meetingSchedule = sdf.format(jDateChooser.getDate());
//        StringBuilder preferredContactPeriod = new StringBuilder();
//        if (chkMorns.isSelected()) {
//            preferredContactPeriod.append(chkMorns.getText().trim() + " ");
//        }
//        if (chkAfternoon.isSelected()) {
//            preferredContactPeriod.append(chkAfternoon.getText().trim() + " ");
//        }
//        if (chkEvening.isSelected()) {
//            preferredContactPeriod.append(chkEvening.getText().trim());
//        }
