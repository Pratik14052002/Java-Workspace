
public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer  cust=null;
		cust=create();
		display(cust); 
	}
	public static Customer create()
	{
		Product prod=new Product(10,"Laptop",5000,2); 
		Address add=new Address("mumbai","Maharashtra","412208");
        Customer cust=new Customer(101,"Pratik","979879",prod,add);
        return cust;
        
        }
	public static void display(Customer cust) 
	{
		System.out.println("------------Customer Detils----------");
		System.out.println("Customer Id:"+cust.getCusId());
		System.out.println("Customer Name:"+cust.getCusName());
		System.out.println("Customer Mobile number:"+cust.getCusMob());
		System.out.println("-------------Product Details----------");
		System.out.println("Product Id:"+cust.getProd().getProdId());
		System.out.println("Product Name:"+cust.getProd().getProdName());
		System.out.println("Produt Price:"+cust.getProd().getProdPrice());
		System.out.println("Product quntity:"+cust.getProd().getProdQty());
	}

}
