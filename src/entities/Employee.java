package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
		
	private String name;
		protected Integer hours;
		protected Double valuePerHour;
		
		List<Employee> employee = new ArrayList<>();
		
		public Employee() {
		}

		public Employee(String name, Integer hours, Double valuePerHour) {
			this.name = name;
			this.hours = hours;
			this.valuePerHour = valuePerHour;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHours() {
			return hours;
		}

		public void setHours(Integer hours) {
			this.hours = hours;
		}

		public Double getValuePerHour() {
			return valuePerHour;
		}

		public void setValuePerHour(Double valuePerHour) {
			this.valuePerHour = valuePerHour;
		}
		
		public void addEmployee(Employee e) {
			employee.add(e);
		}
		
		public void removeEmployee(Employee e) {
			employee.remove(e);
		}
		
		public double payment() {
			return valuePerHour * hours;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			System.out.println("PAYMENTS: ");
			for (Employee e : employee) {
				System.out.println(e.getName() + " - " + " $ " + e.payment());
			}
			return sb.toString();
		}
		
}
