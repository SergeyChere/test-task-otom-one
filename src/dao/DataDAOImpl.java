package dao;

import model.*;
import utils.JDBCUtils;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDAOImpl implements DataDAO {
    //CREATE
    private static final String CREATE_MGA_DC_BANKS_ACTIVITY_SQL =
            "INSERT INTO test_schema.mga_dC_banks_activity"
                    +"  (DEPARTMENT_ID, DEBTS_ACTIVITY_ID, BANK_ID, REQUEST_TYPE_ID) VALUES "
                    +" (?, ?, ?, ?);";
    private static final String CREATE_MGA_DC_DEBTS_SQL =
            "INSERT INTO test_schema.mga_dC_debts"
                    +"  (IDENTIFIER, SERVICE_TYPE, SOURCE_ID, DEBT_ID, LOAD_GROUP_ID) VALUES "
                    +" (?, ?, ?, ?, ?);";
    private static final String CREATE_MGA_DC_DEBTS_ACTIVITIES_SQL =
            "INSERT INTO test_schema.mga_dC_debts_activities"
                    +"  (DEPARTMENT_ID, DEBT_GROUP_ID, MAIN_PRO_ID, SUB_PRO_ID, STATUS_ID) VALUES "
                    +" (?, ?, ?, ?, ?);";
    private static final String CREATE_MGA_DC_LOAD_GROUPS_SQL =
            "INSERT INTO test_schema.mga_dc_load_groups"
                    +"  (SOURCE_ID, LOAD_GROUP_TYPE_ID) VALUES "+" (?, ?);";
    //UPDATE
    private static final String UPDATE_MGA_DC_BANKS_ACTIVITY_SQL =
            "UPDATE test_schema.mga_dC_banks_activity SET"
                    +" DEPARTMENT_ID=?,"
                    +" DEBTS_ACTIVITY_ID=?,"
                    +" BANK_ID=?,"
                    +" REQUEST_TYPE_ID=?"
                    +" WHERE BANK_ACTIVITY_ID=?";
    //REMOVE
    private static final String REMOVE_MGA_DC_LOAD_GROUPS_SQL =
            "DELETE FROM test_schema.mga_dc_load_groups WHERE LOAD_GROUP_ID=?";

    @Override
    public void tablesCreation() {
        try (Connection connection = JDBCUtils.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS mga_dc_load_groups (" +
                    "LOAD_GROUP_ID INT NOT NULL AUTO_INCREMENT, " +
                    "SOURCE_ID INT NOT NULL, " +
                    "LOAD_GROUP_TYPE_ID  INT NOT NULL, " +
                    "PRIMARY KEY(LOAD_GROUP_ID))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS mga_dC_debts (" +
                    "DEBTOR_ID INT NOT NULL AUTO_INCREMENT, " +
                    "IDENTIFIER INT NOT NULL, " +
                    "SERVICE_TYPE INT NOT NULL, " +
                    "SOURCE_ID INT NOT NULL, " +
                    "DEBT_ID INT NOT NULL, " +
                    "LOAD_GROUP_ID INT NOT NULL, " +
                    "PRIMARY KEY(DEBTOR_ID))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS mga_dC_debts_activities (" +
                    "DEBTS_ACTIVITY_ID INT NOT NULL AUTO_INCREMENT, " +
                    "DEPARTMENT_ID INT NOT NULL, " +
                    "DEBT_GROUP_ID INT NOT NULL, " +
                    "MAIN_PRO_ID INT NOT NULL, " +
                    "SUB_PRO_ID INT NOT NULL, " +
                    "STATUS_ID INT NOT NULL, " +
                    "PRIMARY KEY(DEBTS_ACTIVITY_ID))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS mga_dC_banks_activity (" +
                    "BANK_ACTIVITY_ID INT NOT NULL AUTO_INCREMENT, " +
                    "DEPARTMENT_ID INT NOT NULL, " +
                    "DEBTS_ACTIVITY_ID INT NOT NULL, " +
                    "BANK_ID INT NOT NULL, " +
                    "REQUEST_TYPE_ID INT NOT NULL, " +
                    "PRIMARY KEY(BANK_ACTIVITY_ID))");
            JDBCUtils.disconnect();
        } catch (SQLException | RemoteException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void createData(DataTable dataTable) {
        try {
            PreparedStatement preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL =
                    JDBCUtils.getConnection().prepareStatement(CREATE_MGA_DC_BANKS_ACTIVITY_SQL);
            preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(1,
                    dataTable.getMga_dc_banks_activity().getDEPARTMENT_ID());
            preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(2,
                    dataTable.getMga_dc_banks_activity().getDEBTS_ACTIVITY_ID());
            preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(3,
                    dataTable.getMga_dc_banks_activity().getBANK_ID());
            preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(4,
                    dataTable.getMga_dc_banks_activity().getREQUEST_TYPE_ID());
            preparedStatementCREATE_MGA_DC_BANKS_ACTIVITY_SQL.executeUpdate();
            JDBCUtils.disconnect();

            PreparedStatement preparedStatementCREATE_MGA_DC_DEBTS_SQL =
                    JDBCUtils.getConnection().prepareStatement(CREATE_MGA_DC_DEBTS_SQL);
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.setInt(1,
                    dataTable.getMga_dc_debts().getIDENTIFIER());
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.setInt(2,
                    dataTable.getMga_dc_debts().getSERVICE_TYPE());
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.setInt(3,
                    dataTable.getMga_dc_debts().getSOURCE_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.setInt(4,
                    dataTable.getMga_dc_debts().getDEBT_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.setInt(5,
                    dataTable.getMga_dc_debts().getLOAD_GROUP_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_SQL.executeUpdate();
            JDBCUtils.disconnect();

            PreparedStatement preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL =
                    JDBCUtils.getConnection().prepareStatement(CREATE_MGA_DC_DEBTS_ACTIVITIES_SQL);
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.setInt(1,
                    dataTable.getMga_dc_debts_activities().getDEPARTMENT_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.setInt(2,
                    dataTable.getMga_dc_debts_activities().getDEBT_GROUP_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.setInt(3,
                    dataTable.getMga_dc_debts_activities().getMAIN_PRO_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.setInt(4,
                    dataTable.getMga_dc_debts_activities().getSUB_PRO_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.setInt(5,
                    dataTable.getMga_dc_debts_activities().getSTATUS_ID());
            preparedStatementCREATE_MGA_DC_DEBTS_ACTIVITIES_SQL.executeUpdate();
            JDBCUtils.disconnect();

            PreparedStatement preparedStatementCREATE_MGA_DC_LOAD_GROUPS_SQL =
                    JDBCUtils.getConnection().prepareStatement(CREATE_MGA_DC_LOAD_GROUPS_SQL);
            preparedStatementCREATE_MGA_DC_LOAD_GROUPS_SQL.setInt(1,
                    dataTable.getMga_dc_load_groups().getSOURCE_ID());
            preparedStatementCREATE_MGA_DC_LOAD_GROUPS_SQL.setInt(2,
                    dataTable.getMga_dc_load_groups().getLOAD_GROUP_TYPE_ID());
            preparedStatementCREATE_MGA_DC_LOAD_GROUPS_SQL.executeUpdate();
            JDBCUtils.disconnect();
        } catch (SQLException | RemoteException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void updateData(DataTable dataTable, int id) {
        try {
            PreparedStatement preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL =
                    JDBCUtils.getConnection().prepareStatement(UPDATE_MGA_DC_BANKS_ACTIVITY_SQL);

            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(1,
                    dataTable.getMga_dc_banks_activity().getDEPARTMENT_ID());
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(2,
                    dataTable.getMga_dc_banks_activity().getDEBTS_ACTIVITY_ID());
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(3,
                    dataTable.getMga_dc_banks_activity().getBANK_ID());
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(4,
                    dataTable.getMga_dc_banks_activity().getREQUEST_TYPE_ID());
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(5, id);

            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.executeUpdate();
            JDBCUtils.disconnect();
        } catch (SQLException | RemoteException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void removeData(int id) {
        try {
            PreparedStatement preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL =
                    JDBCUtils.getConnection().prepareStatement(REMOVE_MGA_DC_LOAD_GROUPS_SQL);
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.setInt(1, id);
            preparedStatementUPDATE_MGA_DC_BANKS_ACTIVITY_SQL.executeUpdate();
            JDBCUtils.disconnect();
        }  catch (SQLException | RemoteException exc) {
            exc.printStackTrace();
        }
    }
}
