import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		//nextInt()
		//nextFloat()
		//nextDouble()
		//next() /nextLine()
		String name=sc.nextLine();
		System.out.println("Enter your gender");
		String gender=sc.next();
		System.out.println("Enter your age");
	    int age=sc.nextInt();
		System.out.println("Enter your income");
		int income=sc.nextInt();
		
		Person p=new Person();
//		p.setName(name);
//		p.setGender(gender);
//		p.setAge(age);
//		p.setIncome(income);
//		
		System.out.println("Before Tax calculation");
		System.out.println(p);
		
		TaxCalculation tc =new TaxCalculation();
		tc.calculateTax(p);
		
		System.out.println("After Tax calculation");
		System.out.println(p);
	}
}
