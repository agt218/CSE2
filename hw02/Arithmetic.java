//Alec Tilley
//Arithmetic Java Program
//9-8-15
//
//Create a Class
public class Arithmetic{
    //Add a Main Method
    public static void main(String[] args) {
        //Number of items bought
        int nSocks=3;
        int nGlasses=6;
        int nEnvelopes=1;
        //Item Cost
        double sockCost$=2.58;
        double glassesCost$=2.29;
        double envelopeCost$=3.25;
        double taxPercent=0.06;

        //Total cost of each item before sales tax
        double totalSockCost= nSocks * sockCost$;
        double totalGlassesCost= nGlasses * glassesCost$;
        double totalEnvelopeCost= nEnvelopes * envelopeCost$;
        //Total cost of order
        double totalOrder= totalSockCost + totalEnvelopeCost + totalGlassesCost;
        //Total amount of sales tax
        double totalTax= totalOrder* taxPercent;
        //Total cost of order with salex ta
        double totalOrderCost = totalOrder + totalTax;
        //Printing the results
        System.out.println("The total cost for 3 socks before tax is $" +totalSockCost );
        System.out.println("The total cost for 6 Glasses before tax is $" +totalGlassesCost );
        System.out.println("The total cosr for 1 envelope is $" +totalEnvelopeCost );
        System.out.println("The total cost for the order before tax is $" +totalOrder );
        System.out.println("The total amount of sales tax is $" +totalTax );
        System.out.println("The total amount paid for the order including sales tax is $" + totalOrderCost);
    }
}