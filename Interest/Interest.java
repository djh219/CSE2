//Derek Huber
//Interest Calculator

public class Interest {
    public static void main(String[] args) {
        
        int balance = 69;
        double interestRate = 0.07;
        double interestMult = 0.43;
        double interest = interestMult * interestRate;
        DecimalFormat twoDForm = new DecimalFormat("#.00");
       
       
        double balanceInterest = balance + interest;
        
        System.out.println(interest);
        System.out.println(interest1);
        System.out.println(twoDform.format(interest1));
        
        
        
    }
}