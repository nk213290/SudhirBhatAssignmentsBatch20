package JavaOOPSConcepts;

public class E158OverloadingLoanPayment {
    public static void main(String[] args) {
        LoanPaymentCalculator loan = new LoanPaymentCalculator();
        System.out.println(loan.calculatePayment(10000,.0500));
        System.out.println(loan.calculatePayment(10000,.0500,24));
        System.out.println(loan.calculatePayment(10000,.0500,24,2000));
    }
}
