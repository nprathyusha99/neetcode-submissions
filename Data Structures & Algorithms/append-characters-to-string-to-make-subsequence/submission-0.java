class Solution {
    public int appendCharacters(String s, String t) {      
        int k =0;
        for(int i=0; i<s.length(); i++){
            if(k < t.length() && t.charAt(k) == s.charAt(i)){
                k++;
            }
        }
        if(k == t.length()) return (int) 0;
        else{
            return t.length() - k ;
        }
     
    }
}