
public class MainMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int random;
		Medicine mobj[]=new Medicine[10];
		for(i=0;i<mobj.length;i++)
		{
			random=0;
			while((random<1)||(random>3))
			{
				random=(int)(Math.random()*3+1);
				
			}
			/*switch(random)
			{
			case 1:
				mobj[i]=new Tablet();
				break;
			case 2:
				mobj[i]=new Syrup();
				break;
			case 3:mobj[i]=new Onitement();
				break;
				
			}*/
			if(random==1)
			{
			System.out.println("random number for Firstcalss:"+random);
					mobj[i]=new Tablet();
					System.out.println("object#"+(i+1)+"");
					mobj[i].displayLabel();
					
			}
			else if(random==2) {
				System.out.println("random number for General:"+random);
				mobj[i]=new Syrup();
				System.out.println("object#"+(i+1)+"");
				mobj[i].displayLabel();
	
			}
			else if(random==3) {
				System.out.println("random number for Luggage:"+random);
				mobj[i]=new Onitement();
				System.out.println("object#"+(i+1)+"");
				mobj[i].displayLabel();
		
				
			}
			//mobj[i].displayLabel();
		}

	}

}
