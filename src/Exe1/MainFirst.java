package Exe1;
import java.util.Scanner;

public class MainFirst {
public static void main(String args[]){
		
		First1 E;
		E = new First1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your ID :");
		int EmpId = sc.nextInt();
		
		System.out.println("Enter your Name :");
		String EmpName = sc.next();
		
		System.out.println("Enter your Salary :");
		double EmpSalary = sc.nextDouble();
		
		E.setEmployee(EmpId,EmpName,EmpSalary);
		//E.setEmployee();
		E.display();
	}
}
