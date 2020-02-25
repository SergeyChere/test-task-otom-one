package dao;

import model.DataTable;

import java.sql.SQLException;

public interface DataDAO {
    void tablesCreation();
    void createData(DataTable dataTable);
    void updateData(DataTable dataTable, int id);
    void removeData(int id);
}
