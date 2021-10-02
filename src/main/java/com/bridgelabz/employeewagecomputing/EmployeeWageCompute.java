package com.bridgelabz.employeewagecomputing;

/**
 * Employee Wage Compute Program Using OOPS Concept
 */

import java.util.Random;

public class EmployeeWageCompute {
    static final int WAGE_PER_HR = 20;
    static final int FULL_DAY_HR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computing Program.!!!");
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == 1) {
            System.out.println("Employee is present for work ");
            int dailyEmpWage = WAGE_PER_HR * FULL_DAY_HR;
            System.out.println("Employee daily wage: " + dailyEmpWage);
        } else {
            System.out.println("Employee is absent for work ");
        }
    }
}
