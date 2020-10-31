
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class TestDBSering {

    public static void main(String[] args) {
        // TODO code application logic here
        DBContext database = new DBContext();
        faccade_main fm = new faccade_main();
        ResultSet result;
        try {
            Connection connection = database.getconnection();
            System.out.println("Connect to Database sussess " + connection.getMetaData().getDatabaseProductName());
            System.out.println("If true (can able to write speaker to database) \nIf false (speaker already exist in database)\nSpeaker infor exist in database: " + fm.write_speaker("lastNaame", "782", "aemxaal@gmail.com", "dayEAsMPLE"));
            System.out.println("\n\nIf true(speaker exist in database so it can edit) \nIf false(can not edit because speaker not exist in database) \nEdit Speaker: " + fm.edit_speaker("lastName", "1234567890", "email@gmail.com", "dayEXAMPLE") + "\n\n");
            System.out.println(fm.remove_speaker("firstname", "1234", "emai2@gmail.com", "day") + "\n\n");
            System.out.println("If true(found speak with ID) \nIf false(speaker does not exist)\nSpeaker Found:" + fm.find_speaker("lastName", "email@gmail.com"));

        } catch (Exception ex) {
        }

    }

}
