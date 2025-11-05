package Bai_tap_5_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortable<E> {
    private List<E> list;
    private Comparator<E> comparator;

    public ListSortable(Comparator<E> comparator) {
        this.list = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(E element) {
        list.add(element);
    }

    public void print() {
        Collections.sort(list, comparator);
        System.out.println("Danh sach khoa luan");
        for (E element : list) {
            System.out.println(element);
        }
    }

    public List<E> getList() {
        return list;
    }
}
