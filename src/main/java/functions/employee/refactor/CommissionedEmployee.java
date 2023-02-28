package functions.employee.refactor;


import functions.employee.EmployeeType;
import functions.employee.Money;

public class CommissionedEmployee extends Employee{
    private EmployeeType employeeType;
    private String firstName;
    private String lastName;

    public CommissionedEmployee(EmployeeRecord employeeRecord) {
        firstName = employeeRecord.getFirstName();
        lastName = employeeRecord.getLastName();
        employeeType = EmployeeType.COMMISSIONED;
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
