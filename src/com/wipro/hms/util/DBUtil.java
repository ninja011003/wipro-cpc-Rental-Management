package com.wipro.hms.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil {
	public static Connection getDBConnection() {
		Connection connect= null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connect =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "B2022102210059", "B2022102210059");
        } catch (Exception e) {
            return null;
           // e.printStackTrace();
        }
        return connect;
	}

}
