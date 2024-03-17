package com.tnsif.daysix.hiererchical;

public class Employee extends Person {
		private int empId;
		private float salary;
		public Employee() {
			super();
		}
		public Employee(String name, long contactNo, String city) {
				super(name, contactNo, city);
		}
		public Employee(String name, long contactNo, String city, int empId, float salary) {
				super(name, contactNo, city);
				this.empId=empId;
				this.salary=salary;
		}
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", salary=" + salary + ", toString()=" + super.toString() + "]";
		}
		

}
