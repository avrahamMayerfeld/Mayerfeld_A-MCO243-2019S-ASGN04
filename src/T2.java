
public class T2 extends Thread{
	VariableHolder vh;
	public T2(VariableHolder vh) {
		this.vh = vh;
	}
	
	public void run() 
	{
		while (true)
		{
			vh.t2WantsToEnter = true;
			while (vh.favoredThread == 1)
			{
				while (vh.t1WantsToEnter);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				vh.favoredThread = 2;
			}
			System.out.println("About to enter t2 critical section");
			System.out.println("In t2 critical section");//critical section code
			System.out.println("In t2 critical section");//critical section code
			System.out.println("In t2 critical section");//critical section code
			System.out.println("Exited t2 critical section");
			vh.t2WantsToEnter = false;
			//non-critical code
		}
	}
}
