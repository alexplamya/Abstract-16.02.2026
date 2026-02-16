package abstractclass;

abstract class Shape {

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimetr();

    abstract String getColor();

    public void printColor(){
        System.out.println(color);
    }
}
