package Exe1;

public class First1 {
		int EmpId;
		String EmpName;
		double EmpSalary;
		
		void setEmployee(int EmpIds,String EmpNames,double EmpSalarys){
			EmpId = EmpIds;
			EmpName = EmpNames;
			EmpSalary = EmpSalarys;
		}
		
		void display(){
			System.out.println("Employee Details");
			System.out.println("Employee Id is :"+EmpId);
			System.out.println("Employee Name is :"+EmpName);
			System.out.println("Employee Salary is :"+EmpSalary);
		}
	}

