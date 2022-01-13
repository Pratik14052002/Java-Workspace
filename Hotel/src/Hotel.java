import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String vegmenu[]= {"a1","a2","a3","a4"};
		int  vegprice[]= {100,200,150,300};
		String starter[]= {"s1","s2","s3","s4"};
		int  sprice[]= {100,200,150,300};
		String nonvegmenu[]= {"n1","n2","n3","n4"};
		int  nonvegprice[]= {100,200,150,300};
		
		
		int k=0,ono=0,ch=0;
		int order[]=new int[10];
		do
		{
			System.out.println("-------Hotel app--------");
			System.out.println("Order no\n1-Vegmenue\n2-Price");
			System.out.println("----------------------------------");
			for(int i=0;i<vegmenu.length;i++)
			{
				System.out.println((i+1)+"\t\t"+vegmenu[i]);
			}
			System.out.println("Please Enter Order number:\n");
			ono=sc.nextInt();//4 2 1
			
	     order[k]=ono;
	     k++;
	     System.out.println("Do want to continue press 1:\n");
	     ch=sc.nextInt();
		}while(ch==1);
		float total=0,cgst=0,sgst=0,finaltotal=0;
		//calculation bill
		for(int i=0;i<k;i++)
		{
			System.out.println(order[i]);
			
		    total=total+vegprice[order[i]-1];
		}	
		cgst=total*0.06f;
		sgst=total*0.06f;
		finaltotal=total+cgst+sgst;
		
		for(int i=0;i<k;i++)
		{
			System.out.println((i+1)+"\t\t"+vegmenu[order[i]-1]+"\t\t"+vegprice[order[i]-1]+"\t\n");
		}
		System.out.println("-------------bill--------------");
		System.out.println("total is:"+total);
		System.out.println("cgst is:"+cgst);
		System.out.println("sgst is:"+sgst);
		System.out.println("final total is:"+finaltotal);
		

}
}