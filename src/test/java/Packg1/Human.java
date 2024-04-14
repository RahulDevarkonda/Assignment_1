package Packg1;

public abstract class Human  {
    public static void main(String[] args) {
       Animal h1= new Animal("Rahul",20,"Devarkonda",01);
        h1.eat("Sunil");
       // h1.gender(20); //Can't access private method, visibility limited to the animal class only
        h1.walk("Murthi");
        h1.getDetails(02);


    }



}
