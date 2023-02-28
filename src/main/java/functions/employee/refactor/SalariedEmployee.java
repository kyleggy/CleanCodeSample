package functions.employee.refactor;


import functions.employee.Money;

public class SalariedEmployee extends Employee{

    public SalariedEmployee(EmployeeRecord employeeRecord) {
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
