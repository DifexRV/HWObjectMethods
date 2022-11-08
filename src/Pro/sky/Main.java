package Pro.sky;


public class Main {


    public static void main(String[] args) {

        Author author = new Author("Steven", "King");
        Book book = new Book(author, "11/22/63", 2011);

        Author author1 = new Author("Fyodor", "Dostoevsky");
        Book book1 = new Book(author1, "Demons", 2016);

        Author author2 = new Author("Steven", "King");
        Book book2 = new Book(author2, "11/22/63", 2011);


        System.out.println("Автор: " + book);
        System.out.println("Автор: " + book1);

        System.out.println(author.equals(author1));
        System.out.println(book.equals(book1));

        System.out.println(author.equals(author2));
        System.out.println(book.equals(book2));

    }

}