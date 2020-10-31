
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class DBContext {

    private final String severName = "localhost";
    private final String dbName = "sqldatabase";
    private final String portNumber = "3306";
    private final String userID = "admin";
    private final String password = "2020";

    public DBContext() {
    }

    public Connection getconnection() throws Exception {
        String url = "jdbc:mysql://" + severName + ":" + portNumber + "/" + dbName;
        return DriverManager.getConnection(url, userID, password);
    }

    public ResultSet getConnectionStatement(String query) throws Exception {
        Connection connection = getconnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        return rs;
    }

    public void preStatement(String query) throws SQLException, Exception {
        Connection connection = getconnection();
        PreparedStatement preStatement = connection.prepareStatement(query);
        preStatement.executeUpdate();
        connection.close();
    }
}
