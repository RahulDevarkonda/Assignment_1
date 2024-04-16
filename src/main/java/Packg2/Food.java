package Packg2;
import Packg1.Animal;



public abstract class Food {

    public static void main(String[] args) {
        Animal a5=new Animal("Rahul",20,"Devarkonda",01);
        a5.eat("Jitendra");
       // a5.gender(50);    private method hence cannot access outside the class
       // a5.walk("Sane");  protected method hence cannot access from the different package
       // a5.getDetail();     default method hence cannot access from the
    }
}
