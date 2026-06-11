public class BookApplication {
    public static void main(String[] args) {
        Book book = Book.of("Andrzej Sapkowski", "Wiedzmin"); //Kiedy of a kiedy new?
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Tytul: " + book.getTitle());
    }
}