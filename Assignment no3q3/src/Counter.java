
public class Counter extends Thread {
   private Storage s1;
    int i=0;
  public Counter(Storage s1) 
  {	  
	  this.s1 = s1;
  }
  
  
  public void run()
  {
	  
	  synchronized(s1)
	  {


		  for( i=0;i<=5;i++)
		  {
			  s1.store(i);
			  //i++;
		  }
		  //int cnt=0;
		    
		    //s1=new Storage(cnt);
		  
		  // cnt++;
		  //}
	  }
 
  }

}
