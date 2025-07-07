class SumDigit{
    public static void main(String args[]){
      int a=Integer.parseInt(args[0]);
      int rem,sum=0;

    for(;a>0;a=a/10){
        rem=a%10;
       sum+=rem;
    
        
    }
    System.out.println(sum);

    }
   
}


