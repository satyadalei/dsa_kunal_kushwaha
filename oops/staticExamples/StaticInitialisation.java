package staticExamples;

public class StaticInitialisation {
    static int a = 8;
    static int b;

    static {
        b = 675;
        System.out.println("I am static block");
    }

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
        StaticInitialisation myStat = new StaticInitialisation();

        System.out.println("Hello");
    }
}
