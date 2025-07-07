public class CheckValue {
    public static void main(String[] args) {
        int value1=Integer.parseInt(args[0]);
        if(value1==0){
            System.out.println("Zero");
        }else if(value1<0){
            System.out.println("Negative Value ");
        }else {
            System.out.println("Positive Value ");
        }
    }

}
