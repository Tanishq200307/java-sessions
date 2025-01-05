public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println(searchInStrings("Tanishq",'a'));
    }
    static int searchInStrings(String Value,char target){
        if(Value.length()==0){
            return -1;
        }
        for (int i = 0; i < Value.length(); i++) {
            int element = Value.charAt(i);
            if(element == target){
                return i;
            }
        }
return -1;
    }
}
