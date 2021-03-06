import dao.DataDAO;
import dao.DataDAOImpl;
import model.DataTable;
import utils.RunnerDataTable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DataDAO dataDAO = new DataDAOImpl();
        RunnerDataTable runnerDataTable = new RunnerDataTable();

        System.out.println("We're connected");

        System.out.println("Creation tables...");
        dataDAO.tablesCreation();
        System.out.println("Tables are created");

        System.out.println("Insertion data to tables...");
        ArrayList<DataTable> tables = runnerDataTable.createDataTables();
        for (DataTable table : tables) {
            dataDAO.createData(table);
        }
        System.out.println("Data inserted");

        System.out.println("Updating table by id 1...");
        dataDAO.updateData(runnerDataTable.updateMGA_DC_BANKS_ACTIVITY(), 1);
        System.out.println("Table updated");

        System.out.println("Removing table by id 15...");
        dataDAO.removeData(15);
        System.out.println("Table removed");
    }
}
