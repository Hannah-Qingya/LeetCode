/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> s;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.s = new Stack();
        for(int i = nestedList.size() - 1; i >= 0; i--) {
            s.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return s.peek().getInteger;
    }

    @Override
    public boolean hasNext() {
        while(!s.isEmpty()) {
            NestedInteger cur = s.pop();
            
            if(cur.isInteger()) {
                return true;
            }
            
            List<NestedInteger> list = cur.getList();
            for(int i = list.size() - 1; i >= 0; i--) {
                s.push(list.get(i));
            }
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */