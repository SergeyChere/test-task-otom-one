package utils;

import java.rmi.RemoteException;
import java.sql.*;

public class JDBCUtils {

    private static String url = "jdbc:mysql://localhost:3306/test_schema?useSSL=false";
    private static String user = "root";
    private static String password = "root";

    public static ResultSet resultSet = null;
    public static Statement statement = null;
    public static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void disconnect() throws RemoteException {
        try{
            if(resultSet != null) resultSet.close();
            if(statement != null) statement.close();
            if(connection != null) connection.close();
        }
        catch(SQLException sqlEx){
            System.out.println("Error: disconnect");
        }
    }
}
