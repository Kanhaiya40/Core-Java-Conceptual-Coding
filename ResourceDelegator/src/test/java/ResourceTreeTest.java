import com.cognitree.samples.resourcedelegator.lib.ResourceTree;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResourceTreeTest {

    private final static ResourceTree tree = new ResourceTree();

    @BeforeClass
    public static void initialSetup() {
        tree.insert("/a", "a");
        tree.insert("/a/b", "ab");
        tree.insert("/a/b/c", "abc");
        tree.insert("/a/d/{val}", "abVal");
        tree.insert("/a/d/{val}/d/{val}", "abValdVal");
    }

    @Test
    public void testGetResource() {
        Assert.assertEquals(tree.search("/a"), "a");
        Assert.assertEquals(tree.search("/a/b"), "ab");
        Assert.assertEquals(tree.search("/a/b/d"), "ab");
        Assert.assertEquals(tree.search("/a/b/c"), "abc");
        Assert.assertEquals(tree.search("/a/b/c/d"), "abc");
        Assert.assertEquals(tree.search("/a/d/c/d"), "abVal");
        Assert.assertEquals(tree.search("/a/d/f/d/e"), "abValdVal");

    }
}
