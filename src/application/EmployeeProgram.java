package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(Character.toLowerCase(ch) == 'y') {				
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.addEmployee(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.addEmployee(emp);
			}
		}
		
		System.out.println();
		
		System.out.println(employee);
		
		
		sc.close();
	}

}
