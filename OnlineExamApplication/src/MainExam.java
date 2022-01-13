import java.util.Scanner;
public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int ch=0;
		Question qarr[]=null;
		ExamInfo eobj=new ExamInfo();
		Answer aarr[]=null;
		
				//qarr=eobj.createQestion();				
				//eobj.display(qarr);
	             //	aarr=eobj.createAnswer();
			
				//eobj.displayAnswer(aarr);
				QestionThread t1=new QestionThread(eobj,qarr); 
				AnswerThread t2=new AnswerThread(aarr,eobj);
				t1.setPriority(1);
				t2.setPriority(2);
				
				t1.start();
				t2.start();
				
				
				//eobj.examResult(aarr);
				
				
				
				
			
			
				
	}


}
