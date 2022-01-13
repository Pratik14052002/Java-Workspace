import java.util.Scanner;

public class BankInfo {
	Scanner sc=new Scanner(System.in);
	int n=0,i=0;
	String bt;
	int bprice;
	
	public Book[] createBook() {
		System.out.println("Enter number of books you want");
		n=sc.nextInt();
		Book barr[]=new Book[n];
		for(i=0;i<n;i++)
		{
		System.out.println("Enter Book title and Book Price:");
		bt=sc.next();
		bprice=sc.nextInt();
	    Book bobj=new Book(bt,bprice);
	    barr[i]=bobj;
		}
		return barr;
	}
	public void showBooks(Book[] barr) {
		for(i=0;i<n;i++)
		{
		System.out.println("Book Title:"+barr[i].getBookTiltle());
		System.out.println("Book Price:"+barr[i].getBookPrice());
		}
	}

}
