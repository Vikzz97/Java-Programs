package JavaPrograms;

// Data Hiding
// Abstraction : showing essential details without showing the background details is called astraction.
public class Customer {
    private double balance = 10000;

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("You are a hacker");
        } else {
            this.balance = this.balance + amount;
            System.out.println("Balance after deposit :" + this.balance);
        }

    }

    public void withdraw(int withdraw) {
        this.balance = this.balance + withdraw;
        System.out.println("Balance after withdraw :" + this.balance);
    }
}
