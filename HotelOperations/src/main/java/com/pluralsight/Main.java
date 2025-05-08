package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 120.0, false, false);
        System.out.println("Room:");
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        System.out.println("Checking in...");
        room1.checkIn();
        System.out.println("Checking out...");
        room1.checkOut();
        System.out.println("Cleaning room...");
        room1.cleanRoom();
        System.out.println("Available after checkout & cleaning: " + room1.isAvailable());
        System.out.println();

        Reservation res1 = new Reservation("king", 2, true);
        System.out.println("Reservation:");
        System.out.println("Room Type: " + res1.getRoomType());
        System.out.println("Nights: " + res1.getNumberOfNights());
        System.out.println("Weekend Stay: " + res1.isWeekend());
        System.out.println("Price Per Night: $" + res1.getPrice());
        System.out.println("Total: $" + res1.getReservationTotal());
        System.out.println();

        Employee emp1 = new Employee("EMP123", "Ben", "Front Desk", 15.00, 45);
        System.out.println("Employee:");
        System.out.println("ID: " + emp1.getEmployeeId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Pay Rate: $" + emp1.getPayRate());

        System.out.println("Punching in (current time)...");
        emp1.punchIn();
        System.out.println("Punching out (current time)...");
        emp1.punchOut();

        System.out.println("Hours Worked: " + emp1.getHoursWorked());
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOvertimeHours());
        System.out.println("Total Pay: $" + emp1.getTotalPay());
    }
}
