import java.util.*;
class DataType{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        

        if(a>47 && a<58){
            System.out.println("Digit");
        }
        else if((a>64 && a<91)||(a>96 && a<123)){
            System.out.println("Alphabhet");
    }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}

