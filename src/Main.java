public class Main {
    public static void main(String[] args) {

        int checkingAccount = 2000;
        int depositAmount  = 2000;
        int bonus = 100;
        int balance = depositAmount/bonus;

        if (depositAmount > 1000){
            System.out.println("Ваш баланс составляет " + (checkingAccount + depositAmount + balance) + " рублей!");
        } else {
            System.out.println("Ваш баланс составляет " + (checkingAccount + depositAmount) +" рублей!");
        }

    }
}
