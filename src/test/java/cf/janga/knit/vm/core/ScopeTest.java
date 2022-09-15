package cf.janga.knit.vm.core;

import junit.framework.TestCase;

public class ScopeTest extends TestCase {
    
    public void testScopeStoresVariables() {
        Scope scope = new Scope();

        scope.assign("a", "a");
        scope.assign("b", "b");
        scope.assign("c", "c");

        assertEquals("a", scope.valueOf("a"));
        assertEquals("b", scope.valueOf("b"));
        assertEquals("c", scope.valueOf("c"));
    }

    public void testScopeFetchesFromParent() {
        Scope parent = new Scope();
        parent.assign("a", "a");
        parent.assign("b", "b");
        parent.assign("c", "c");
        Scope scope = new Scope(parent);

        assertEquals("a", scope.valueOf("a"));
        assertEquals("b", scope.valueOf("b"));
        assertEquals("c", scope.valueOf("c"));
    }

    public void testUnassignedVariables() {
        Scope parent = new Scope();
        assertEquals(null, parent.valueOf("a"));
        
        Scope scope = new Scope(parent);
        assertEquals(null, scope.valueOf("a"));
    }
}
