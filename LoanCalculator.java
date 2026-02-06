public class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI: ₹" + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI: ₹" + emi);
    }

    void calculateEMI(int principal, int time) {
        double rate = 10.0; // fixed 10%
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI: ₹" + emi);
    }

    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(3000000, 20, 7.5f);

        loan.calculateEMI(800000.0, 5, 9.0);

        loan.calculateEMI(200000, 3);
    }
}
