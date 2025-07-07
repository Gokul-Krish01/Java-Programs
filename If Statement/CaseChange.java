import java.util.*;
class CaseChange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        

        if(a<91){
            System.out.println((char)(a+32));
        }
        else if(a>96){
            System.out.println((char)(a-32));
    }
        sc.close();
    }
}



