package com.greatlearning.departments;

import com.greatlearing.deptModel.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {

		return "HR Department"; // Changed the 'R' to capital as per the expected output
	}

	public String getTodaysWork() {

		return "Fill today's timesheet and mark your attendance"; // Changed 'Worksheet' to timesheet as per the
																	// expected output
	}

	public String getWorkDeadline() {

		return "Complete by EOD";

	}

	public String doActivity() {

		return "team Lunch";
	}

}
