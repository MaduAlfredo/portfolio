package HeritageAndPolymorphism;

import HeritageAndPolymorphism.ENUMS.Destinations;
import HeritageAndPolymorphism.ENUMS.Planes;
import HeritageAndPolymorphism.ENUMS.RentingType;
import HeritageAndPolymorphism.Entities.CargoPlane;
import HeritageAndPolymorphism.Entities.CommercialPlane;
import HeritageAndPolymorphism.Entities.Plane;
import HeritageAndPolymorphism.Entities.PrivatePlane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Plane> flights = new ArrayList<>();

        System.out.println("Welcome to flight and aircraft registration system!");

        System.out.println("Plane ID: ");
        String ID = sc.nextLine();

        System.out.println("Select plane model:  ");
        for (Planes plane : Planes.values()) {
            System.out.println(plane.getPlaneType());
        }

        Planes planeModel = Planes.fromString(sc.nextLine());

        System.out.println("Destination:  ");
        for (Destinations destiny : Destinations.values()) {
            System.out.println(destiny.getDestinyName());
        }

        Destinations destination = Destinations.fromString(sc.nextLine());

        System.out.println("Type of flight: ");
        String flightType = sc.nextLine();

        System.out.println("Flight capacity: ");
        int planeCapacity = sc.nextInt();
        sc.nextLine();

        switch (flightType.toLowerCase()) {

            case "commercial":

                System.out.println("Flight attendant quantity: ");
                int flightAttendantQuantity = sc.nextInt();
                sc.nextLine();

                System.out.println("Ticket price: ");
                Double ticketPrice = sc.nextDouble();
                sc.nextLine();

                System.out.println("Passenger flying: ");
                int passengerQuantity = sc.nextInt();
                sc.nextLine();

                CommercialPlane commercialFlight = new CommercialPlane(
                        ID,
                        planeModel,
                        destination,
                        planeCapacity,
                        flightAttendantQuantity,
                        ticketPrice,
                        passengerQuantity
                );

                flights.add(commercialFlight);

                break;

            case "cargo":

                System.out.println("Describe what is being transported: ");
                String item = sc.nextLine();

                System.out.println("It is a living cargo? ");
                boolean liveCargo = sc.nextBoolean();
                sc.nextLine();

                System.out.println("What is the price by ton: ");
                double priceByTon = sc.nextDouble();
                sc.nextLine();

                System.out.println("Insert the total weight on board: ");
                int totalWeight = sc.nextInt();
                sc.nextLine();

                System.out.println("In flight team? ");
                boolean hasInFlightTeam = sc.nextBoolean();
                sc.nextLine();

                CargoPlane cargoFlight = new CargoPlane(
                        ID,
                        planeModel,
                        destination,
                        planeCapacity,
                        item,
                        liveCargo,
                        priceByTon,
                        totalWeight,
                        hasInFlightTeam
                );

                flights.add(cargoFlight);

                break;

            case "private":

                System.out.println("Number of passengers: ");
                int numberOfPassengers = sc.nextInt();
                sc.nextLine();

                System.out.println("Does the flight include cargo: ");
                boolean hasCargo = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Renting type: ");
                RentingType rentingType = RentingType.fromString(sc.nextLine());

                Integer daysQuantity = null;

                if (rentingType == RentingType.DAY) {
                    System.out.println("Number of rental days: ");
                    daysQuantity = sc.nextInt();
                    sc.nextLine();
                }

                PrivatePlane privateFlight = new PrivatePlane(
                        ID,
                        planeModel,
                        destination,
                        planeCapacity,
                        numberOfPassengers,
                        hasCargo,
                        rentingType
                );

                privateFlight.setDaysQuantity(daysQuantity);

                flights.add(privateFlight);

                break;

            default:
                System.out.println("Invalid flight type.");
        }

        for (Plane flight : flights) {
            System.out.println(flight);
        }

        sc.close();
    }

}
