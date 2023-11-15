class TrieNode {
    private TrieNode[] children;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }

    public TrieNode getChild(char ch) {
        return children[ch - 'a'];
    }

    public TrieNode createChild(char ch) {
        TrieNode newNode = new TrieNode();
        children[ch - 'a'] = newNode;
        return newNode;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd() {
        isEnd = true;
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.getChild(ch) == null) {
                node = node.createChild(ch);
            } else {
                node = node.getChild(ch);
            }
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (node.getChild(ch) == null) {
                return null;
            } else {
                node = node.getChild(ch);
            }
        }
        return node;
    }
}