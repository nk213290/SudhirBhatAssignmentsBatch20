package JavaOOPSConcepts;

public class LoanPaymentCalculator {
    double payment;

    // Simple Loan
    public double calculatePayment(double loanAmount, double interestRate) {
        payment = (loanAmount * (1 + interestRate)) / 12;
        return payment;
    }// Loan with Custom Term

    public double calculatePayment(double loanAmount, double interestRate, int numMonths) {
        payment = (loanAmount * (1 + interestRate)) / numMonths;
        return payment;
    }// Loan with Custom Term with Down Payment
    public double calculatePayment(double loanAmount, double interestRate, int numMonths, double downPayment) {
        payment = ((loanAmount - downPayment) * (1 + interestRate)) / numMonths;
        return payment;
    }
}


