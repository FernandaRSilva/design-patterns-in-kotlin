package br.com.design.patterns.creational.singleton;


/*
    We use Singleton when a class is often used by many distinct parts of system
    and it does not manage any state of the application.
 */

public class Printer {
    private static Printer uniqueInstance;

    private Printer() { //avoid class be instantiated by anyone but itself through getInstance method
    }

    public static synchronized Printer getInstance() { //synchronized avoid method be accessed by two threads in the same time
        if (uniqueInstance == null)
            uniqueInstance = new Printer();

        return uniqueInstance;
    }

    public void printDeposit(Float amount, String toAccount) {
        System.out.println(
                String.format("Deposit of %.2f with success in account %s.", amount, toAccount)
        );
    }

    public void printTransfer(Float amount, String toAccount, String fromAccount) {
        System.out.println(
                String.format("Transfer from account %s of %.2f with success to account %s.",
                        fromAccount, amount, toAccount)
        );
    }

    public static void main(String[] args) {
        Printer printer = Printer.getInstance();
        printer.printDeposit(150.00F, "123456789");
        printer.printTransfer(150.00F, "123456789", "987654321");
    }
}


