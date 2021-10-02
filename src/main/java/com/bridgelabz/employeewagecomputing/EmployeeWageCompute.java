package com.bridgelabz.employeewagecomputing;

/**
 * Employee Wage Compute Program Using OOPS Concept
 */

import java.util.Random;

public class EmployeeWageCompute {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computing Program.!!!");
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == 1) {
            System.out.println("Employee is present for work ");
        }
        else {
            System.out.println("Employee is absent for work ");
        }
    }
}
