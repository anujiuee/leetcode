class Solution {
    
    class Obj {
        Character num;
        int count;
        
        Obj(Character num,int count){
            this.num=num;
            this.count=count;
        }
        
    }
    
    public String removeDuplicates(String s, int k) {
        
        int n = s.length();
        
        Stack<Obj> stack = new Stack();
        
        Character ch ;
        int count =0;
        
        int i=0;
        
        while(i<n){
            
            if(stack.isEmpty()) {stack.push(new Obj(s.charAt(i),1));i++;continue;}
            
            ch = stack.peek().num;
            
            if(s.charAt(i)==ch) {
                count = stack.peek().count;
                stack.pop();
                if(count!=k-1) stack.push(new Obj(s.charAt(i),count+1));
                
            } else {
                stack.push(new Obj(s.charAt(i),1));
            }
            
           
            
            i++;
            
        }
        
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            ch = stack.peek().num;
            count = stack.peek().count;
            while(count-->0){
                str.append(ch);
            }
            stack.pop();
        }
        
        return str.reverse().toString();
    }
}
