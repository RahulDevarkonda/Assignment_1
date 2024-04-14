package Packg1;


public class Dog extends Animal{

    public static void main(String[] args) {

        Animal d = new Dog("Mukesh",30,"Seth",03);
       d.eat("Eat method");
       d.walk("Walk method");
       d.getDetails(03);
    }
    public Dog(String name, int age, String surname, int id) {
        super(name, age, surname, id);
    }



    }




