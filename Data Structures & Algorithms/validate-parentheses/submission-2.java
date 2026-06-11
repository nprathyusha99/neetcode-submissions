class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<>();

        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stk.push(s.charAt(i));
            }
            else{
                if(!stk.isEmpty() && stk.peek() == map.get(s.charAt(i))){
                    stk.pop();
                }
                else{
                    return false;
                }               
            }       
        }
        return stk.isEmpty() ? true : false;
    }
}
