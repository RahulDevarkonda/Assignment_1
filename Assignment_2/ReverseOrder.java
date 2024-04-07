public class ReverseOrder {
    public static void main(String[] args) {
        ReverseOrder r = new ReverseOrder();
        System.out.println(r.arrayTraversalReverse());

    }


    public int arrayTraversalReverse( ){
        int[] number = new int[5];
        number[0]=54;
        number[1]=43;
        number[2]=2;
        number[3]=1;
        number[4]=5;

     for (int i=number.length-1;i>=1;i--){
         System.out.print(number[i] +" ");
     }
        return number[0];
    }

}
