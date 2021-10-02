package com.bridgelabz.employeewagecomputing;

/**
 * Employee Wage Compute Program Using OOPS Concept
 */

import java.util.Random;

public class EmployeeWageCompute {
    static final int WAGE_PER_HR = 20;
    static final int FULL_DAY_HR = 8;
    static final int PART_TIME_HR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_HRS_PER_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computing Program.!!!");
        int dailyEmpWage;
        Random random = new Random();
        int totalWage = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present for work full day ");
                    dailyEmpWage = WAGE_PER_HR * FULL_DAY_HR;
                    System.out.println("Employee daily wage on day is :" + dailyEmpWage);
                    totalWage += dailyEmpWage;
                    totalWorkingDays += FULL_DAY_HR;
                    break;
                case 1:
                    System.out.println("Employee present for Halfday (Part time)");
                    dailyEmpWage = WAGE_PER_HR * PART_TIME_HR;
                    System.out.println("Employee Wage is :" + dailyEmpWage);
                    totalWage += dailyEmpWage;
                    totalWorkingHrs += PART_TIME_HR;
                    break;
                case 2:
                    System.out.println("Employee is absent for work on day");
            }
            System.out.println("Total Employee Wage : " + totalWage);
            System.out.println("Number of Working Days : " + totalWorkingDays);
            System.out.println("Number of Working Hours : " + totalWorkingHrs);
        }
    }
}
