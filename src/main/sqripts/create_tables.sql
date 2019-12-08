CREATE TABLE Books (
                       Book_ID INTEGER   PRIMARY KEY,
                       Name varchar(255) NOT NULL,
                       Author INTEGER  REFERENCES Authors (Author_ID),
                       YEAR INTEGER ,
                       Genre  varchar(255),
                       Subject varchar(255)
);
CREATE  TABLE Authors (
                         Author_ID INTEGER  NOT NULL PRIMARY KEY,
                         FirstName varchar(255),
                         LastName varchar(255),
                         YEAR_of_Birth INTEGER
);