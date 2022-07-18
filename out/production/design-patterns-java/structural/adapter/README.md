# Adapter
It allows objects with incompatible interfaces to collaborate.

## Intent
As its description says, the adapter is a special object that converts the interface of one object \
so that another object can understand it.

## Solution provided
An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.

## How to implement
In its structure, an object adapter or a class adapter can be implemented, but using the object composition principle \
can be broadly used and be more flexible.

1. Declare the client interface and describe how clients communicate with the service.
2. Create the adapter class and make it follow the client interface.
3. Add a field to the adapter class to store a reference to the service object.
4. Implement all methods of the client interface in the adapter class.
5. Clients should use the adapter via the client interface.
