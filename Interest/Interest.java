//Derek Huber
//Interest Calculator
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        
        int balance = 69;
        double interestRate = 0.07;
        double interestMult = 0.43;
        double interest = interestMult * interestRate;
        double balanceInterest = balance + interest;
        
        System.out.println(interest);

        
    }
}