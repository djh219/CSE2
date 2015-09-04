//Derek Huber
//Friday, September 4
//CSE002 Section 310
//Lab 02
//Cyclometer Program

    //Class required for every Java program
public class Cyclometer {
    
        //main method required for every Java Program
    public static void main(String[] args) {
        
            //This is the input data, documented as varialbes
        int secsTrip1=480; //This is the number of seconds for Trip 1
        int secsTrip2=3220; // This is the number of seconds for Trip 2
        int countsTrip1=1561; //This is the number of counts for Trip 1
        int countsTrip2=9037; // This is the number of counts for Trip 2
        
            //These are some useful constants
        double wheelDiameter=27.0; //This is the diameter of the wheel
        double PI=3.14159; //This is the value for pi
        int feetPerMile=5280; //This is the value for the number of feet in a mile
        int inchesPerFoot=12; //This is the value for the number of inches in a foot
        int secondsPerMinute=60; //This is the value for the number of seconds in a minute
        
            //The following are variables for the distance of trip 1 and 2 as well as the total distance
        double distanceTrip1;
        double distanceTrip2;
        double totalDistance;
        
            //Next I print the numbers that I have stored in the variables 
            //that store number of seconds and counts
        System.out.println("Trip 1 took " 
            +(secsTrip1/secondsPerMinute)+" minutes and had "
            +countsTrip1+" counts.");
        System.out.println("Trip 2 took "
            + (secsTrip2/secondsPerMinute)+" minutes and had "
            +countsTrip2+" counts.");
       
            //Next I calculate the distances and store the values.
            //This is done by multiplying the number of counts by the wheel diameter and PI,
            //Then dividing by the number of inches per foot (12) and the number of
            //Feet per mile (5280). 
            //Total distance is founds by adding the two trips
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
            //Print the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }  //end of main method
}  //end of class
