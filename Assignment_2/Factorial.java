public class Factorial {

    public static void main(String[] args) {

        Factorial f=new Factorial();
        f.nFactorial(10);

    }
    public void nFactorial(int N){
            long fact=1;
        for(int i=1;i<=N;i++){
             fact= fact * i;
        }
        System.out.print(fact);

    }
}
