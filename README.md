# Java Inheritance Employee Management

This repository demonstrates the concept of inheritance in Java through an employee management system that shows code reduction using Inheritance in JAVA. It includes classes for different types of employees, such as Analysts and Salespersons, showcasing salary raises and bonuses.

## Inheritance in Java

In Java, inheritance is achieved using the `extends` keyword. Subclasses inherit attributes and methods from their superclass, allowing them to access and utilize common functionalities. This promotes code reuse, as common behaviors can be defined in the superclass and reused across multiple subclasses.

## Overview

The repository consists of the following Java classes:
- `Employee`: Base(Super) class representing common attributes and behaviors of employees.
- `Analyst`: Subclass of `Employee` with additional methods for calculating annual bonuses.
- `SalesPerson`: Subclass of `Employee` with methods for managing commission percentages.

## Usage

To use this project:
1. Clone the repository: `git clone https://github.com/abhipatel35/java-inheritance-employee-management.git`
2. Navigate to the cloned directory: `cd java-inheritance-employee-management`
3. Compile the Java files: `javac *.java`
4. Run the desired class: `java <ClassName>`

## Example

```java
public static void main(String[] args) {
    Analyst analyst = new Analyst("John", 60000, 30);
    System.out.println("Analyst bonus: $" + analyst.calculateAnnualBonus());
}
