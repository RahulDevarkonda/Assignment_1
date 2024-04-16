package Packg3;

public class FireFoxDriver implements WebDriver {
    public static void main(String[] args) {
        WebDriver wd3=new FireFoxDriver();
        FireFoxDriver wd4= new FireFoxDriver();
        wd3.get();
        wd4.addInspect();

    }


    @Override
    public void get() {
        System.out.println("This is Firefox get method");
    }

    public void addInspect(){
        System.out.println("This is Firefox inspect method");
    }
}