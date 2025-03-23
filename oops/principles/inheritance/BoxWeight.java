package principles.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

//    public BoxWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public BoxWeight(double side, double weight) {
//        super(side);
//        this.weight = weight;
//    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        this.weight = weight;
    }

//    public BoxWeight(Box oldBox, double weight) {
//        super(oldBox);
//        this.weight = weight;
//    }
}
