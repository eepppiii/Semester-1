package Accounting;

public class Accounting extends Employee implements Payable {

    public Accounting(String id, String name, String gender, int age) {
        super(id, name, gender, age, "Accounting");
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + " | Can calculate salaries for Staff & Manager";
    }

    public double calculateSalary(Employee e) {
        if (!getId().equals("A001")) return 0.0;

        switch (e.getRole()) {
            case "Staff":
                return 5000.0;
            case "Manager":
                return 7000.0;
            default:
                return 0.0;
        }
    }

    public double calculateSalary(Employee e, double bonus) {
        if (!getId().equals("A001")) return 0.0;

        switch (e.getRole()) {
            case "Staff":
                return 5000.0;
            case "Manager":
                return 7000.0 + (7000.0 * bonus);
            default:
                return 0.0 ;
        }
    }
}
