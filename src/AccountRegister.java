import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts = new ArrayList<>();

    public void printAll() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            System.out.println("Konto: " + a.getName() + " | Saldo: " + a.getBalance());
        }
    }
}