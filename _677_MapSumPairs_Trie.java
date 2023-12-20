public class _677_MapSumPairs_Trie {
    private class TrieNode{
        public static final int SIZE = 26;
        public TrieNode[] children = new TrieNode[SIZE];
        public int value = 0;
    }

    private TrieNode root = new TrieNode();

    private void insert(TrieNode parent, int curIndex, String word, int val){
        if(curIndex < word.length()){
            int childIndex = word.charAt(curIndex) - 'a';
            if(parent.children[childIndex] == null){
                parent.children[childIndex] = new TrieNode();
            }
            if(curIndex == word.length()-1){
                parent.children[childIndex].value = val;
            }else{
                insert(parent.children[childIndex],curIndex+1, word, val);
            }
        }
    }
    public void insert(String key, int val) {
        insert(root,0,key,val);
    }

    private int curSum = 0;

    private void travel(TrieNode parent, int curIndex, String prefix){
        if(parent == null){
            return;
        }
        if(curIndex < prefix.length()){
            int childIndex = prefix.charAt(curIndex) - 'a';
            if(parent.children[childIndex] == null){
                return;
            }
            if(curIndex == prefix.length()-1){
                curSum += parent.children[childIndex].value;
            }
            travel(parent.children[childIndex],curIndex+1,prefix);
        }else {
            for (int i = 0; i < TrieNode.SIZE; i++) {
                if(parent.children[i] != null){
                    curSum += parent.children[i].value;
                    travel(parent.children[i],curIndex+1,prefix);
                }
            }
        }
    }

    public int sum(String prefix) {
        curSum = 0;
        travel(root, 0, prefix);
        return curSum;
    }
}
