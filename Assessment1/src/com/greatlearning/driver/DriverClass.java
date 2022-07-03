package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {

		AdminDepartment s1 = new AdminDepartment();
		HrDepartment s2 = new HrDepartment();
		TechDepartment s3 = new TechDepartment();

		System.out.println("Welcome to " + s1.departmentName());
		System.out.println(s1.getTodaysWork());
		System.out.println(s1.getWorkDeadline());
		System.out.println(s1.isTodayAHoliday());

		System.out.println();// to print an extra line

		System.out.println("Welcome to " + s2.departmentName());
		System.out.println(s2.doActivity());
		System.out.println(s2.getTodaysWork());
		System.out.println(s2.getWorkDeadline());
		System.out.println(s2.isTodayAHoliday());

		System.out.println();// to print an extra line

		System.out.println("Welcome to " + s3.departmentName());
		System.out.println(s3.getTodaysWork());
		System.out.println(s3.getWorkDeadline());
		System.out.println(s3.getTechStackInformation());
		System.out.println(s3.isTodayAHoliday());

	}

}
