package dao;

import model.*;

import java.sql.SQLException;
import java.sql.Statement;

public interface DataDAO {

    void tablesCreation(Statement statement) throws SQLException;
    void createData(DataTable dataTable) throws SQLException;
    void readData() throws SQLException;
    void updateData(DataTable dataTable) throws SQLException;
    void removeData() throws SQLException;
}
