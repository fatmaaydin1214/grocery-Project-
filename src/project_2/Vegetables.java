package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vegetables {
    String vegetableName;
    double price;
    double quantity;

    public Vegetables(String vegetableName, double price) {
        this.vegetableName = vegetableName;
        this.price = price;
    }

    public Vegetables() {
    }

    @Override
    public String toString() {
        return vegetableName +
                ", price=" + price
                ;
    }

    public double calculate2() {
        Scanner scan = new Scanner(System.in);

        Vegetables patatoes = new Vegetables("Potatoes", 1.50);
        Vegetables onion = new Vegetables("Onion", 1);
        Vegetables pepperG = new Vegetables("PepperG", 2);
        Vegetables eggplant = new Vegetables("Eggplant", 3.50);
        Vegetables carrot = new Vegetables("Carrot", 1.20);


        System.out.println(patatoes);
        System.out.println(onion);
        System.out.println(pepperG);
        System.out.println(eggplant);
        System.out.println(carrot);

        double sum = 0;
        double vegetableSum = 0;

        List<String> vegetables = new ArrayList<>();
        List<Double> vegetablesSum = new ArrayList<>();


        System.out.println("Please enter the name of the vegetable you want to prchase");
        vegetableName = scan.next();

        while (vegetableName.charAt(0) != 'q') {

            System.out.println("Please enter the quantity of the vegetable kg");
            quantity = scan.nextDouble();
            if (vegetableName.equals("Potatoes")) {
                vegetableSum = patatoes.price * quantity;
                vegetables.add("Potatoes");
                vegetablesSum.add(vegetableSum);
            }
            if (vegetableName.equals("Onion")) {
                vegetableSum = onion.price * quantity;
                vegetables.add("Onion");
                vegetablesSum.add(vegetableSum);

            }
            if (vegetableName.equals("PepperG")) {
                vegetableSum = pepperG.price * quantity;
                vegetables.add("PepperG");
                vegetablesSum.add(vegetableSum);

            }
            if (vegetableName.equals("Eggplant")) {
                vegetableSum = eggplant.price * quantity;
                vegetables.add("Eggplant");
                vegetablesSum.add(vegetableSum);

            }
            if (vegetableName.equals("Carrot")) {
                vegetableSum = carrot.price * quantity;
                vegetables.add("Carrot");
                vegetablesSum.add(vegetableSum);

            }
            System.out.println(vegetables);
            System.out.println(vegetablesSum);

            sum += vegetableSum;

            System.out.println("Please enter the name of the fruit you want to purchase \n Press q to exit");
            vegetableName = scan.next();
        }

        System.out.println("Enter the name of the product you want to remove? \n  Press N to continue");
        vegetableName = scan.next();

        while (vegetableName.charAt(0) != 'n') {
            System.out.println("Please enter the quantity of the fruit kg");
            quantity = scan.nextDouble();
            if (vegetableName.equals("Potatoes")) {
                vegetableSum = patatoes.price * quantity;

            }
            if (vegetableName.equals("Onion")) {
                vegetableSum = onion.price * quantity;

            }
            if (vegetableName.equals("PepperG")) {
                vegetableSum = pepperG.price * quantity;


            }
            if (vegetableName.equals("Eggplant")) {
                vegetableSum = eggplant.price * quantity;

            }
            if (vegetableName.equals("Carrot")) {
                vegetableSum = carrot.price * quantity;

            }

            sum -= vegetableSum;

            System.out.println("Enter the name of the fruit you want to remove \n  Press N to continue");
            vegetableName = scan.next();
        }

        System.out.println("Total price of vegetables: " + sum);
        System.out.println();

        return sum;
    }
}
