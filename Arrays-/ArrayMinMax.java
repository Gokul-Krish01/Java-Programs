public class ArrayMinMax {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide integer values.");
            return;
        }
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
