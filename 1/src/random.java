import java.math.*;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int random1=0;
			int random2=0;
			int random3=0;
			int random4=0;
			int random5=0;
			int random6=0;
		while((random1<1)||(random1>9))
		{
			random1=(int)(Math.random()*9+1);
		}
		while((random2<1)||(random2>9))
		{
		random2=(int)(Math.random()*9+1);
		}
		while((random3<1)||(random3>9))
		{
		random3=(int)(Math.random()*9+1);
		}
		while((random4<1)||(random4>9))
		{
		random4=(int)(Math.random()*9+1);
		}

		while((random5<1)||(random5>9))
		{
			random5=(int)(Math.random()*9+1);
		}
		while((random6<1)||(random6>9))
		{
			random6=(int)(Math.random()*9+1);
		}
		int accNo[]= {random1,random2,random3,random4,random5,random6};
for(int i=0;i<accNo.length;i++)
{
	System.out.print(accNo[i]);
}

	}

}
