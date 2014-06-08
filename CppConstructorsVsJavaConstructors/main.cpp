#include <iostream>

using namespace std;

class Parent
{
protected:
	virtual void doSomething() 
	{
		cout << "parents doSomething" << endl;
	}

public:
	Parent() 
	{
		cout << "constructor ";
		doSomething();
	}

	virtual ~Parent()
	{
	}

	virtual void callIt()
	{
		doSomething();
	}
};

class Child : public Parent
{
protected:
	virtual void doSomething() 
	{
		cout << "childs doSomething" << endl;
	}

public:
	Child() 
	{
		cout << "constructor ";
		doSomething();
	}

	virtual ~Child()
	{
	}
};

int main(int argc, char** argv)
{
	cout << "Parent:" << endl;
	Parent parent;
	parent.callIt();

	cout << endl << "Child:" << endl;
	Child child;
	child.callIt();
	return 0;
}
