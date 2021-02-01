public class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
//
//    public String toString() {
//        return this.author + " - " + this.title;
//    }

    public static void main(String[] args) {
        Book book = Book.of("D.Gluchovsky", "Metro 2033");
        System.out.println(book.author + " " + book.title);
    }

    private static Book of(String author, String title) {
        return new Book(author, title);
    }
}


