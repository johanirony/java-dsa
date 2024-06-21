public class Palindrome {
    // palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards,
    // such as madam or racecar,
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(a));


    }
    static boolean isPalindrome(String s){
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if (s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;
    }

}
