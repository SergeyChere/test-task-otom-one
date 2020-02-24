import dao.DataDAO;
import dao.DataDAOImpl;
import model.DataTable;
import utils.JDBCUtils;
import utils.RunnerDataTable;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataDAO dataDAO = new DataDAOImpl();

        try(Connection connection = JDBCUtils.getConnection();
            Statement statement = connection.createStatement()) {
            System.out.println("We're connected");
            dataDAO.tablesCreation(statement);
            RunnerDataTable runnerDataTable = new RunnerDataTable();
            ArrayList<DataTable> tables = runnerDataTable.createDataTables();
            for (DataTable table : tables) {
                dataDAO.createData(table);
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
