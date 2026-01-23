class Rectangle {

   
    double width;
    double height;


    Rectangle() {
        width = 1;
        height = 1;
    }

  
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

  
    double getArea() {
        return width * height;
    }

    
    double getPerimeter() {
        return 2 * (width + height);
    }

 
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();          // default rectangle
        Rectangle r2 = new Rectangle(5, 3);      // rectangle with given values

        System.out.println("Default Rectangle Area: " + r1.getArea());
        System.out.println("Default Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle Area: " + r2.getArea());
        System.out.println("Rectangle Perimeter: " + r2.getPerimeter());
    }
}
