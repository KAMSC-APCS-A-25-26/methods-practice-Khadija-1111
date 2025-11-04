import java.util.Scanner;
import java.text.DecimalFormat;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        Scanner sc = new Scanner(System.in);
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        System.out.print("Enter trip distance (miles): ");
        double distance = sc.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double avgSpeed = sc.nextDouble();
        System.out.print("Enter fuel efficency (miles per gallon): ");
        double fuelEfficency = sc.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double fuelPrice = sc.nextDouble();

        // TODO: Calculate travel time using a return method
        double travelTime= calculateTravelTime(distance, avgSpeed);
        // TODO: Calculate fuel needed using a return method
        double fuelNeeded = calculateFuelNeeded(distance, fuelEfficency);
        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(fuelNeeded, fuelPrice);
        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, tripCost);
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double x, double y){
        return x / y;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double x, double y){
        return x / y;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double x, double y){
        return x * y;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double x, double y, double z) {
        System.out.println("\nResults:");
        System.out.printf("Travel Time: %.2f hours\n", x);
        System.out.printf("Fuel Needed: %.2f gallons\n", y);
        System.out.printf("Trip cost: $%.2f\n", z);
    }
}
