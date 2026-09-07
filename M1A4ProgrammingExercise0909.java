public class M1A4ProgrammingExercise0909 {

    public static void main(String[] args) {


        //creating 3 regularpolygon objects using different constructors
        RegularPolygon polygon1 = new RegularPolygon();

        RegularPolygon polygon2 = new RegularPolygon(6, 4);

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);


        //displaying perimeter and area of the first polygon
        System.out.println("Polygon 1");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println();


        //displaying perimeter and area for the second polygon
        System.out.println("Polygon 2");
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println();

        //displaying perimeter and area for the third polygon
        System.out.println("Polygon 3");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}


class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;


    public RegularPolygon() {

    }


    //constructor that sets the number of sides and side length
    public RegularPolygon(int n, double side) {

        this.n = n;
        this.side = side;
    }


    //constructor for setting all data fields
    public RegularPolygon(int n, double side, double x, double y) {

        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }


     //returns the number of sides
    public int getN() {

        return n;
    }


    // sets the number of sides
    public void setN(int n) {

        this.n = n;
    }


    // returns the side length
    public double getSide() {

        return side;
    }


    // sets the side length
    public void setSide(double side) {

        this.side = side;
    }


    // returns the xcoordinate
    public double getX() {

        return x;
    }


    // sets the xcoordinate
    public void setX(double x) {

        this.x = x;
    }


    // returns the ycoordinate
    public double getY() {

        return y;
    }


    // sets the ycoordinate
    public void setY(double y) {

        this.y = y;
    }


    public double getPerimeter() {

        return n * side;
    }

    public double getArea() {

        return (n * side * side) /
                (4 * Math.tan(Math.PI / n));
    }

    
}