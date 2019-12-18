import example.entities.Author;
import example.services.AuthorService;

public  class Main{
public static  void main(String[] args)
{
    AuthorService authorService = new AuthorService();
    Author author = new Author();
    author.setFirstName("Stephen");
    author.setLastName("King");
    Author author2 = new Author();
    author2.setFirstName("Stephen2");
    author2.setLastName("King2");

    System.out.println(author2.toString());
    authorService.create(author);
    //authorService.getAll();
}
}
