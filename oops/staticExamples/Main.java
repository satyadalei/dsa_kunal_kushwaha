package staticExamples;

public class Main {
    public static void main(String[] args) {
//       Human satya = new Human("satya", 24, 15000, false);
//        Human rahul = new Human("Rahul", 24, 25000, true);
        Human.population = 56;
        System.out.println(Human.population);
        System.out.println(Human.population);
        funn();
    }

    void func(){
        System.out.println("Here is FUN");
    }

    static void funn(){
        System.out.println("This is Funn");

        Main myMain = new Main();
        myMain.func();
    }
}
