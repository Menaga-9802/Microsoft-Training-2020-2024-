class TrieNode{

char data;

boolean isTerminating;

TrieNode children[];    

public TrieNode(char data){

    children=new TrieNode[26];

    this.data=data;

}

}

		class Trie {

		private TrieNode root;

		public Trie() {

		root=new TrieNode('\0');

	}

public void insert(String word) {

    insert(root,word);

}

private void insert(TrieNode node,String word)

{

    if(word.length()==0){

        node.isTerminating=true;

        return;

    }

    int idx=word.charAt(0)-'a';

    if(node.children[idx]==null)

    {

        node.children[idx]=new TrieNode(word.charAt(0));

    }

    insert(node.children[idx],word.substring(1));

}

public boolean search(String word) {

    return search(root,word);

}

private boolean search(TrieNode node,String word)

{

    if(word.length()==0){

       return node.isTerminating;

    }

    if(node.children[word.charAt(0)-'a']==null)

    {

        return false;

    }

    else return search(node.children[word.charAt(0)-'a'],word.substring(1));

}

public boolean startsWith(String prefix) {

    return startsWith(root,prefix);

}

private boolean startsWith(TrieNode node,String word)

{

    if(word.length()==0){

       return true;

    }

    if(node.children[word.charAt(0)-'a']==null)

    {

        return false;

    }

    else return startsWith(node.children[word.charAt(0)-'a'],word.substring(1));

}

}
