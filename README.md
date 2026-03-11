Java Lambdas & Streams
Description: Practical implementation of Functional Programming in Java. This project demonstrates how to use Lambda expressions, the Streams API, and Functional Interfaces to write cleaner and more efficient code.

📌 Exercises
This project covers 8 core tasks:

Filtering: Extracting strings containing the letter 'o'.

Advanced Filtering: Extracting strings with 'o' and length > 5.

Lambdas: Printing a list of months using basic lambda syntax.

Method References: Printing the list using System.out::println.

Custom Interface: Implementing a @FunctionalInterface to return the value of Pi.

Sorting: Sorting a mixed list by string length (Ascending).

Reverse Sorting: Sorting the same list by string length (Descending).

String Reversal: Using a lambda to reverse a given string.

🛠 Technologies
Language: Java

Core API: Java Streams & Lambdas

🚀 Installation & Execution
Clone the repo:

Bash
git clone https://github.com/your-user/project-name.git
Compile and Run:
Open the project in your favorite IDE (IntelliJ/Eclipse) and run the Main.java file.

Testing:
Check the console output to verify the filtered lists and sorted results.

🧩 Technical Highlights
The code prioritizes Declarative Programming over traditional imperative loops.

Encapsulation: Used Functional Interfaces (PiValue, Reverse) to define behavior as objects.

Method References: Cleaned up the code by replacing s -> System.out.println(s) with System.out::println.

Stream Pipeline: Utilized .filter(), .map(), and .sorted() for efficient data transformation.
