package principles.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(6, 9, 2);
        System.out.println(box.l + " " + box.h + " " + box.w + " ");

        Box box2 = new Box(box);
        System.out.println(box2.l + " " + box2.h + " " + box2.w + " ");

        BoxWeight bw1 = new BoxWeight();
        System.out.println(bw1.l + " " + bw1.h + " " + bw1.w + " "+ bw1.weight + " ");

        Box b2 = new BoxWeight(2,6,3, 78); // Here it is okay that the type variables I want to access are being initialised.
//        System.out.println(box2.weight); // here you can not access the weight because the type of reference variable will not
        // allow you to access something that not present in the reference type

//        BoxWeight b4 = new Box(2,6,7); // Here this will give the error. Because in the left side we are we can access all the variables
        // that are present in BoxWeight. But on the right side we can not initialise all those properties. So we are getting the
        // errors
    }
}
