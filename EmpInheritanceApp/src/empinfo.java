import java.util.Scanner;

public class empinfo {
    
	Scanner sc=new Scanner(System.in);
	int eid;
	String enm;
	int bo;
	int nhr;
	
	int i;
	
	//Manager m1=null;
	//Devloper d1=null;
	
	/*public  Manager[] create1(int n)
	{
	
	 Manager marr[]=new Manager[n]; 
	 for(i=0;i<marr.length;i++) {
	 System.out.println("Enter Manager Id,NAme,Bonus");
	 eid=sc.nextInt();
	 enm=sc.next();
	 bo=sc.nextInt();
	 Manager m1=new Manager(eid,enm,bo);
	 marr[i]=m1;
	
	 }
	 return marr;
	}
	public Devloper[] create2(int n) 
	{
		
		 Devloper darr[]=new Devloper[n];
		 for(i=0;i<darr.length;i++)
		 {
		System.out.println("Enter Devloper Id,NAme,Number of hour ");
		eid=sc.nextInt();
		enm=sc.next();
		nhr=sc.nextInt();
		Devloper d1=new Devloper(eid,enm,nhr);
		darr[i]=d1;
		 }
		return darr;
	}*/
	
	

	public Manager[] create1(int n)
	{	
		Manager marr[]=new Manager[n];
		for(i=0;i<n;i++)
		 {
		 System.out.println("Enter Manager Id,NAme,Bonus");
		 eid=sc.nextInt();
		 enm=sc.next();
		 bo=sc.nextInt(); 
		 Manager m1=new Manager(eid,enm,bo);
		 marr[i]=m1;
		 
		 }
		return marr;
		 
	}
	public Devloper[] create2(int n)
	{
		Devloper darr[]=new Devloper[n];
		for(i=0;i<n;i++)
		 {
		 
		 System.out.println("Enter Devloper Id,NAme,Number of hour ");
	     eid=sc.nextInt();
		 enm=sc.next();
		 nhr=sc.nextInt();
		 Devloper d1=new Devloper(eid,enm,nhr);
		 darr[i]=d1;
		 }
		 return darr;
		 
	}
	public void display(Employee[] eobj1,Employee []eobj2,String str1,String str2)
	{   
		int i;
		
		//Manager m=(Manager)eobj;
		for(i=0;i<eobj1.length;i++)
		if(eobj1[i] instanceof Manager)
		{
	     Manager mobj=(Manager)eobj1[i];
	    
	    System.out.println("-----------------Manager Details-----------");
		System.out.println(str1+" Id:"+mobj.getEmpId());
		System.out.println(str1+" Name:"+mobj.getEmpNAme());
		System.out.println(str1+" bonus:"+mobj.getBonus());
	    }
	    
		
		for(i=0;i<eobj2.length;i++)
		{
		if(eobj2[i] instanceof Devloper)
		{   
			
			 Devloper dobj1=(Devloper)eobj2[i];
			
			System.out.println("-----------------Devloper Detials------------");
			System.out.println(str2+"Id:"+dobj1.getEmpId());
			System.out.println(str2+"Name:"+dobj1.getEmpNAme());
			System.out.println(str2+"Name:"+dobj1.getNoHr());
			}
			
		  }
		}
	}
	



