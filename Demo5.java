import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Clerk c= new Clerk();
		c.display();
		Developer d= new Developer();
		d.display();
		Manager m= new Manager();
		m.display();
		Tester t= new Tester();
		t.display();

	}

}
class Emp
{
	int id,age;
	String name;
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
  		id = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Enter Age:");
		age = sc.nextInt();
	}

}
class Clerk extends Emp
{
	int id,age;
        float salary= 20000;
	String name;
	String desig= "Clerk";
		void display()
	{
		System.out.println("=================Clerk Details===================");
		System.out.println("My Id: " +id);
		System.out.println("My Name: " +name);
		System.out.println("My Age:" +age);
		System.out.println("My Salary: " +salary);
		System.out.println("My Desig: " +desig);
	}

}
class Developer extends Emp
{
	int id,age;
        float salary= 20000;
	String name;
	String desig= "Developer";
		void display()
	{
		System.out.println("=================Developer Details===================");
		System.out.println("My Id: " +id);
		System.out.println("My Name: " +name);
		System.out.println("My Age:" +age);
		System.out.println("My Salary: " +salary);
		System.out.println("My Desig: " +desig);
	}

}
class Manager extends Emp
{
	int id,age;
        float salary= 20000;
	String name;
	String desig= "Manager";
		void display()
	{
		System.out.println("=================Manager Details===================");
		System.out.println("My Id: " +id);
		System.out.println("My Name: " +name);
		System.out.println("My Age:" +age);
		System.out.println("My Salary: " +salary);
		System.out.println("My Desig: " +desig);
	}

}
class Tester extends Emp
{
	int id,age;
        float salary= 20000;
	String name;
	String desig= "Tester";
		void display()
	{
		System.out.println("=================Tester Details===================");
		System.out.println("My Id: " +id);
		System.out.println("My Name: " +name);
		System.out.println("My Age:" +age);
		System.out.println("My Salary: " +salary);
		System.out.println("My Desig: " +desig);
	}

}


