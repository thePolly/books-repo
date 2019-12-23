
DROP TABLE authors CASCADE ;
DROP TABLE books  ;

CREATE  TABLE authors (
                          author_id integer PRIMARY KEY,
                          first_Name varchar(255),
                          last_name varchar(255),
                          year_of_birth integer
);
CREATE TABLE books (
                       Book_ID INTEGER  PRIMARY KEY,
                       Name varchar(255),
                       YEAR INTEGER ,
                       Summary varchar (2000),
                    author_id integer,
                    FOREIGN KEY (author_id) REFERENCES authors (author_id)
);

DELETE FROM authors;
DELETE FROM books;

INSERT INTO authors (author_id, first_Name, last_name, year_of_birth) VALUES
(1,'Joanne','Rowling', 1965),
(2,'Stephen', 'King', 1947),
(3,'Dan', 'Brown' ,1964);

INSERT INTO books (Book_ID, Name, YEAR, Summary, author_id) VALUES
(
(1, 'Harry Potter and the Philosophers Stone',
'When mysterious letters start arriving on his doorstep, Harry Potter has never heard of Hogwarts School of Witchcraft and Wizardry.

They are swiftly confiscated by his aunt and uncle.

Then, on Harry’s eleventh birthday, a strange man bursts in with some important news: Harry Potter is a wizard and has been awarded a place to study at Hogwarts.

And so the first of the Harry Potter adventures is set to begin.', 1)

);