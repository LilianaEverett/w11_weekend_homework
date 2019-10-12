import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repository> repos;


    public GitHubAccount(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repos = new HashMap<String, Repository>();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Repository> getRepos() {
        return repos;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public int reposCount() {
        return this.repos.size();
    }

    public Object addRepo(Repository repo) {
        return repos.put(repo.getName(), repo);
    }


    public String getRepoByName(Repository repo) {
        return repo.getName();
    }

    public void changeAccountType() {
        if ( accountType.getValue() == 0) {
            this.accountType = AccountType.PRO;
        } else {
            this.accountType = AccountType.FREE;
        }
    }
}
