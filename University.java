class University {


    static int totalStudents;

    static String universityName;

    static {
        universityName = "Saffrony University";
        totalStudents = 0;
        System.out.println("Static Block Executed");
        System.out.println("University Name: " + universityName);
    }


    {
        System.out.println("Instance Block Executed - New Student Object Created");
    }
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }


    static int getTotalStudents() {
        return totalStudents;
    }
    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        University s1 = new University();
        System.out.println();

        University s2 = new University();
        System.out.println();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}