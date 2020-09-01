package day48_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lolo","Medium",2,'M',"Golden Retriever", 11);

        System.out.println( dog1.name );
        System.out.println( dog1.size );

        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println( dog1.age );
        System.out.println( dog1.gender );

        System.out.println( dog1 );

        Cat cat1 = new Cat("Pamuk", "Small", 3, 'F', "Persian Cat",5.5);

        System.out.println( cat1 );

    }
}
