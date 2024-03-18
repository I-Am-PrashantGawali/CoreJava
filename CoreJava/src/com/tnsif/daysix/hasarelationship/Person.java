package com.tnsif.daysix.hasarelationship;

public class Person {
		private String name;
		private long contactNo;
		private Address address;
		
		
		public Person() {
			super();
		}
		
		
		public Person(String name, long contactNo, Address address) {
			super();
			this.name = name;
			this.contactNo = contactNo;
			this.address = address;
		}
		
		
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
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", contactNo=" + contactNo + ", address=" + address + "]";
		}
		
		
}
