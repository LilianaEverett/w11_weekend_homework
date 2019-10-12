import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class RepositoryTest {

    private Repository repo;
    private Commit commit;
    private Commit commit1;
    private Commit commit2;

    @Before
    public void before() {
        repo = new Repository("w04_Ruby_Project_Vet_Management", "Solo Project of Ruby and PostgreSQL", RepoType.PUBLIC);
        commit = new Commit("created classes", CommitType.FEATURE, 769256);
        commit1 = new Commit("created Tests", CommitType.FEATURE, 769257);
        commit2 = new Commit("solved bugs", CommitType.BUGFIX, 769258);
    }

    @Test
    public void hasName() {
        assertEquals("w04_Ruby_Project_Vet_Management", repo.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Solo Project of Ruby and PostgreSQL", repo.getDescription());
    }

    @Test
    public void hasRepoType() {
        assertEquals(RepoType.PUBLIC, repo.getRepoType());
    }

    @Test
    public void hasCommits(){
        assertEquals(0, repo.getCommits().size());
    }

    @Test
    public void canAddCommit() {
        repo.addCommit(commit);
        assertEquals(1, repo.getCommits().size());
    }

//    We should be able to get a commit by its uniqueId:

    @Test
    public void canGetCommitById() {
        repo.getCommitById(769256);
        assertEquals(769256, commit.getCommitId());
    }

//    We should be able to get all commits of a certain type (e.g. all features):

    @Test
    public void canGetAllCommitsByType() {
        repo.addCommit(commit);
        repo.addCommit(commit2);
        repo.addCommit(commit1);
        assertEquals(2, repo.getCommitsByType(CommitType.FEATURE).size());
        assertEquals(1, repo.getCommitsByType(CommitType.BUGFIX).size());
    }

    //    A Repository should be able to revert (roll-back) commits to a certain point:

    @Test
    public void canRevert() {
        repo.addCommit(commit);
        repo.addCommit(commit1);
        repo.addCommit(commit2);
        repo.revert(769257);
        assertEquals(2, repo.getCommits().size());
    }
}
