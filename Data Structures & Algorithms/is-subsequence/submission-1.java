class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() ==0) return false;
        if(s.length() ==0) return true;
        int k=0;
        boolean flag = false;
        for(int i =0; i<t.length(); i++){           
            if(k < s.length() && s.charAt(k) == t.charAt(i)){
                k++;
            }
        }
    return k-1 == s.length()-1 ?  true : false;
    }
}