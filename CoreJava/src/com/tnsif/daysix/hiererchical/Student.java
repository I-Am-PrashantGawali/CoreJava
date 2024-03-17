package com.tnsif.daysix.hiererchical;

public class Student extends Person{
		private int rollNo;
		private float per;
		private String clas;

		public Student() {
			super();
			
		}
		
		public Student(String name, long contactNo, String city) {
				super(name, contactNo, city);
		}
		
		public Student(String name, long contactNo, String city, int rollNo, float per, String clas) {
				super(name, contactNo, city);
				this.rollNo=rollNo;
				this.per=per;
				this.clas=clas;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public float getPer() {
			return per;
		}

		public void setPer(float per) {
			this.per = per;
		}

		public String getClas() {
			return clas;
		}

		public void setClas(String clas) {
			this.clas = clas;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", per=" + per + ", clas=" + clas + ", toString()=" + super.toString()
			+ "]";
		}
		
		
		
}
