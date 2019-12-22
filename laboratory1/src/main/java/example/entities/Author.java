package example.entities;


import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "author_id")
    private long authorId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(name = "year_of_birth")
    private long yearOfBirth;

    public Author() {
    }


    public long getAuthorId() {
        return this.authorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public long getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(long yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Author)) return false;
        final Author other = (Author) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getAuthorId() != other.getAuthorId()) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        if (this.getYearOfBirth() != other.getYearOfBirth()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Author;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $authorId = this.getAuthorId();
        result = result * PRIME + (int) ($authorId >>> 32 ^ $authorId);
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final long $yearOfBirth = this.getYearOfBirth();
        result = result * PRIME + (int) ($yearOfBirth >>> 32 ^ $yearOfBirth);
        return result;
    }

    public String toString() {
        return "Author(authorId=" + this.getAuthorId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", yearOfBirth=" + this.getYearOfBirth() + ")";
    }
}