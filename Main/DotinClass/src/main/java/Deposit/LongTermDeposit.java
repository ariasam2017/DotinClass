package Deposit;

public class LongTermDeposit extends Deposit {

    private static final double YearlyProfit = 0.20;  // سود سالانه 20 درصد
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
    public void ProfitCalculation() {
        balance += balance * (YearlyProfit / 12);
    }
}
