class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                while(left<right){
                    if(s.charAt(left+1)!=s.charAt(right)){
                        while(left<right){
                           if(s.charAt(left)!=s.charAt(right-1)){
                           return false;
                           }
                        left++;
                        right--;
                        }
                    }
                    left++;
                    right--;
                }
                
            }
            left++;
            right--;
        }
        return true;
        
    }
}