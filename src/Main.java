public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        register.createAccount("Kim", 500);
        register.createAccount("Moa", 100);

        Account kim = register.findAccount("Kim");
        if (kim != null) {
            System.out.println("Hittade: " + kim.getName() +" | Saldo: " + kim.getBalance());
            kim.deposit(200);
        }

        Account anna = register.findAccount("Anna");

        if (anna != null) {
            anna.deposit(100);
        } else {
            System.out.println("Kontot saknas: Anna");
        }

        register.printAll();

    }
}

