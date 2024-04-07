public class Decreasing {

    public static void main(String[] args) {
            Decreasing d=new Decreasing();
            //d.printInDecreasingOrder();
        d.printDetails();
    }

  /*  public void  printInDecreasingOrder(){

        int x=3;
        System.out.println(x);
        do {
            System.out.println(x-2);
        }
        while (x==1);{
            System.out.println(x-1);
        }
        System.out.println(x-3);
    }*/

    public void printDetails(){
        for(int x=3;x>=0;x--){
            System.out.println(x);
        }

    }
}
