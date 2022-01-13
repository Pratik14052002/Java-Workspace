
public class AnswerThread extends Thread {
	private Answer[] aarr;
	private ExamInfo eobj;
	
	public AnswerThread(Answer[] aarr, ExamInfo eobj) {
		this.aarr = aarr;
		this.eobj = eobj;
	}

	
	public void run()
	{
		synchronized(eobj)
		{
				aarr=eobj.createAnswer();
				eobj.enterAns();
				eobj.examResult(aarr);
				
			
		
		}
	}
	

}
