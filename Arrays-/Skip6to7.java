public class Skip6to7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide array elements");
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        boolean skip = false;
        for (int num : arr) {
            if (num == 6) {
                skip = true;
                continue;
            }
            if (skip) {
                if (num == 7) {
                    skip = false;
                }
                continue;
            }
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
