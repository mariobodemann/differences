CppConstructorsVsJavaConstructors
===================

Shows differences between constructors calling protected methods in C++ and Java.

Use "make" to build both sample projects and run them imideately. The output will be
which method gots called. For those two tests a method doSomething is called in each
constructor and it is printed whose implementation is called, the one from the 
super class, or the one from the child.

The difference shows to be that java does call overwritten methods in the constructor
and C++ does not. Possibly because in C++ the vtable gets created after the constructor
is called, and therefore in the constructor are only staticly accessable methods
available. 

In java at construction time the full hirearchy of overwritten methods is available.
