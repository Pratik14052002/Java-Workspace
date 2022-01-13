
public class TestComapartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment cobj[]=new Compartment[10];
		int random=0;
		for(int i=0;i<10;i++)
		{
			random=0;
			while((random<1)||(random>4))
			{
				random=(int)(Math.random()*4+1);
				
			}
			/*switch(random)
			{
			case 1:
				//cobj[i].notice();
				cobj[i]=new Firstclass();
				break;
			case 2:
				//cobj[i].notice();
				cobj[i]=new General();
				break;
				
			case 3:
				//cobj[i].notice();
				cobj[i]=new Ladies();
				break;
			case 4:
				//cobj[i].notice();
				cobj[i]=new Luggage();
				break;
			}*/
			if(random==1)
			{
			System.out.println("random number for Firstcalss:"+random);
					cobj[i]=new Firstclass();
					System.out.println("object#"+(i+1)+"");
					cobj[i].notice();
					
			}
			else if(random==2) {
				System.out.println("random number for General:"+random);
				cobj[i]=new General();
				System.out.println("object#"+(i+1)+"");
				cobj[i].notice();
	
			}
			else if(random==3) {
				System.out.println("random number for Luggage:"+random);
				cobj[i]=new Luggage();
				System.out.println("object#"+(i+1)+"");
				cobj[i].notice();
		
				
			}
			else if(random==4) {
				System.out.println("random number for Ladies:"+random);
				cobj[i]=new Ladies();
				System.out.println("object#"+(i+1)+"");
				cobj[i].notice();
				
				
			}
			
			
			
			}	
			
			
			
		}
		

	}
	/*public static void display(Compartment []cobj)
	{
		for(int i=0;i<cobj.length;i++)
		{
			if(cobj[i] instanceof Firstclass)
			{
				cobj[i].notice();
				
			}
			else if(cobj[i] instanceof General)
			{
				cobj[i].notice();
			}
			if(cobj[i] instanceof Ladies)
			{
				cobj[i].notice();
			}
			if(cobj[i] instanceof Luggage)
			{
				cobj[i].notice();
			}
		}
	}*/


