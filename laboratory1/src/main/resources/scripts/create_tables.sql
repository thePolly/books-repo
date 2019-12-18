
DROP TABLE authors CASCADE ;
DROP TABLE books  ;

CREATE  TABLE Authors (
                          Author_ID INTEGER  PRIMARY KEY,
                          FirstName varchar(255),
                          LastName varchar(255),
                          YEAR_of_Birth INTEGER
);
CREATE TABLE Books (
                       Book_ID INTEGER   PRIMARY KEY,
                       Name varchar(255) NOT NULL,
                       Author INTEGER  REFERENCES Authors (Author_ID),
                       YEAR INTEGER ,
                       Genre  varchar(255),
                       Subject varchar(255),
                       Abstract varchar (2000)
);

alter table Authors  ADD  Books  INTEGER  REFERENCES Books (Book_ID);


DELETE FROM authors;
DELETE FROM books;

INSERT INTO emp (FirstName, LastName, YEAR_of_Birth) VALUES
    ('Joanne','Rowling' 1965),
    ('Stephen', 'King' 1947),
    ('Dan', 'Brown' 1964);
