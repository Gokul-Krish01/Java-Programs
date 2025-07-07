import java.util.*;
public class SearchElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number : ");
        int searchElement = sc.nextInt();
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                ind = i;
                break;
            }
        }
        System.out.println(ind);
        sc.close();
    }
}
