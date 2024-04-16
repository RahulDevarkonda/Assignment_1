package Packg3;

public class ChromeDriver implements WebDriver{

    public static void main(String[] args) {
        WebDriver wd1=new ChromeDriver();
        ChromeDriver wd2 = new ChromeDriver();
wd1.get();
wd2.openDevtools();
    }

    @Override
    public void get() {
        System.out.println("This is ChromerDriver get method");
    }

    public void openDevtools(){
    System.out.println("This is ChromeDriver OpenDevtools method");
}
}
