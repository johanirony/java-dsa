import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // converts the char into their ascii values
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));//converts the ascii value to char
        System.out.println("a" + 1);    // integer will be converted into Integer that will call toString()
        System.out.println("Rameez" + new ArrayList<>());
        String ans = new ArrayList<>() + "" + new Integer(2);
        System.out.println(ans); // as long as there is one string present it will convert everything into string by
        // toString() method

    }
}
