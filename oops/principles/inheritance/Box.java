package principles.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // Passing all the three properties
    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // passing an old Box
    Box(Box oldBox){
        this.l = oldBox.l;
        this.h = oldBox.h;
        this.w = oldBox.w;
    }

    public void information(){
        System.out.println("Box is running...");
    }
}
