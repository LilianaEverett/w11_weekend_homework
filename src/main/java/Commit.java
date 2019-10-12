public class Commit {

    private String description;
    private CommitType commitType;
    private int commitId;

    public Commit(String description, CommitType commitType, int commitId) {
        this.description = description;
        this.commitType = commitType;
        this.commitId = commitId;
    }

    public String getDescription() {
        return this.description;
    }

    public CommitType getCommitType() {
        return this.commitType;
    }

    public int getCommitId() {
        return this.commitId;
    }
}
