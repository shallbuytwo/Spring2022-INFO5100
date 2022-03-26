An interface is something that a class should implement. The interface doesn't contain any concrete implementaion, but rather a "declaration" of what should be implemented/supported. An interface cannot be instantiated, and a class "Implements" one or more interfaces.

An abstract class is a class that has the "abstract" keyword in its declaration, and the class has at least one method that is not implemented yet. And another class "Extends" this abstract class.

An abstract class can make its subclasses able to either override what is already implemented in the abstract class, or implement what is defined but not implemented in the abstract class. A interface, however, can only let other classes implement all of what it states.

A class can only "extend" from one abstract class, but can "implement" from multiple interfaces.
