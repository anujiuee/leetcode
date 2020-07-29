class Solution {
    public String removeDuplicates(String S) {
        if(S == null || S.length() == 0)
            return new String();
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == S.charAt(i))
                while(!stack.isEmpty() && stack.peek() == S.charAt(i))
                    stack.pop();
            else
                stack.push(S.charAt(i));
        }
        while(!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
