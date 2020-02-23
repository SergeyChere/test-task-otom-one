import dao.DataDAO;
import dao.DataDAOImpl;
import model.DataTable;
import utils.FileParser;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataDAO dataDAO = new DataDAOImpl();

        try(Connection connection = JDBCUtils.getConnection();
            Statement statement = connection.createStatement()) {
            System.out.println("We're connected");
            dataDAO.tablesCreation(statement);
            ArrayList<DataTable> tables = FileParser.parser();
            for (DataTable table : tables) {
                dataDAO.createData(table);
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
