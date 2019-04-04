
public class MutualExclusionAlgorithm {
	
	/*
	                                                  Part 1:
            			T1                                                                   T2 
            			
1)	                                                                                        void main()
2)	                                                                                     	{
3)	                                                                                        	while(!done)
4)	                                                                                          	 {
5)	                                                                                             	t2WantsToEnter = true();
6)	                                                                                                while(favoredThread == 1)
7)	                                                                                               	{
8)	                                                                                               		while(t1WantsToEnter);
9)	void main()
10)	{
11)		while(!done)
12)	   	{
13)	    	t1WantsToEnter = true;
14)	       	while(favoredThread == 2)
15)	                                                                                               		favoredThread = 2;
16)	                                                                                                }
17)			                                                                                        //critical section code                                                                                
18)	        //critical section code


                                                       Part 2:
                         T1                                                                 T2  
                                                     
1)	void main()
2)	{
3)		while(!done)
4)	   	{
5)	    	t1WantsToEnter = true;
6)	        while(favoredThread == 2)
7)	        //critical section code
8)	                                                                                       	void main()
9)	                                                                                       	{
10)	                                                                                        	while(!done)
11)	                                                                                           	{
12)	                                                                                           		t2WantsToEnter =true;
13)	                                                                                                while (favoredThread == 1)
14)	                                                                                                {
15)	                                                                                               		 while (t1WantsToEnter);
16)	       	t1WantsToEnter = false;
17)	       	//non critical code
18)		while(!done)
19)	    {
20)	        t1WantsToEnter = true;
21)	        while(favoredThread == 2)
22)	        //critical section code
23)	                                                                                                  	 while (t1WantsToEnter);

	      */
	
	public static void main (String[] args) 
	{
		VariableHolder vHolder = new VariableHolder();
		T1 t1 = new T1(vHolder);
		T2 t2 = new T2(vHolder);
		t1.start();
		t2.start();
		
		
	}
}
	/* 
	    output with and without mutual exclusion:
Entering t1 critical section
In t1 critical section
Exiting t1 critical section
Entering t1 critical section
In t1 critical section/////////////////////////////////////////////////////////////////////////
Entering t2 critical section///////////////////////////////////////////////////////////////////
In t2 critical section
Exiting t2 critical section
Entering t2 critical section
In t2 critical section
Exiting t2 critical section
	    
	    
	    
	    
	   
	 
	 */

