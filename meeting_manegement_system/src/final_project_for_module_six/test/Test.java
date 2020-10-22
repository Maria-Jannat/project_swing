package final_project_for_module_six.test;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.service.CommonService;
import final_project_for_module_six.serviceImplementation.DepartmentServiceImplementation;
import final_project_for_module_six.serviceImplementation.EmployeeServiceImplementation;
import final_project_for_module_six.serviceImplementation.MeetingCancelServiceImplementation;
import final_project_for_module_six.serviceImplementation.MeetingServiceImplementation;
import final_project_for_module_six.serviceImplementation.OfficeServiceImplementation;
import final_project_for_module_six.serviceImplementation.OfficeTypeServiceImplementation;
import final_project_for_module_six.serviceImplementation.PositionServiceImplementation;
import final_project_for_module_six.serviceImplementation.SignUpServiceImplementation;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getInstance();

//        CommonService inService = new SignUpServiceImplementation();
//        inService.createTable();
//
//        CommonService inService = new PositionServiceImplementation();
//        inService.createTable();
//
//        CommonService inService = new DepartmentServiceImplementation();
//        inService.createTable();
//        
//        CommonService inService = new EmployeeServiceImplementation();
//        inService.createTable();
//        
//        CommonService inService = new OfficeTypeServiceImplementation();
//        inService.createTable();
//        
//        CommonService inService = new OfficeServiceImplementation();
//        inService.createTable();
//        
        CommonService inService = new MeetingServiceImplementation();
        inService.createTable();
    }
}
