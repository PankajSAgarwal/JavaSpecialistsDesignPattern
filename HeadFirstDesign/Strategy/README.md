## Design Principles

1) Identify the aspects of  your application that vary and seperate them from what stays the same .

Take what varies and <b>"encapsulate"</b> it so it wont affect the rest of your code.

2) Program to an interface/supertype , not an implementation .

3) Favour composition over inheritance. Composition not only lets encapsulate a family of algorithms into their own set of classes , but it also let you change behaviour at run time as long as the object your are composing with implements the correct behaviour interface.

## Good OO designs are reusable,extensible and maintainable
## Patterns show you how to build systems with with good OO design qualities.

## Strategy Pattern

<b>The Strategy pattern defines a family of algorithms , encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.</b>