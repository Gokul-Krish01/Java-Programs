import java.util.*;
public class uniquess {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide array elements ");
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int[] uni = new int[arr.length];
        int uniCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDup = false;

            for (int j = 0; j < uniCount; j++) {
                if (arr[i] == uni[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                uni[uniCount] = arr[i];
                uniCount++;
            }
        }
        int[] result = Arrays.copyOf(uni, uniCount);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
