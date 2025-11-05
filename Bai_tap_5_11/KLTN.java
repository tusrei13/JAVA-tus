package Bai_tap_5_11;

public class KLTN<T, V> {
    private T student;
    private V advisor;
    private String thesisName;
    
    public KLTN(T student, V advisor, String thesisName) {
        this.student = student;
        this.advisor = advisor;
        this.thesisName = thesisName;
    }

    public T getStudent() {
        return student;
    }

    public V getAdvisor() {
        return advisor;
    }

    public String getThesisName() {
        return thesisName;
    }

    @Override
    public String toString() {
        return "KLTN{" + "thesisName = " + thesisName + ", student = " + student + ", advisor = " + advisor + "}";
    }
}
