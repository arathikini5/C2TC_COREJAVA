//Inheritance
//Access modifier-Public ,Private ,default,protected
//Local variable
//primitive and non primitive->
//
public class CustomerDemo {
	public static void main(String[]args)
	{
		Customer c=new Customer();
//		c.customerId=1;
//		c.customerName="Arathi";
//		c.customerAdress="Udupi";
		c.setCustomerId(1);
		c.setCustomerName("Arathi");
		c.setCustomerAddress("Udupi");
		
		//System.out.println(c.customerId+" "+c.customerName+" "+c.customerAddress);
		System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getCustomerAddress());
	}
	
}
