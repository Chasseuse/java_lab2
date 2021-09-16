import ru.data.Book;
import ru.data.Data;
import ru.data.Newspaper;
import ru.data.Video;
import ru.data.library.LibraryVer1;
import ru.data.library.LibraryVer2;

public class Main {
    public static void main(String[] args) {
        Book[] b = new Book[2];
        b[0] = new Book();
        b[1] = new Book();
        LibraryVer1 lib1 = new LibraryVer1(b);
        lib1.printList();
        Data[] d = new Data[3];
        d[0] = new Book();
        d[1] = new Newspaper();
        d[2] = new Video();
        LibraryVer2<Data> lib2 = new LibraryVer2<Data>(d);
        lib2.printList();
    }
}
