package com.pluralsight;

import java.util.Calendar;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void punchIn(double time) {
        this.startTime = time;
        System.out.println("Punched in at: " + time);
    }

    public void punchIn() {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        this.startTime = hour + (minute / 60.0);
        System.out.println("Punched in at: " + this.startTime);
    }

    public void punchOut(double time) {
        // Calculate hours worked using the punchIn start time
        double hoursWorkedToday = time - startTime; // Calculate time worked since punchIn
        this.hoursWorked += hoursWorkedToday;// Add to total hours worked
        System.out.println("Punched out at: " + time);
        System.out.println("Worked hours: " + hoursWorkedToday);
    }

    public void punchOut() {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        double endTime = hour + (minute / 60.0);
        double hoursWorkedToday = endTime - startTime;
        this.hoursWorked += hoursWorkedToday;
        System.out.println("Punched out at: " + endTime);
        System.out.println("Worked hours today: " + hoursWorkedToday);
    }
}
