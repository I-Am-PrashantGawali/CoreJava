package com.tnsif.daysix.hasarelationship;

public class Address {
		private int number;
		private String city;
		private int pincode;
		
		//getter and setter
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		//parameterize constructor
		public Address(int number, String city, int pincode) {
			super();
			this.number = number;
			this.city = city;
			this.pincode = pincode;
		}
		
		//default constructor
		public Address() {
			super();
		}
		
		@Override
		public String toString() {
			return "Address [number=" + number + ", city=" + city + ", pincode=" + pincode + "]";
		}
		
		
}
