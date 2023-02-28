package functions.tryyourself;
/*
Remove unnecessary loops and verify your test in PayAmountTest.java
 */
public class PayAmount {
    boolean isDead;
    boolean isSeparated;
    boolean isRetired;

    PayAmount(boolean isDead, boolean isSeparated, boolean isRetired) {
        this.isDead = isDead;
        this.isSeparated = isSeparated;
        this.isRetired = isRetired;
    }

    public double getPayAmount() {
        double result;
        if (isDead){
            result = deadAmount();
        }
        else {
            if (isSeparated){
                result = separatedAmount();
            }
            else {
                if (isRetired){
                    result = retiredAmount();
                }
                else{
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    private double normalPayAmount() {
        return 7.0;
    }

    private double retiredAmount() {
        return 8.0;
    }

    private double separatedAmount() {
        return 2.0;
    }

    private double deadAmount() {
        return 4.0;
    }
}
