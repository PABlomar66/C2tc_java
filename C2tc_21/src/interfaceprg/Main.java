package interfaceprg;

public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank(1000.0); 

        myBank.checkBalance();
        myBank.deposit(500.0);
        myBank.withdraw(200.0);
        myBank.checkBalance();
        myBank.withdraw(1500.0); 
    }
}
