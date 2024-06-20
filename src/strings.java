public class strings {
    public static void main(String[] args) {
        String name = "Rameez";
        String b = "Rameez";
        System.out.println(name==b);

        // with this method below we can create different objects with same value outside the string pool


        String c = new String("Shaikh");
        String d = new String("Shaikh");
        System.out.println(c==d);
        System.out.println(c.equals(d)); // it only checks the value


    }
}
