public interface Printable {
    void print();
}

public class Document implements Printable {
    public void print() {
        System.out.println("Document is printing...");
    }
}
