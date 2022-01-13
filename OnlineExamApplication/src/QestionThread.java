
public class QestionThread extends Thread{
	private ExamInfo eobj;
	private Question[] qarr;
	
	

	public QestionThread(ExamInfo eobj, Question[] qarr) {
		this.eobj = eobj;
		this.qarr = qarr;
	}



	public void run()
	{
		synchronized(eobj)
		{
			qarr=eobj.createQestion();				
			eobj.display(qarr);
		}
		
	}

}
