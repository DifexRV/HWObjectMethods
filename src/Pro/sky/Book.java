package Pro.sky;

public class Book {
    private final Author authorName;
    private final String bookName;
    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return (getBookName()).equals(c2.getBookName());
    }

    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    public String toString() {
        return authorName.toString() + " Название книги: " + bookName + ". Год издания: " + publishingYear;
    }
}
