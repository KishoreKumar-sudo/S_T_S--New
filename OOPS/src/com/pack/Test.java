package com.pack;

public class Test {

	public static void main(String[] args) {
		Permanent_Employee e1 = new Permanent_Employee();
			e1.setEmp_Id(201);
			e1.setEmp_Name("KishoreKumar");
			e1.setEmp_Sal(25000.00);
			e1.setMin_Tax(1600.00);
			//e1.cal_Salary();
		
		Contract_Employee e2 = new Contract_Employee();
			e2.setEmp_Id(202);
			e2.setEmp_Name("Chaitanya");
			e2.setEmp_Sal(20000.00);
			e2.setMin_Tax(1200.00);
			//e2.cal_Salary();
			Employee_Service.show_Details(e1);
			Employee_Service.show_Details(e2);
	}

}
