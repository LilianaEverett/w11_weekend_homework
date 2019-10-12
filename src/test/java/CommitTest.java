import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before() {
        commit = new Commit("created classes", CommitType.FEATURE, 769256);
    }

    @Test
    public void hasDrescription() {
        assertEquals("created classes", commit.getDescription());
    }

    @Test
    public void hasCommitType() {
        assertEquals(CommitType.FEATURE, commit.getCommitType());
    }

    @Test
    public void hasCommitId() {
        assertEquals(769256, commit.getCommitId());
    }

}
