//Derek Huber
//Homework #2
//Arithmetic Java Program
//
//Define the class
public class Arithmetic {
    
    //Add the main method
    public static void main(String[] args) {
    
    //Declare variables
    
    //Number of pairs of socks:
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name):
    double sockCost$=2.58;
        
    //Number of drinking glasses:
    int nGlasses=6;
    //Cost per glass:
    double glassCost$=2.29;
        
    //Number of boxes of envelopes:
    int nEnvelopes=1;
    //cost per box of envelopes:
    double envelopeCost$=3.25;
    
    //Sales Tax
    double taxPercent=0.06;
    
        
        // Calculate subtotal, tax, and total (including tax) for socks, glasses, and envelopes
        
            //Socks
            double subtotalSocks$ = nSocks * sockCost$;
            double sockTax$ = (subtotalSocks$ * taxPercent);
            sockTax$ = (double)(Math.round(sockTax$ * 100)) / 100;
            double totalSockCost$ = subtotalSocks$ + sockTax$;
            totalSockCost$ = (double)(Math.round(totalSockCost$ * 100)) / 100;
        
            //Drinking Glasses
            double subtotalGlass$ = nGlasses * glassCost$;
            double glassTax$ = subtotalGlass$ * taxPercent;
            glassTax$ = (double)(Math.round(glassTax$ * 100)) / 100;
            double totalGlassCost$ = subtotalGlass$ + glassTax$;
            totalGlassCost$ = (double)(Math.round(totalGlassCost$ * 100)) / 100;
        
            //Envelopes
            double subtotalEnvelope$ = nEnvelopes * envelopeCost$;
            double envelopeTax$ = subtotalEnvelope$ * taxPercent;
            envelopeTax$ = (double)(Math.round(envelopeTax$ * 100)) / 100;
            double totalEnvelopeCost$ = subtotalEnvelope$ + envelopeTax$;
            totalEnvelopeCost$ = (double)(Math.round(totalEnvelopeCost$ * 100)) / 100;
        
            //Total
            double subtotal$ = subtotalSocks$ + subtotalGlass$ + subtotalEnvelope$;
            double totalTax$ = sockTax$ + glassTax$ + envelopeTax$;
            double totalCost$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
            totalCost$ = (double)(Math.round(totalCost$ * 100)) / 100;
        
        
        //Print out the amount paid for socks
        System.out.println("First, I bought socks");
        System.out.println("I bought 3 pairs");
        System.out.println("They cost $2.58 per pair");
        System.out.println("The subtotal for socks, without tax, was $" +subtotalSocks$);
        System.out.println("The sales tax on socks was $" +sockTax$);
        System.out.println("Including tax, for socks, I paid $" +totalSockCost$ +"0");
        System.out.println();
        
        //Print out the amount paid for glasses
        System.out.println("Next, I bought drinking glasses");
        System.out.println("I bought 6 glasses");
        System.out.println("They cost $2.29 per glass");
        System.out.println("The subtotal for glasses, without tax, was $" +subtotalGlass$);
        System.out.println("The sales tax on glasses was $" +glassTax$);
        System.out.println("Including tax, for glasses, I paid $" +totalGlassCost$);
        System.out.println();
        
        //Print out the amount paid for envelopes
        System.out.println("Lastly, I bought boxes of envelopes");
        System.out.println("I bought 1 box");
        System.out.println("They cost $3.25 per box");
        System.out.println("The subtotal for envelopes, without tax, was $" +subtotalEnvelope$);
        System.out.println("The sales tax on envelopes was $" +envelopeTax$ +"0");
        System.out.println("Including tax, for envelopes, I paid $" +totalEnvelopeCost$);
        System.out.println();
        
        //Print out the totals
        System.out.println("The subtotal for all items was $" + subtotal$);
        System.out.println("The total sales tax for all items was $" +totalTax$);
        System.out.println("Including tax, the total cost for all of my items was $" + totalCost$);
        System.out.println();
    
        
        
    }
}