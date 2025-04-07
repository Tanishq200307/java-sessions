public class longestPalindrome {
    public static void main(String[] args) {
        String str = "jsahgdfgjsdcbbbclsjhdfkghjskdhfkjgsfdgfsdggfhhgjhfgjjhgkghjkjjhgkjghkjghaallaallaallaallaallaallaallaakjshdkfhfd";
        System.out.println(longestPalindrome(str));

    }
    public static String longestPalindrome(String s) {
        String ans = "";
        if(s.length()<2) return s;
        for(int i=0;i<s.length()-1;i++){
            for(int j = i;j<s.length();j++){
                String subString = s.substring(i,j+1);
                if(palindrome(subString) && subString.length()>ans.length()){
                    ans = subString;
                }
            }
        }
        return ans;
    }
   public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
