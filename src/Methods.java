import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name= "Rameez Shaikh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('e'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
