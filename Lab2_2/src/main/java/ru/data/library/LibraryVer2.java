package ru.data.library;
import ru.data.Book;
import ru.data.Data;
import ru.data.Newspaper;
import ru.data.Video;

import java.util.List;

public class LibraryVer2<T extends Data> {
    public LibraryVer2(T[] l) {
        list = l;
    }
    public T[] getList() {
        return list;
    }
    public void printList() {
        System.out.println("Lib2");
        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i].about());
        }
    }
    private T[] list;
}
