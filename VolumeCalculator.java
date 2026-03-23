class VolumeCalculator {


    double calculateVolume(double side) {
        return side * side * side;
    }


    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }


    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

 
        double cubeVolume = vc.calculateVolume(3);
        System.out.println("Volume of Cube: " + cubeVolume);

    
        double rectVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);


        double sphereVolume = vc.calculateVolume(3.0f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}