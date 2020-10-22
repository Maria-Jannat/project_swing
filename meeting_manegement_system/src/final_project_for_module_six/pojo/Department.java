package final_project_for_module_six.pojo;

import java.text.SimpleDateFormat;

public class Department {

    private int departmentId; // primary key
    private String departmentName;
    private String remark;

    public Department() {
    }

    public Department(int departmentId, String departmentName, String remark) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.remark = remark;
    }

    public Department(String departmentName, String remark) {
        this.departmentName = departmentName;
        this.remark = remark;
    }

    public Department(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getRemark() {
        return remark;
    }

}
