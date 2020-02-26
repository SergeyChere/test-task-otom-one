package dao;

import model.DataTable;

public interface DataDAO {
    void tablesCreation();
    void createData(DataTable dataTable);
    void updateData(DataTable dataTable, int id);
    void removeData(int id);
}
