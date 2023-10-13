
public class Customer {
	//Instance variable
//  private int customerId;
//  private String customerName;
//  private String address;
  
  int customerId;
  String customerName;
  String customerAddress;
  
  //user defined non argumented/parameterized constructor
  public Customer()
  {
	  
  }
  //parameterized
  public Customer(int id,String name,String city)
  {
	  
  }
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
  
}
