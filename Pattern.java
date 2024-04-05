public class Pattern {

    public static void main (String[] args){

        int b=4;
        int c=5;
        patternOne(b);
        patternTwo(c);
    }


    public static void patternOne (int b){

        for (int i=1; i<=b; i++)

        {
            int j=1;
            do {
            System.out.print("*");
            j++;
        } while (j<=i);
            System.out.println();

        }
    }

    public static void patternTwo (int c){

        for (int x=5; x>=3; x--)

        {
            int y=1;
            do {
                System.out.print("*");
                y++;
            } while (y<=x);
            System.out.println();

        }
    }
}
