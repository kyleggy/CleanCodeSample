package functions.employee.refactor;


import functions.employee.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord employeeRecord) throws InvalidEmployeeType;
}
