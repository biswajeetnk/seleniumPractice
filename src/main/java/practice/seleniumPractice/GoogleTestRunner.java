package practice.seleniumPractice;

public class GoogleTestRunner
{
	public static void main(String[] args)
	{
		Thread t1 = new GoogleThreadClass("Chrome Thread", "chrome");
		//this is top-casting -> child class object is referenced
		//by parent class reference variable.
		//Thread class is parent class of GoogleThreadClass
		
		Thread t2 = new GoogleThreadClass("Chrome Thread", "chrome");
		System.out.println("Thread starts");
		
		t1.start();
		t2.start();
	}
}
