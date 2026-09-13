Assignment 1 — Builder Pattern

About the Project

This project demonstrates the implementation of the Builder creational design pattern in Java.

The product in this project is a Car. The Builder pattern is used to construct different car configurations step by step while keeping the object creation process readable, flexible, and easy to maintain.

The project contains two different concrete builders:

SportsCarBuilder

FamilyCarBuilder

It also includes a Director class for reusable construction sequences and a Main class that demonstrates how the pattern works.

Project Structure

src/                                                                                                                                                              
    builder/                                                                                                                                                       
        Car.java                                                                                                                                                  
        CarBuilder.java                                                                                                                                            
        BaseCarBuilder.java                                                                                                                                        
        SportsCarBuilder.java                                                                                                                                      
        FamilyCarBuilder.java                                                                                                                                      
        Director.java                                                                                                                                              
        Main.java


Main Components

Car — Product that is being constructed.

CarBuilder — Builder interface that defines the construction steps.

BaseCarBuilder — Abstract base builder that contains shared builder logic.

SportsCarBuilder — Concrete Builder for sports cars.

FamilyCarBuilder — Concrete Builder for family cars.

Director — Defines reusable construction sequences.

Main — Client that demonstrates the Builder pattern.

Car Representations

Sports Car

The SportsCarBuilder creates a sports car with default characteristics such as:

Type: SPORTS

Engine: V8 4.0L

Seats: 2

Transmission: 8-speed Automatic

GPS: enabled

Sunroof: disabled by default

Example:

Car sportsCar = new SportsCarBuilder().build();

Family Car

The FamilyCarBuilder creates a family car with default characteristics such as:

Type: FAMILY

Engine: 2.5L Hybrid

Seats: 7

Transmission: CVT

GPS: enabled

Sunroof: enabled by default

Example:

Car familyCar = new FamilyCarBuilder().build();

Method Chaining

The builders support method chaining (fluent API). Each setter returns the builder itself, which allows several construction steps to be written in one chain.

Example:

Car customSportsCar = new SportsCarBuilder()
        .setEngine("V6 3.0L Twin Turbo")
        .setSeats(2)
        .setTransmission("7-speed Automatic")
        .setGPS(true)
        .setSunroof(false)
        .build();

Director

The Director class defines reusable construction sequences.

For example:

Director director = new Director();

Car premiumCar = director.buildPremiumCar(
        new SportsCarBuilder()
);

The Director is optional. A client can also use a builder directly without a Director.

Example:

Car car = new FamilyCarBuilder()
        .setGPS(true)
        .setSunroof(true)
        .build();

Validation

The builder validates important values before creating the final product.

Examples of validation include:

The engine name cannot be empty.

The transmission name cannot be empty.

The number of seats must be within the allowed range.

If invalid data is provided, the program throws a clear exception.

How to Run

Requirements

Java JDK 17

IntelliJ IDEA or another Java IDE

Git

Steps

Clone the repository.

Open the project in IntelliJ IDEA.

Make sure Java JDK 17 is selected.

Open Main.java.

Run the main() method.

Example Output

Sports car:
Car{type=SPORTS, engine='V8 4.0L', seats=2, transmission='8-speed Automatic', gps=true, sunroof=true}

Family car:
Car{type=FAMILY, engine='2.5L Hybrid', seats=7, transmission='CVT', gps=false, sunroof=false}

Custom sports car:
Car{type=SPORTS, engine='V6 3.0L Twin Turbo', seats=2, transmission='7-speed Automatic', gps=true, sunroof=false}

Technologies

Java 17

IntelliJ IDEA

Git

GitHub
