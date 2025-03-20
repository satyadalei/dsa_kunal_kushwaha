public class Wrapper {
    public static void main(String[] args) {
        int a = 9;

        // This is Wrapper class
        Integer num  = 7;

        // Not possible
//        final int increase = 8;
//        increase = 9;


    }

    class A{
        final int num = 10;
        String name;

       A(String name){
           this.name = name;
       }
    }
}
