package com.pack;

public class Employee extends User {
		private	int emp_Id;
		private String emp_Name;
		private double emp_Sal;
		
		public void cal_Salary() {}
		
		
		public int getEmp_Id() {
			return emp_Id;
		}

		public void setEmp_Id(int emp_Id) {
			this.emp_Id = emp_Id;
		}

		public String getEmp_Name() {
			return emp_Name;
		}

		public void setEmp_Name(String emp_Name) {
			this.emp_Name = emp_Name;
		}

		public double getEmp_Sal() {
			return emp_Sal;
		}

		public void setEmp_Sal(double emp_Sal) {
			this.emp_Sal = emp_Sal;
		}

}
