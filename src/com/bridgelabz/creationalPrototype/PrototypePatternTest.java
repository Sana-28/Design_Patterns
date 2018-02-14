package com.bridgelabz.creationalPrototype;

import java.util.List;
 
/**Purpose: This program is to implement Prototype Pattern Test
 * @author SANA SHAIKH
 * @since 13/01/2018
 */
public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("Employee List : "+emps.getEmpList());
		System.out.println("Employee List : "+list);
		System.out.println("Employee List : "+list1);
	}

}
