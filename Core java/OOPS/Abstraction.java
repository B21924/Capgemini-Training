abstract class Loan {

    double loanAmount;
    int creditScore;

    Loan(double loanAmount, int creditScore) {
        this.loanAmount = loanAmount;
        this.creditScore = creditScore;
    }

    abstract void applyLoan();
    abstract void checkEligibility();
    abstract void calculateEMI();
    abstract void approveLoan();
}


class HomeLoan extends Loan {

    HomeLoan(double loanAmount, int creditScore) {
        super(loanAmount, creditScore);
    }

    @Override
    void applyLoan() {
        System.out.println("Loan applied");
    }

    @Override
    void checkEligibility() {
        if (creditScore >= 750) {
            System.out.println("Eligibility check passed");
        } else {
            System.out.println("Eligibility check failed");
        }
    }

    @Override
    void calculateEMI() {
        System.out.println("EMI calculated");
    }

    @Override
    void approveLoan() {
        if (creditScore >= 750) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan rejected");
        }
    }
}


public class Abstraction {

    public static void main(String[] args) {

        
        Loan loan = new HomeLoan(2000000, 780);

        loan.applyLoan();
        loan.checkEligibility();
        loan.calculateEMI();
        loan.approveLoan();
    }
}
