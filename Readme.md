Simple JDBC Demo
================

This is a simple JDBC demo project in Eclipse that uses:

- Java 1.8 (or higher)
- SQLite-JDBC 3.8.7 (included)

It's designed to teach undergrads how to work with SQLite using JDBC. Therefore, it's not a well designed project nor a sample of how a real JDBC project should be structured.

The project source code (*src* folder) is structured as follows:

- The *sample.db.pojos* package contains three POJOs that represent a sample database for the managing the employees, departments and reports of an imaginary company.
- The *sample.db.graphics* package contains a class that can be used to open a new window and show an image inside it. It's used by other classes in this project.
- The *sample.db.jdbc* package contains several classes, each of them with a main method (and any helped method needed) that performs just one action over the database. Again, this is not how a real project should be built, but manages to isolate each action so they can be learned easily. The order at which these classes should be studied is shown in the *Learning Order* file inside the *doc* folder.

The database this project manages should be a file named *company.db* inside the *db* folder. This database can be created by running the *SQLCreate* class' main method.

The *lib* folder contains the SQLite-JDBC libraries.

The *photos* folder contains photos to play with BLOBs.

The *diagrams* folder contains E-R and UML diagramas for the database. They are provided in different formats.

To understand how this demo works you can check the following cheatsheets (available in [this repository](https://github.com/rgarciacarmona/Java-Database-Cheatsheets)):

- [JDBC Cheatsheet](https://github.com/rgarciacarmona/Java-Database-Cheatsheets/blob/master/JDBC%20Cheatsheet.md)
- [Date with Java-SQL-XML](https://github.com/rgarciacarmona/Java-Database-Cheatsheets/blob/master/Date%20with%20Java-SQL-XML.md)