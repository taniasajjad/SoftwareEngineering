import java.time.LocalTime;

public class faccade_main {

    // Method to write a new speaker from Web App to SQL DB
    public boolean write_speaker(String fname, String lname, String phone, String email, String doc){
        // check for duplicates
        return true;
    }

    // Method to edit an existing Speaker in SQL DB
    public boolean edit_speaker(String fname, String lname, String phone, String email, String doc){
        // check for duplicates
        return true;
    }

    // Method to remove an speaker from the database
    public boolean remove_speaker(String fname, String lname, String phone, String email, String doc){
        return true;
    }

    // Method to find a speaker w/o using the speaker_id
    public boolean find_speaker(String fname, String lname, String email){
        return false;
    }

    // Method to get all speakers info to front end
    public String [][] get_all_speakers(){
        // Decision on return type between 1D or 2D array of String
        return new String [0][0];
    }

    // Method to write a new room from Web App to SQL DB
    public boolean write_room(String room_no, String seats){
        // check for duplicates
        return true;
    }

    // Method to edit an existing Room in SQL DB
    public boolean edit_room(String room, String seats){
        // check for duplicates
        return true;
    }

    // Method to remove a room from the database
    public boolean remove_room(String room_no, String seats){
        return true;
    }

    // Method to find a room w/o using the room_id
    public boolean find_room(String room_no, String seats){
        return false;
    }

    // Method to get all rooms info to front end
    public String [][] get_all_rooms(){
        // Decision on return type between 1D or 2D array of String
        return new String [0][0];
    }

    // Method to write a new time slot from Web App to SQL DB
    public boolean write_time_slot(LocalTime start, LocalTime end){
        // check for duplicates
        return true;
    }

    // Method to edit an existing time slot in SQL DB
    public boolean edit_time_slot(LocalTime start, LocalTime end){
        // check for duplicates
        return true;
    }

    // Method to remove a time slot from the database
    public boolean remove_time_slot(LocalTime start, LocalTime end){
        return true;
    }

    // Method to find a time slot w/o using the time_slot_id
    public boolean find_time_slot(LocalTime start, LocalTime end){
        return false;
    }

    // Method to get all time slots info to front end
    public String [][] get_all_time_slots(){
        // Decision on return type between 1D or 2D array of String
        return new String [0][0];
    }

    // Method to write a new session from Web App to SQL DB
    public boolean write_session(String session_name){
        // check for duplicates
        return true;
    }

    // Method to edit an existing Session in SQL DB
    public boolean edit_session(String session_name){
        // check for duplicates
        return true;
    }

    // Method to remove a session from the database
    public boolean remove_session(String session_name){
        return true;
    }

    // Method to find a session w/o using the session_id
    public boolean find_session(String session_name){
        return false;
    }

    // Method to get all sessions info to front end
    public String [][] get_all_sessions(){
        // Decision on return type between 1D or 2D array of String
        return new String [0][0];
    }

    public boolean delete_doc_info(){
        return true;
    }

    // check for malicious code?
    public boolean check_valid_entry(String s){
        return false;
    }

    // check to make sure its a valid integer number
    public boolean check_num(String s){
        return false;
    }

    // Maybe delete - check with Bruce, Raymond
    public boolean check_email(String s){
        return false;
    }

}
