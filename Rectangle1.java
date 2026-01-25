class Rectangle1 {

    double width = 1;
    double height = 1;

    
    Rectangle1() {
       
    }

   
    Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

 
    double getArea() {
        return width * height;
    }


    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

     
        Rectangle1 r1 = new Rectangle1();
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());


        Rectangle1 r2 = new Rectangle1(4, 5);
        System.out.println("\nRectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
