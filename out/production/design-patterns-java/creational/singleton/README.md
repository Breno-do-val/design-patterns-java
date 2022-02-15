# Singleton
It is a creational design pattern that lets you ensure that a class has only one instance,\
while providing a global access point to this instance.

## Intent
1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.

## Solution provided
All implementations of the Singleton have these two steps in common:
- Make the default constructor private, to prevent other objects from using the new operator.
- Create a static creation method that acts as a constructor.

## How to implement
Firstly, it is needed to hide the constructor and provide a method for creating an instance, and also a private field\
for storing the first created instance.