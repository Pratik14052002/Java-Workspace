package javalogic;

public class Logic {
   public void factor(int n) 
   {
	int i;
	for(i=2;i<=n/2;i++)
	{
		if(n%2==0)
		{
		System.out.println(i);
		}
	}
  
   }
   public int factorail(int n)
   {
	int i,ans=1;
	for(i=0;i<=n;i++)
	{
		ans=ans*i;
	}
	return ans;
   }
   public void prime() {
	   
   }
   public void fibbo()
   {
	   
   }
   public void reversenumber()
   {
	   
   }
   public void sumofdigit() 
   {
	   
   }
   
}
