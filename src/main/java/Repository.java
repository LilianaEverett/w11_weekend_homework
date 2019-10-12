import java.util.ArrayList;
import java.util.BitSet;

public class Repository {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepoType getRepoType() {
        return repoType;
    }

    public ArrayList<Commit> getCommits() {
        return commits;
    }

    public void addCommit(Commit commit) {
        commits.add(commit);
    }

    public Object getCommitById(int id) {
        Commit commitFound = null;
        for (Commit commit : this.commits) {
            if(id == commit.getCommitId()) {
                return commit;
            }
        }
        return commitFound;
    }

    public ArrayList<Commit> getCommitsByType(CommitType type) {
        ArrayList<Commit> commitsFound = new ArrayList<Commit>();
        for (Commit commit : this.commits) {
            if(type == commit.getCommitType()) {
                commitsFound.add(commit);
            }
        }
        return commitsFound;
    }
}
