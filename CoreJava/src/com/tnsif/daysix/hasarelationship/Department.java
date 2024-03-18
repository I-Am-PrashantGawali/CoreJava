package com.tnsif.daysix.hasarelationship;

public class Department {
		private String name;
		private int noEmp;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNoEmp() {
			return noEmp;
		}
		public void setNoEmp(int noEmp) {
			this.noEmp = noEmp;
		}
		
		
		
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Department(String name, int noEmp) {
			super();
			this.name = name;
			this.noEmp = noEmp;
		}
		@Override
		public String toString() {
			return "Department [name=" + name + ", noEmp=" + noEmp + "]";
		}
		
		
		
}
