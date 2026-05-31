public class BookApplication {
    public static void main(String[] args) {
        Book book = Book.of("Andrzej Sapkowski", "Wiedzmin");
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Tytul: " + book.getTitle());
    }
}