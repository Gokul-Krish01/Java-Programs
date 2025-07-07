public class Welcome {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide a name .");
        }
        String word1 = args[0];
        System.out.println("Welcome " + word1);
    }
}
