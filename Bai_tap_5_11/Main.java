package Bai_tap_5_11;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student sv1 = new Student("Nguyen Van A", "SV001", "a@student.edu.vn");
        Student sv2 = new Student("Tran Thi B", "SV002", "b@student.edu.vn");
        Student sv3 = new Student("Le Van C", "SV003", "c@student.edu.vn");

        Teacher gv1 = new Teacher("TS. Pham Van D", "GV001", "d@university.edu.vn", "Tien si");
        Teacher gv2 = new Teacher("ThS. Hoang Thi E", "GV002", "e@university.edu.vn", "Thac si");

        Advisor advisor1 = new Advisor("Nguyen Van F", "f@company.com");

        KLTN<Student, Teacher> kltn1 = new KLTN<>(sv1, gv1, "Xay dung ung dung quan ly sinh vien");
        KLTN<Student, Teacher> kltn2 = new KLTN<>(sv2, gv2, "He thong quan ly thu vien");
        KLTN<Student, Advisor> kltn3 = new KLTN<>(sv3, advisor1, "Ung dung AI trong giao duc");

        Comparator<KLTN<?, ?>> comparator = new Comparator<KLTN<?, ?>>() {
            @Override
            public int compare(KLTN<?, ?> o1, KLTN<?, ?> o2) {
                return o1.getThesisName().compareToIgnoreCase(o2.getThesisName());
            }
        };

        ListSortable<KLTN<?, ?>> danhSachKLTN = new ListSortable<>(comparator);
        danhSachKLTN.add(kltn1);
        danhSachKLTN.add(kltn2);
        danhSachKLTN.add(kltn3);

        // In danh sách đã sắp xếp
        danhSachKLTN.print();
    }
}
