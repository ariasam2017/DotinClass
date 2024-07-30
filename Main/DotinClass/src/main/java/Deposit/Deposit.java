package Deposit;

abstract class  Deposit  {      // امکان ساخت آبجکت ندارد
    String owner;
    double balance;


    public void withdraw(double amount) {  // متد برداشت
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void calculateMonthlyInterest() {    //متد واریز سود آخر ماه
        // No interest for saving deposit
    }
    public void deposit(double amount) {    //متد واریز به حساب
        balance += amount;
    }
}
