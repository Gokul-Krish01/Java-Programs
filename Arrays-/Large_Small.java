public class Large_Small{
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Provide at least 4 integers .");
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Smallest 2 numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
    }
}
