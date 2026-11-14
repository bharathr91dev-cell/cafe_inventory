# Campus Cafe Inventory Management System

## Project Description

A Java console-based application developed to manage campus cafe inventory. It allows staff members to add products, display products, calculate stock value, calculate average prices, restock products, and duplicate existing products.

## Technologies Used

- Java
- JDK
- IntelliJ IDEA
- java.util.Scanner

## Assignment Questions and Answers

### 1. What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.

I predicted that the program would print `7 5.0 -126`, followed by `Two` and `Three`. The decimal part of 7.9 was removed during explicit casting, the integer 5 was automatically converted to 5.0, and converting 130 to a byte resulted in -126 due to byte overflow. The switch statement printed both Two and Three because there was no break statement.

### 2. What is the difference between the static variable totalProducts and the instance variable name?

The static variable `totalProducts` belongs to the Product class and is shared by all Product objects. The instance variable `name` belongs to an individual Product object, so every product can have its own name.

### 3. What does the copy constructor do, and why does changing p2.name not change p1.name?

The copy constructor creates a new Product object by copying the name, price, and quantity from an existing Product object. Since p1 and p2 are separate objects, changing the name of p2 does not affect the name of p1.

### 4. Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?

Java requires explicit casting because converting a double to an int may result in loss of decimal information. When `(int) average` is used, the decimal portion is removed, so 12.75 becomes 12.

## Project Files

- `Product.java` – Contains the Product class, constructors, and stock calculation methods.
- `Main.java` – Contains the menu-driven inventory management application.
- `Warmup.java` – Demonstrates Java type casting, byte conversion, and switch fall-through.
- `output.txt` – Contains the console output from the application testing session.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Ensure a standard JDK is configured.
3. Run `Main.java`.
4. Follow the console menu instructions.
