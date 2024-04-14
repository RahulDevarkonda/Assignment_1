package Packg2;

import Packg1.Animal;
import Packg1.Dog;

public class Lion extends Animal {

    public static void main(String[] args) {

        Animal l = new Lion("Dinesh",40,"Pandey",04);
        l.eat("Eat method");
        //l.gender(30); Cant access since the method is private
     //   l.walk("Walk method"); Cant access since the method is protected
      //  l.getDetails(03); both cannot be accessible due to the package restrictions
    }

    public Lion(String name, int age, String surname, int id) {
        super(name, age, surname, id);
    }


    }



