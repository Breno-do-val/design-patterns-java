# Chain of responsibility design pattern
Also known as: COR, Chain of Command

## Intent
It's a behavioral design pattern that lets you pass requests along a chain of handlers.\
Upon receiving a request, each handler decides either to act or to pass the request to the next handler.

## Use case
It is helpful when you want to replace a chain of IF statements, it reduces the complexity of your code.

## Solution provided
It relies on transforming particular behaviors into stand-alone objects called handlers, following the SOLID principle,
the Single Responsibility Principle, where a class has only one concern.
