package functions.employee.refactor;


import functions.employee.Money;

public class EmployeeClient {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        Employee employee = employeeFactory.makeEmployee(new EmployeeRecord());
        employee.calculatePay();
        employee.isPayday();
        employee.deliverPay(new Money());
    }

}
