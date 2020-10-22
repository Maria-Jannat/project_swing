package final_project_for_module_six.service;

import java.util.List;

public interface CommonService<T> {

    void createTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    T getByName(String name);

    List<T> getList();

    T getPositionByPostId(int Position_Id);

    T getDepartmentByDeptId(int Department_Id);

    T getEmployeeByEmpId(int Employee_Id);

    T getUserByUsernameAndPassword(String username, String password);

}
