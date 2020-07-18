class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    
        Set<String> set = new HashSet();
        for(int i=0; i<wordList.size(); i++){
            set.add(wordList.get(i));
        }
        
        if(!set.contains(endWord))
            return 0;
        
        Queue<String> q = new LinkedList();
        q.add(beginWord);
        int level=1;
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int k=0; k<size; k++){
                
                String curr_word = q.poll();
                char[] char_arr = curr_word.toCharArray();
                for(int i=0; i<char_arr.length; i++){
                    char orig_char = char_arr[i];
                    for(char j='a'; j<='z'; j++){
                        if(char_arr[i] == j) continue;
                    
                        char_arr[i] = j;
                        String word = String.valueOf(char_arr);
                    
                        if(word.equals(endWord))
                            return level+1;
                    
                        if(set.contains(word)){
                            q.add(word);
                            set.remove(word);
                        }
                    }
                    char_arr[i] = orig_char;
                }
            
            }
            
            level++;
        }
        
        return 0;
    }
}