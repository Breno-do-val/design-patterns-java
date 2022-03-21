# Command Design Pattern
Turns a request into a standalone object that contains all the information about the request.

## Intent
This design pattern aims to reduce the coupling between the GUI and business logic layers, following the principle of \
separation of concerns as a premise.

## Use case
It can be used for separation of business logic from UI when the user logs in, performing different tasks based upon \
this status.

## Solution provided
There should be a class for initiating requests where it triggers the Command.

The Command interface declares methods for executing and un-executing the Command.

Concrete Command implement various kinds of requests. It is not supposed to perform the work but instead pass the call \
to one of the business logic objects.

The Receiver is the one who does the hard work and the client creates and configures concrete command objects.

### UML Class diagram
!(classDiagram)[src/behavioral/command/class-diagram-command.png]
