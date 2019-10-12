import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;
    private Repository repo;
    private Repository repo1;


    @Before
    public void before() {
        repo = new Repository("w04_Ruby_Project_Vet_Management", "Solo Project of Ruby and PostgreSQL", RepoType.PUBLIC);
        repo1 = new Repository("PDA_Liliana_Everett", "Proof of level of education", RepoType.PRIVATE);

        account = new Account("Liliana Everett", "Liliana's Repo", AccountType.FREE);
        account.addRepo(repo);
    }

    @Test
    public void hasUsername() {
        assertEquals("Liliana Everett", account.getUsername());
    }

    @Test
    public void hasName() {
        assertEquals("Liliana's Repo", account.getName());
    }

    @Test
    public void hasAccountType() {
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void hasRepos() {
        assertEquals(1, account.getRepos().size());
    }

//    We should have the ability to add repositories:

    @Test
    public void canAddRepo() {
        account.addRepo(repo1);
        assertEquals(2, account.reposCount());
    }

//    We should be able to get a repository by name:

    @Test
    public void canGetRepoByName() {
        assertEquals("PDA_Liliana_Everett", account.getRepoByName(repo1));
    }

//    GitHubAccounts always start free, but we should be able to upgrade / downgrade:
//    default value is 0

    @Test
    public void accountStartsFree() {
        assertEquals(0, account.getAccountType().getValue());
    }

    @Test
    public void canUpgradeAccountType() {
        account.changeAccountType();
        assertEquals(AccountType.PRO, account.getAccountType());
    }

    @Test
    public void canDowngradeAccountType() {
        account.changeAccountType();
        account.changeAccountType();
        assertEquals(AccountType.FREE, account.getAccountType());
    }

}
