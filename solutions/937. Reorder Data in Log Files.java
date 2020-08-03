class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs,new Comparator<String>(){
            
            @Override
            public int compare(String s1, String s2) {
               String []  str1 =  s1.split(" ");
                String []  str2 =  s2.split(" "); 
                
                if(Character.isDigit(str1[1].charAt(0)) && Character.isDigit(str2[1].charAt(0))){
                    return 0;
                }
                
                else if(Character.isAlphabetic(str1[1].charAt(0)) && Character.isDigit(str2[1].charAt(0))){
                    return -1;
                }
                
                else if(Character.isAlphabetic(str2[1].charAt(0)) && Character.isDigit(str1[1].charAt(0))){
                    return 1;
                }
                
                else {
                    String s3 = s1.substring(s1.indexOf(" "));
                     String s4 = s2.substring(s2.indexOf(" "));
                    
                    if(s3.equals(s4)){
                        return str1[0].compareTo(str2[0]);
                    }
                    
                    return s3.compareTo(s4);
                    
                }   
                
            }
            
        });
        
        return logs;
    }
}
