
public class Mainclass {

	public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub
    Instrument iobj[]=new Instrument[10];

    iobj[0]=new Piano();
    iobj[1]=new Flute();
    iobj[2]=new Guitar();
    iobj[3]=new Piano();
    iobj[4]=new Flute();
    iobj[5]=new Guitar();
    iobj[6]=new Piano();
    iobj[7]=new Flute();
    iobj[8]=new Guitar();
    iobj[9]=new Piano();
    
   // Instrument ins=null;
    display(iobj);
	}
	public static void display(Instrument[] iobj)
	{
		for(int i=0;i<iobj.length;i++)
		{
			if(iobj[i] instanceof Piano)
			{
				iobj[i].play();
				//System.out.println(iobj[i]);
			}
			else if(iobj[i] instanceof Flute)
			{
				iobj[i].play();
				//System.out.println(iobj[i]);
			}
			else if(iobj[i] instanceof Guitar)
			{
				iobj[i].play();
				//System.out.println(iobj[i]);
			}
		}
	}

}
