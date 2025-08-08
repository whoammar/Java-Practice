import java.util.Scanner;

public class Area36 {

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Area36() {
    }

    int area;
    int perimeter;
    int length;
    int width;

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        setLength(scanner.nextInt());
        System.out.println("Enter width of Rectangle: ");
        setWidth(scanner.nextInt());
        scanner.close();
    }
    public void calculations(){
        area = length+ width;
        perimeter = 2 * (length+ width);
    }
    public void display(){
        System.out.println("Area of Rectangle: "+ area);
        System.out.println("Perimeter of Rectangle: "+ perimeter);

        if (area>perimeter){
            System.out.println("Area is greater than perimeter.");
        }else {
            System.out.println("Perimeter is Greater than Area.");
        }

    }
}
