public class SumValue {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Provide two integer values ");
        }
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println("Sum : " + (value1 + value2));
    }
}
