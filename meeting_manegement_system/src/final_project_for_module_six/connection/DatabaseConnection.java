package final_project_for_module_six.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static Connection instance;

    public static Connection getInstance() {

        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "1234");
            System.out.println(":::::: Database Connected mi ::::::");
        } catch (Exception e) {
        }
        return instance;

    }
}
