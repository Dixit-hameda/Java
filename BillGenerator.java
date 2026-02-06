public class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Total Amount to Pay: ₹" + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Total Amount to Pay: ₹" + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double discount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Discount Applied: " + discountPercent + "%");
        System.out.println("Total Amount to Pay: ₹" + finalAmount);
    }

    public static void main(String[] args) {

        BillGenerator bill = new BillGenerator();

        System.out.println("---- Shopping Mall Billing System ----\n");

        bill.generateBill(5000);

        System.out.println();

        bill.generateBill(5000, 500);

        System.out.println();

        bill.generateBill(5000, 10.0);
    }
}
