import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class GitHub {

    private TreeMap<String, Account> accounts;

    public GitHub() {
        this.accounts = new TreeMap<String, Account>();
    }

    public TreeMap<String, Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.put(account.getName(), account);
    }

}
