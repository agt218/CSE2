//Alec Tilley
//Lab02-Cyclometer program
//Create a program the records nd analyzes cycling data
//9-4-15
//
//Create a Class
public class Cyclometer{
    //Add a Main Method
    public static void main(String[] args) {
        int secsTrip1=480;  //The time of trip 1 in seconds
    	int secsTrip2=3220;  //The time of trip 2 in seconds
		int countsTrip1=1561;  //The number of counts for trip 1
		int countsTrip2=9037; //The number of counts for trip 2
        double wheelDiameter=27.0,  //Delcares the size of the wheel
  	    PI=3.14159, //Stores the value of pi
  	    feetPerMile=5280,  //Stores the number of feet per mile
  	    inchesPerFoot=12,   //Stores # of inches per foot
  	    secondsPerMinute=60;  //Defines how long a minute is in seconds
	    double distanceTrip1, distanceTrip2,totalDistance;  //
        System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
	    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance=distanceTrip1+distanceTrip2;
    	System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");
        }
    }