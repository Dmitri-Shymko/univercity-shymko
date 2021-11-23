package com.belhard.univercity;

public class AccountantUtil {

	public static double findWorkingHoursBonus(Employee employee) {
		double bonus = 0;
		if (employee.getWorkExperience() >= 0 && employee.getWorkExperience() <= 1) {
			bonus = 0;
		} else if (employee.getWorkExperience() > 1 && employee.getWorkExperience() <= 3) {
			bonus = employee.getSalary() * 0.2;
		} else if (employee.getWorkExperience() > 3 && employee.getWorkExperience() <= 5) {
			bonus = employee.getSalary() * 0.5;
		} else if (employee.getWorkExperience() > 5 && employee.getWorkExperience() <= 10) {
			bonus = employee.getSalary() * 0.8;
		} else if (employee.getWorkExperience() > 10) {
			bonus = employee.getSalary() * 1;
		}
		return bonus;

	}

	public static double bruttoSalaryPerMonth(Employee employee) {
		double bruttoSalaryPerMonth = 0;
		bruttoSalaryPerMonth = employee.getSalary() + findWorkingHoursBonus(employee);
		return bruttoSalaryPerMonth;
	}

	public static double bruttoSalaryPerMonth(Teacher teacher) {
		double bruttoSalaryPerMonth = 0;
		bruttoSalaryPerMonth = teacher.getSalary() + findWorkingHoursBonus(teacher);
		return bruttoSalaryPerMonth;
	}

	public double clearSalaryPerMonth(Employee employee) {
		double clearSalaryPerMonth = 0;
		double taxRate = 0.87;
		clearSalaryPerMonth = (employee.getSalary() + findWorkingHoursBonus(employee)) * taxRate;
		return clearSalaryPerMonth;
	}

}
