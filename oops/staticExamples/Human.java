package staticExamples;

public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;
    static long population;

    static void greet(){
        System.out.println("hello there");
//        System.out.println(this.age); // YOu can not access this key word inside of static method
    }

    public Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population = population + 1;

        Human.greet(); // this.greet();
    }
}
