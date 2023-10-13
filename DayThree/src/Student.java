//simple java or encapsulation
public class Student {//encapsulation->
    //Variable or data member
	private int id;
	private String name;
	//method
	void display()
	{
		System.out.println(id+" "+name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//toString
	
}
