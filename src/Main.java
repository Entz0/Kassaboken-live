public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        register.createAccount("Kim", 500);
        register.createAccount("Moa", 100);

        register.printAll();

    }
}

