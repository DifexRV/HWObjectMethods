package Pro.sky;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return (getFirstName() + getSecondName()).equals(c2.getFirstName() + c2.getSecondName());
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName + secondName);
    }

    public String toString() {

        return firstName + " " + secondName;
    }

}
