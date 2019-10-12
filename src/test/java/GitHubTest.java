import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GitHubTest {

    private GitHub gitHub;
    private Account account1;
    private Account account2;
    private Account account3;

    @Before
    public void before() {
        gitHub = new GitHub();
        account1 = new Account("Liliana Everett", "Liliana's Repo", AccountType.FREE);
        account2 = new Account("Amanda", "Amanda's Repo", AccountType.FREE);
        account3 = new Account("Ahmed", "Ahmed's Repo", AccountType.FREE);
    }

    @Test
    public void hasAccounts() {
        gitHub.addAccount(account1);
        gitHub.addAccount(account2);
        gitHub.addAccount(account3);
        assertEquals(3, gitHub.getAccounts().size());
    }
    

}
