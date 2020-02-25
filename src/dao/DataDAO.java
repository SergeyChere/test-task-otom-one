package dao;

import model.DataTable;

import java.sql.SQLException;

public interface DataDAO {

    void tablesCreation() throws SQLException;
    void createData(DataTable dataTable) throws SQLException;
    void updateData(DataTable dataTable, int id) throws SQLException;
    void removeData(int id) throws SQLException;
}
