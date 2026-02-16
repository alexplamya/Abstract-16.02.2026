package abstractclass;

public class Triangle extends Shape {
    private final double sideLength1;
    private final double sideLength2;
    private final double sideLength3;

    public Triangle(String color, double sideLength1, double sideLength2, double sideLength3){
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    @Override
    double getArea(){return (sideLength1+sideLength2+sideLength3)/2;}

    @Override
    double getPerimetr(){return sideLength1+sideLength2+sideLength3;}

    @Override
    public String getColor(){return super.color;}
}
