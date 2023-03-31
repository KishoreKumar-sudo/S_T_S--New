package com.pack;

public class Contract_Employee extends Employee {
	private double min_Tax;

	public double getMin_Tax() {
		return min_Tax;
	}

	public void setMin_Tax(double min_Tax) {
		this.min_Tax = min_Tax;
	}
	
	public void cal_Salary() {
		 double sal = getEmp_Sal();
		sal = sal - getMin_Tax();
		System.out.println("Chaitanya Sal: " + sal );
	 }
	
	
}
