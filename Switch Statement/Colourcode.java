import java.util.*;

public class Colourcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.nextLine().charAt(0);
        
        switch(s){
            case 'R':
                System.out.print("Red");
                break;
            case 'G':
                System.out.print("Green");
                break;
            case 'B':
                System.out.print("Blue");
                break;
            case 'O':
                System.out.print("Orange");
                break;
            case 'Y':
                System.out.print("Yellow"); 
                break;
            case 'W':
                System.out.print("White");
                break;
            default:
                System.out.println("Invalid Color");
                break;
        }
         sc.close();
    }
}
