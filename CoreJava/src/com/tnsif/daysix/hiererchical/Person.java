//program to define parent class Person
package com.tnsif.daysix.hiererchical;

public class Person {
		private String name;
		private long contactNo;
		private String city;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public Person() {
			super();
		}
		
		public Person(String name, long contactNo, String city) {
				super();
				this.name=name;
				this.contactNo=contactNo;
				this.city=city;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", contactNo=" + contactNo + ", city=" + city + "]";
		}
		
		
}
