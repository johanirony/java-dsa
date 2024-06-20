public class Palindrome {
    // palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards,
    // such as madam or racecar,
    public static void main(String[] args) {
        int x=1231;
        System.out.println(isPalindrome(x));


    }
//    static boolean isPalindrome(String str){
//        str=str.toLowerCase();
//        for(int i=0;i<str.length()/2;i++){
//            char start = str.charAt(i);
//            char end = str.charAt(str.length()-1-i);
//            if (start != end ){
//                return false;
//            }
//        }
//        return true;
//    }
static boolean isPalindrome(int x) {
    String a= String.valueOf(x);
    for(int i =0;i<a.length()/2;i++){
        char start = a.charAt(i);
        char end = a.charAt(a.length()-1-i);
        if (start != end ){
            return false;
        }
    }
    return true;

}

}
