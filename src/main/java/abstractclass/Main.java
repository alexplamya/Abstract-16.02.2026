package abstractclass;

public class Main {
    public static void main(String[] args) {
        Shape tr = new Triangle("green", 3, 5.5,5);
        System.out.println("Периметр: "+tr.getPerimetr());
        System.out.println("Цвет: "+tr.getColor());
        System.out.println("Площадь: "+tr.getArea());
        tr.printColor();
    }
}
