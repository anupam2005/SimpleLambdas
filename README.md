###### Java Lambda Basics

Lambda expression implements a functional interface.

A lambda expression is NOT another way of writing an anonymous class.

_What's a functional interface?_
1) It is an interface.
2) It has only one abstract method.
3) It may have as many static methods.
4) It may have as many default methods.
5) It may implement Object class methods.
6) It may or may not have annotation @functionalinterface 

_java.util.functions package is a set of functional interfaces.
Four categories:_
1) Supplier => Returns an object
2) Consumer => Accepts an object and does not return anything
3) Predicate => Accepts an object, do some testing on it and return boolean
4) Function => Accepts an object return another type of object

Bonus: Runnable Interface => Receives nothing, Return nothing. 
Only runs a logic. This is an old interface but, it is now considered a functional interface by definition.


_Lambda is not an instance of an anonymous class._
1. compiled byte code is different.
2. Lambdas use invokedynamic (introduced in java 7)
3. Lambda is faster than an anonymous class by 60x
4. It can even be faster.

_Avoid autoboxing/auto-unboxing (int to Integer) in java lambda expressions._
Frequent boxing & unboxing might not affect a small dataset. But, in large datasets or streams, it's an overhead.
To tackle this problem: specialized functional interfaces were added.
Example: 
IntPredicate
LongSupplier
IntFunction<T>
LongToIntFunction