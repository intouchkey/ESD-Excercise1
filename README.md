#Overview
Git hub repo: https://github.com/intouchkey/ESD-Excercise1

# Question B

A super class should be an
	- interface if the super class needs to have only the design and not the implementation (no concrete methods, only define method signatures)
	  This means that the derived classes only need structural inheritance. Interface should be used when the implementation of the
	  derived classes is completely different and have nothing in common.

	- abstract if the supler class needs to have a mix of design plan and pre-implementation (abstract and non abstract methods, static members)
	  This means that the dervied classes need behavioral inheritance. The inherited classes can use extend, or overwrite the implementation of the
	  methods in the super class.

	- concrete if the super class needs to have a full implementation of all the methods
		(concrete methods, no abstract methods or method signatures)

Additional note: Java allows multiple class inheritance for interface but not abstract class because
if two abstract classses have different implementation of same method, the compiler can't decide
which one to choose

# Question D

Polymorphism is a concept that refers to the definition of "many forms".
The methods are basically used to perform tasks that are different.
A type can behave differently depending on the kind of object that it is pointing to.

The code in question C is an example of polymorphism.

		OperationsCenter
		@Override
			public void showDepartmentDetails() {
			System.out.println("Operations Center Department " + name + ": " + numOfEmployees + " employees.");
		}

		TechnologyCenter
		@Override
			public void showDepartmentDetails() {
			System.out.println("Technology Center Department " + name + ": " + numOfEmployees + " employees.");
		}

showDepartmentDetails() method is overridden in subclass OperationsCenter and TechnologyCenter.

Polymorphism enables a child class to have different implementation for showDepartmentDetails()
that is already implemented in parent class (Department)

I have written more codes to explain two forms of polymorphism in Java.
There are two forms of Polymorphism in Java:
	- Overloading: Multiple methods with same name but different signature (different number/type of arguments)
		Example of method overloading:

		(Class KasikornBank)
		public double getInterest()
		public double getInterest(String accountType)

		-> same method name, different type of arguments

	- Overriding: Enables a child class to have different implementation for a method that is defined/implemented in parent class
		Example of method overriding:

		-> getInterest() method is overridden in subclass KasikornBank and KrungsiBank

