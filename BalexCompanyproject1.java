/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balexcompanyproject1;

/**
 *
 * @author dell
 */
public class BalexCompanyproject1 {

    private static final double MINIMUM_WAGE = 8.00;
    private static final int MAX_HOURS_PER_WEEK = 60;

    public static void calculatePay(double basePay, int hoursWorked) {
        double totalPay;

        // Check if base pay is less than minimum wage
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MINIMUM_WAGE + " per hour.");
            return;
        }

        // Check if hours worked exceeds maximum
        if (hoursWorked > MAX_HOURS_PER_WEEK) {
            System.out.println("Error: Employee cannot work more than " + MAX_HOURS_PER_WEEK + " hours per week.");
            return;
        }

        // Calculate regular pay and overtime pay
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            double regularPay = 40 * basePay;
            double overtimePay = (hoursWorked - 40) * (basePay * 1.5);
            totalPay = regularPay + overtimePay;
        }

        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        // Employee 1: Base pay $7.5, 35 hours worked
        calculatePay(7.5, 35);

        // Employee 2: Base pay $8.2, 47 hours worked
        calculatePay(8.2, 47);

        // Employee 3: Base pay $10.0, 73 hours worked
        calculatePay(10.0, 73);
    }
}


