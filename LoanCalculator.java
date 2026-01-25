class LoanCalculator {

 
    void calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Home Loan EMI = %.2f%n", emi);
    }

        void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Vehicle Loan EMI = %.2f%n", emi);
    }

    
    void calculateEMI(int principal, int time) {
        double rate = 10.0; // fixed 10%
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Personal Loan EMI = %.2f%n", emi);
    }

    
    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

  
        loan.calculateEMI(5000000, 20, 8.5f);

 
        loan.calculateEMI(800000.0, 5, 9.2);


        loan.calculateEMI(200000, 3);
    }
}
