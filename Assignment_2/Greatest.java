public class Greatest {
    public static void main(String[] args) {

        Greatest g=new Greatest();
        g.find_greatest_number(1,2,3);
    }

    public int find_greatest_number(int a,int b,int c) {
           if(a>b&&a>c){
               System.out.println("A is the greatest number with: "+a);
           } else if (b>a&&b>c) {
               System.out.println("B is the greatest number with: "+b);
           }
           else {
               System.out.println("C is the greatest number with: "+c);
           }

           return a;
    }
}
