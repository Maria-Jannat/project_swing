package final_project_for_module_six.pojo;

public class Position {

    private int positionId; // primary key
    private String positionName;
    private String remark;

    public Position() {
    }

    public Position(int positionId, String positionName, String remark) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.remark = remark;
    }

    public Position(String positionName, String remark) {
        this.positionName = positionName;
        this.remark = remark;
    }

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getRemark() {
        return remark;
    }

}
