package practice.seleniumPractice;

public class GoogleThreadClass extends Thread
{
	public String browserName;
	GooglePageClass googlePage;
	
	public GoogleThreadClass(String threadName, String browserName)
	{
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePageClass();
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
			googlePage.setup(this.browserName);
			googlePage.googleSearch();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*finally
		{
			//googlePage.tearDown();
			//System.out.println("Thread Name : "+Thread.currentThread().getName());
		}*/
	}
}
