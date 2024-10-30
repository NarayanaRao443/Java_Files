/*
// Single Inheritance
class Animals
{
	void displayA()
	{
		System.out.println("Parent - Animal Class");
	}
}
class Dog extends Animals
{
	void displayD()
	{
		System.out.println("Child - Dog Class");
	}
}
	
class SII
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.displayA();
		d.displayD();
	}
}
*/
/*
	// Multilevel Inheritance
class Animals
{
	void displayA()
	{
		System.out.println("Parent - Animal Class");
	}
}
class Dog extends Animals
{
	void displayD()
	{
		System.out.println("Child - Dog Class");
	}
}

class Labrodar extends Dog
{
	void displayL()
	{
		System.out.println("Labrodar-----Child of  Dog Class");
	}
}

	
class SII
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.displayA();
		d.displayD();

		Labrodar l = new Labrodar();
		l.displayA();
		l.displayD();
		l.displayL();
	}
}
*/
/*
// Heirarchical Inheritance
class Animals
{
	void displayA()
	{
		System.out.println("Parent - Animal Class");
	}
}
class Dog extends Animals
{
	void displayD()
	{
		System.out.println("Child - Dog Class");
	}
}

class Labrodar extends Animals
{
	void displayL()
	{
		System.out.println("Labrodar-----Child of  Dog Class");
	}
}

	
class SII
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.displayA();
		d.displayD();

		Labrodar l = new Labrodar();
		l.displayA();
		//l.displayD();
		l.displayL();
	}
}
*/
// Hybrid Inheritance

class Animals
{
	void displayA()
	{
		System.out.println("Parent - Animal Class");
	}
}
class Dog extends Animals
{
	void displayD()
	{
		System.out.println("Child - Dog Class");
	}
}

class Labrodar extends Dog
{
	void displayL()
	{
		System.out.println("Labrodar-----Child of  Dog Class");
	}
}

class Husky extends Dog
{
	void displayH()
	{
		System.out.println("Husky-----Child of  Dog Class");
	}
}
	
class SII
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.displayA();
		d.displayD();

		Labrodar l = new Labrodar();
		l.displayA();
		l.displayD();
		l.displayL();

		Husky h = new Husky();
		h.displayA();
		h.displayD();
		//h.displayL();
		h.displayH();
	}
}


// Abstraction
/*

abstract class Parts
{
	String n;
	Parts(String n)
	{
		this.n = n;
	}
	abstract void function();
	void f()
	{
		System.out.println(n);
	}
}

class Brakes extends Parts
{
	Brakes(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("Car stopped");
	}
}

class SII
{
	public static void main(String args[])
	{
		Brakes b = new Brakes("Brakes called");
		b.function();
		b.f();
	}
}

*/

// Interface
/*
interface Printable
{
	int a=10;
	void Print();
}
interface Showable
{
	int b=50;
	void Show();
}

class SII implements Printable,Showable
{
	public void Print()
	{
		System.out.println("Printed");
	}
	public void Show()
	{
		System.out.println("Showed");
	}
	
	public static void main(String args[])
	{
		SII s = new SII();
		s.Print();
		s.Show();
		
		System.out.println(s.a);
		System.out.println(s.b);
	}
}
*/

// Encapsulaiton
/*
class SII
{
	
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	public void setName(String n)
	{
		this.name =  n;
	}
	public void setAge(int n)
	{
		this.age = n;
	}
	public static void main(String args[])
	{
	}
}	

*/

// Method Overloading
/*
class SII
{
	static int addition(int a, int b)
	{
		return a+b;
	}
	static int addition(int a, int b, int c)
	{
		return a+b+c;
	}
	static double addition(double a, double b, double c)
	{
		return a+b+c;
	}

	public static void main(String args[])
	{
		System.out.println(addition(10.5,50.8,20.2));
		System.out.println(addition(10,50,100));
		System.out.println(addition(10,50));
	}
}

*/

// Method Overriding
/*
class Animal
{
	static void run1()
	{
		System.out.println("H----Animal is running");
	}
	void run2()
	{
		System.out.println("O----Animal is running fast");
	}
		
}
class Cheetah extends Animal
{
	static void run1()
	{
		System.out.println("H---Cheetah is running");
	}
	void run2()
	{
		System.out.println("O----Cheetah is running fast");
	}
}
class SII
{
	public static void main(String args[])
	{
		Animal a = new Cheetah();
		a.run1();
		a.run2();
	}
}
*/