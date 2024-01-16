abstract class Employee {
    abstract double getAmount();
}

class WeeklyEmployee extends Employee {
    private double weeklySalary;
    private int totalWeeks;

    public WeeklyEmployee(double weeklySalary, int totalWeeks) {
        this.weeklySalary = weeklySalary;
        this.totalWeeks = totalWeeks;
    }

    @Override
    double getAmount() {
        return weeklySalary * totalWeeks;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int totalHours;

    public HourlyEmployee(double hourlyRate, int totalHours) {
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    @Override
    double getAmount() {
        return hourlyRate * totalHours;
    }
}

public class EmployeePaymentCalculator {
    public static void main(String[] args) {
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(500, 4);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(20, 30);

        System.out.println("Amount to be paid to Weekly Employee: $" + weeklyEmployee.getAmount());
        System.out.println("Amount to be paid to Hourly Employee: $" + hourlyEmployee.getAmount());
    }
}

