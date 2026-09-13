Assignment 1 — Builder Pattern

About the Project

This project demonstrates the implementation of the Builder creational design pattern in Java. The product in this project is a Car. The Builder pattern is used to construct different car configurations step by step while keeping the object creation process readable and flexible.

The project contains two concrete builders: SportsCarBuilder and FamilyCarBuilder. It also includes a Director class that provides reusable construction sequences and a Main class that demonstrates how the pattern works.

Project Structure

The project contains the Car, CarBuilder, BaseCarBuilder, SportsCarBuilder, FamilyCarBuilder, Director and Main classes inside the builder package.

Main Components

Car is the product that is being constructed. CarBuilder is the builder interface that defines the construction steps. BaseCarBuilder is an abstract base builder that contains shared builder logic. SportsCarBuilder is a concrete builder for sports cars, while FamilyCarBuilder is a concrete builder for family cars. Director defines reusable construction sequences, and Main acts as the client that demonstrates the Builder pattern.

Car Representations

SportsCarBuilder creates a sports car with default characteristics such as a V8 4.0L engine, 2 seats, an 8-speed automatic transmission and GPS.

FamilyCarBuilder creates a family car with a 2.5L Hybrid engine, 7 seats, a CVT transmission, GPS and a sunroof.

Method Chaining

The builders support method chaining, also called a fluent API. Each setter returns the builder itself, which makes it possible to configure a car step by step in one chain and then call build() to create the final object.

Director

The Director class defines reusable construction sequences. It can create predefined configurations such as basic or premium cars by working with the CarBuilder interface. The Director is optional, so a client can also use a builder directly.

Validation

The builder validates important values before creating the final Car object. The engine and transmission cannot be empty, and the number of seats must be within the allowed range. If invalid data is provided, the program throws an exception.

How to Run

The project requires Java JDK 17 and IntelliJ IDEA or another Java IDE. To run the project, open it in IntelliJ IDEA, make sure JDK 17 is selected, open Main.java and run the main method.

Example Output

The program creates and prints a sports car, a family car and a custom sports car with different configurations.

Technologies

The project uses Java 17, IntelliJ IDEA, Git and GitHub.
