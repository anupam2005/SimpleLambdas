###### Java Lambda Basics

Lambda expression implements a functional interface.

A lambda expression is NOT another way of writing an anonymous class.

What's a functional interface?
1) It is an interface.
2) It has only one abstract method.
3) It may have as many static methods.
4) It may have as many default methods.
5) It may implement Object class methods.
6) It may or may not have annotation @functionalinterface 

java.util.functions package is a set of functional interfaces.
Four categories:
1) Supplier => Returns an object
2) Consumer => Accepts an object and does not return anything
3) Predicate => Accepts an object, do some testing on it and return boolean
4) Function => Accepts an object return another type of object

Bonus: Runnable Interface => Receives nothing, Return nothing. 
Only runs a logic. This is an old interface but, it is now considered a functional interface by definition.