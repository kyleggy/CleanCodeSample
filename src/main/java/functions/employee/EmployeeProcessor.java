package functions.employee;

import java.util.Date;

public class EmployeeProcessor {
    public Money calculatePay(Employee employee) {
        switch (employee.getEmployeeType()) {
            case COMMISSIONED :
                return calculateCommissionedPay(employee);
            case HOURLY:
                return calculateHourlyPay(employee);
            case SALARIED:
                return calculateSalariedPay(employee);
            default:
                throw new InvalidEmployeeType(employee.toString());
        }
    }

    private Money calculateCommissionedPay(Employee employee) {
        // Do a bunch of calculating for commissioned pay employee
        Money money = new Money();
        money.setValue(100.00);
        return money;
    }

    private Money calculateHourlyPay(Employee employee) {
        // Do a bunch of calculating for hourly pay employee
        Money money = new Money();
        money.setValue(50.00);
        return money;
    }

    private Money calculateSalariedPay(Employee employee) {
        // Do a bunch of calculating for salaried pay employee
        Money money = new Money();
        money.setValue(5000.00);
        return money;
    }

    public boolean isPayDay(Employee employee, Date date) {
        switch (employee.getEmployeeType()) {
            case COMMISSIONED :
                return isCommissionedPayDay(employee, date);
            case HOURLY:
                return isHourlyPayDay(employee, date);
            case SALARIED:
                return isSalariedPayDay(employee, date);
            default:
                throw new InvalidEmployeeType(employee.toString());
        }
    }

    private boolean isCommissionedPayDay(Employee employee, Date date) {
        // Do a bunch of calculating whether it is pay day for commissioned employed;
        return true;
    }

    private boolean isHourlyPayDay(Employee employee, Date date) {
        // Do a bunch of calculating whether it is pay day for hourly employed;
        return false;
    }

    private boolean isSalariedPayDay(Employee employee, Date date) {
        // Do a bunch of calculating whether it is pay day for salaried employed;
        return true;
    }

    //Another switch for delivering pay....
    public void deliverPay(Employee employee, Money pay) {

    }


}
