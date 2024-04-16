package Packg1;

public class Animal {

    public static void main(String[] args) {
 Animal a1=new Animal("Rahul",20,"Devarkonda",01);


    }

    public String eat(String name) {
        System.out.println("The name is "+name);
        return "name";
    }

    private int gender(int age){
        System.out.println("The gender is: "+age);
        return age;
    }

    protected String walk(String surname){
        System.out.println("Surename is: "+surname);
        return "surname";
    }


    void getDetails(int id){
        System.out.println("Id is:"+id);

    }

    public Animal(String name,int age,String surname,int id){
        System.out.println("Details of the class are as follows: "+"Name is: "+name+" Age is: " +age+" surname is: "+" "+surname+" Id is: "+id+" ");

    }
}