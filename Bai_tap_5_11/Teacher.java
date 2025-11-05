package Bai_tap_5_11;

public class Teacher {
    private String fullname;
    private String ID;
    private String email;
    private String title;

    public Teacher(String fullname, String ID, String email, String title) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    public String getFullname() {
        return fullname;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Teacher{" + "fullname = " + fullname + ", ID = " + ID + ", email = " + email + ", title = " + title + "'}";
    }
}
