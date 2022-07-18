# Strategy Design Pattern
It lets you define a family of algorithms, put each of them in a separate class, and make their objects interchangeable.

## Intent
This design pattern aims to reduce the complexity for choosing a different algorithm based on the context.

## Use case
Let's suppose that there are different cases to apply a different algorithm, the most common scenario is to use an \
IF statement for each use case to be using a different algorithm. Every time you need to add a new case, you are adding\
more complexity to that piece of code and also break some SOLID principles, such as SRP and OCP, because your class \
is not responsible for one use case, and you have to "open" you class for modification.

## Solution provided
The strategy pattern suggests that you take a class that does something specific in a lot of ways and extract all of \
these algorithms into separate classes called strategies.

## Structure
1 - The context maintains a reference to one of the concrete strategies and communicates with this object only via the \
strategy interface.
2 - The strategy interface is common to all concrete strategies and contains a method the context uses to execute the \
specific strategy.
3 - Concrete strategies implement different variations of an algorithm that context uses.
4 - The context calls the execution strategy method on the linked strategy object each time it needs to run the \
algorithm.
5 - The client creates a specific strategy object and passes it to the context.

### UML Class diagram
![strategy-design_pattern](https://user-images.githubusercontent.com/50167034/179615304-6901a374-200e-4461-8db8-c4610e02b11a.png)
