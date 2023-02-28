package functions.employee.refactor;


import functions.employee.Money;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(EmployeeRecord employeeRecord) {
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
