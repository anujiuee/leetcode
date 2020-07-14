class WordDictionary {

    /** Initialize your data structure here. */
    Node root;
    
    public WordDictionary() {
        root = new Node();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            
            if(temp.map.get(c) == null){
                temp.map.put(c, new Node());
                //temp.map.put('.', new Node());
                temp = temp.map.get(c);
            } else{
                temp = temp.map.get(c);
            }
        }
        temp.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        Node temp = root;
        return helper(temp, word);
//         for(int i=0; i< word.length(); i++){
//             Character c = word.charAt(i);
//             if(temp.map.get(c) == null){
//                 return false;
//             }
//             if(c == '.'){
//                 if(i==word.length()-1)
//                     return true;
                
                
//             }
            
            
          
//         }
        
    }
    
    boolean helper(Node node, String word){
        // if(node.isWord == true)
        //     return true;
        if(word.length() == 0 && node.isWord== true)
            return true;
        
        if(word.length() == 0)
            return false;
        
         if(node.map.size() == 0)
            return false;
        Character c = word.charAt(0);
        
        if(c == '.'){
            boolean found = false;
            for (Character ch : node.map.keySet()){
                if(helper(node.map.get(ch), word.substring(1, word.length())))
                    found = found || true;
            }
            return found;
        } else{
            if(node.map.containsKey(c))
                return helper(node.map.get(c), word.substring(1, word.length()));
            else
                return false;
        }
      
       // return false;
    }
    
    class Node{
        Map<Character, Node> map;
        boolean isWord;
        
        Node(){
            map = new HashMap();
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */