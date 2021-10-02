package com.bridgelabz.employeewagecomputing;

/**
 * Employee Wage Compute Program Using OOPS Concept
 */

import java.util.Random;

public class EmployeeWageCompute {
    static final int WAGE_PER_HR = 20;
    static final int FULL_DAY_HR = 8;
    static final int PART_TIME_HR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computing Program.!!!");
        int dailyEmpWage;
        Random random = new Random();
        double empCheck = (Math.floor(Math.random() * 10) % 3);
        switch ((int) empCheck) {
            case 0:
                System.out.println("Employee is present for work full day ");
                dailyEmpWage = WAGE_PER_HR * FULL_DAY_HR;
                System.out.println("Employee daily wage: " + dailyEmpWage);
                break;
            case 1:
                System.out.println("Employee present for Halfday (Part time)");
                dailyEmpWage = WAGE_PER_HR * PART_TIME_HR;
                System.out.println("Employee Part Time Wage: " + dailyEmpWage);
                break;
            case 2:
                System.out.println("Employee is absent for work ");
        }
    }
}
