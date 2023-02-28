package functions.employee.refactor;


import functions.employee.InvalidEmployeeType;

public class EmployeeFactoryImpl implements EmployeeFactory{
    @Override
    public Employee makeEmployee(EmployeeRecord employeeRecord) throws InvalidEmployeeType {
        switch (employeeRecord.getEmployeeType()) {
            case SALARIED:
                return new SalariedEmployee(employeeRecord);
            case HOURLY:
                return new HourlyEmployee(employeeRecord);
            case COMMISSIONED:
                return new CommissionedEmployee(employeeRecord);
            default:
                throw new InvalidEmployeeType(employeeRecord.toString());
        }
    }
}
