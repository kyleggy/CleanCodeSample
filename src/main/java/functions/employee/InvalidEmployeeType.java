package functions.employee;

public class InvalidEmployeeType extends RuntimeException {
    public InvalidEmployeeType(String message) {
        super(message);
    }
}
