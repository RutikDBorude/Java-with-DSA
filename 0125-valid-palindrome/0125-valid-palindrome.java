class Solution {
    public boolean isPalindrome(String s) {
        
        int L = 0;
        int R = s.length()-1;

        while(L<R){
            if(!Character.isLetterOrDigit(s.charAt(L))){
                L++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(R))){
                R--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(L)) == Character.toLowerCase(s.charAt(R))){
                L++;
                R--;
            }else{
                return false;
            }

        }
        return true;
    }
}