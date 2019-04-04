
public class T1 extends Thread{
	VariableHolder vh;
	public T1(VariableHolder vh) {
		this.vh = vh;
	}
	
	public void run() 
	{
		while (true)
		{
			vh.t1WantsToEnter = true;
			while (vh.favoredThread == 2)
			{
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				while (vh.t2WantsToEnter);
				vh.favoredThread = 1;
			}
			System.out.println("About to enter t1 critical section");
			System.out.println("In t1 critical section");//critical section code
			System.out.println("In t1 critical section");//critical section code
			System.out.println("In t1 critical section");//critical section code
			System.out.println("Exited t1 critical section");
			vh.t1WantsToEnter = false;
			//non critical code
		}
	}
	
	
}
