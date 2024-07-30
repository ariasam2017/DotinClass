package Deposit;

public class ShortTermDeposit extends Deposit {

    private static final double YearlyProfit = 0.10;
    private static final double MinimumInventory = 2000;
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void calculateMonthlyInterest() {
        super.calculateMonthlyInterest();
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
}
