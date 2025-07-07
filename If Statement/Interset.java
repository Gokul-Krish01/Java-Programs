import java.util.*;
class Interset{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int age=sc.nextInt();
        

        if(a.equalsIgnoreCase("Female")){
            
            if(age>=59 && age<=100){
                System.out.println("9.2%");
            }
            else if(age>=1 && age<=58){
                System.out.println("8.2%");
            }
        }
        else if(a.equalsIgnoreCase("Male")){
            if(age>=59 && age<=100){
                System.out.println("10.5%");
            }
            else if(age>=1 && age<=58){
                System.out.println("8.4%");
            }
    }
      sc.close();
    }
}


