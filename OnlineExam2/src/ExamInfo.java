import java.util.Scanner;

public class ExamInfo {
	String[] str1=new String[2];
	String[] str2=new String[2];
	String[] str3=new String[2];
	Scanner sc=new Scanner(System.in);
	public Question[] createQestion()
	{
		Question[] qarr=new Question[2];
		
		//System.out.println("Enter Qestions");
		//System.out.println("Enter Question 1:");
		//str1[0]=sc.next();
		str1[0]="q1";
		//System.out.println("Enter Question 2:");
		//str1[1]=sc.next();
		str1[1]="q2";
		for(int i=0;i<str1.length;i++)
		{
			//str[0]="q1";
			//str[1]="q2";
			
			Question qobj=new Question(str1[i]);
			qarr[i]=qobj;
		}
		return qarr;
	}
	public void display(Question[] qarr)
	{
		//Question[] qarr=new ;
		
		//qarr[0].setSarr("sas");
		//qarr[1].setSarr("as");
		
		System.out.println("Qestion 1:"+qarr[0].getSarr());
		
		
		System.out.println("Qestion 2:"+qarr[1].getSarr());
		
		
	}
	public Answer[] createAnswer()
	{
	Answer[] aarr=new Answer[2];
	str2[0]="yes";
	str2[1]="yes1";
	for(int i=0;i<aarr.length;i++)
	{
		Answer aobj=new Answer(str2[i]);
		aarr[i]=aobj;
	}
	return aarr;
    }
	public void displayAnswer(Answer[] aarr )
	{
		System.out.println("Answer 1 is:"+aarr[0].getStr1());
		System.out.println("Answer 2 is:"+aarr[1].getStr1());
		
	}
	public void enterAns()
	{
		System.out.println("Enter ans for q1");
		str3[0]=sc.next();
        
		System.out.println("Enter ans for q2");
		str3[1]=sc.next();
	}
	public void examResult(Answer[] aarr)
	{
		
		for(int i=0;i<aarr.length;i++)
	{
			if(i==0)
			{
				System.out.println("Enter ans for q1");
			}
			else
			{
					System.out.println("Enter ans for q2");	
			}
		//if(aarr[0].getStr1()equals.(str3[i]))
			if(aarr[i].getStr1().equals(str3[i]))
		{
			System.out.println("Answer is correct");
		}
		else {
			System.out.println("Answer is false");
		}
		}
	}
	
	
}
