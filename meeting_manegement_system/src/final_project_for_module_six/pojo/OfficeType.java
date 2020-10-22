package final_project_for_module_six.pojo;

public class OfficeType {

    private int id; // primary key
    private String typeName;

    public OfficeType() {
    }

    public OfficeType(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public OfficeType(int id) {
        this.id = id;
    }

    public OfficeType(String typeName) {
        this.typeName = typeName;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

}
