class Trie {
​
    /** Initialize your data structure here. */
    Node root;
    public Trie() {
        root = new Node();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            Character ch = word.charAt(i);
           
            if(temp.map.get(ch) == null ){
                temp.map.put(ch, new Node());
                temp = temp.map.get(ch);
            } else{
                
                
                temp = temp.map.get(ch);
            }
        }
         temp.isWord=true;
        //System.out.print(root);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            if(temp.map.get(c) == null){
                return false;
            } else{
                temp = temp.map.get(c);
            }
        }
        
        return temp.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i=0; i<prefix.length(); i++){
