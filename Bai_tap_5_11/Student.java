package Bai_tap_5_11;

public class Student {
    private String fullname;
    private String ID;
    private String email;

    public Student(String fullname, String ID, String email) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
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

    public String toString() {
        return "Student{" + "fullname = " + fullname + ", ID = " + ID + ", email = " + email + "}";
    }
}
