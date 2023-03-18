package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruits {
    String fruitName;
    double price;
    double quantity;

    public Fruits(String fruitName, double price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public Fruits() {
    }

    @Override
    public String toString() {
        return fruitName +
                ", price=" + price
                ;
    }

    public double calculate() {
        Scanner scan = new Scanner(System.in);

        Fruits apple = new Fruits("Apple", 2);
        Fruits banana = new Fruits("Banana", 1);
        Fruits plum = new Fruits("Plum", 3);
        Fruits strawberry = new Fruits("Strawberry", 5);
        Fruits cherry = new Fruits("Cherry", 10);


        System.out.println(apple);
        System.out.println(banana);
        System.out.println(plum);
        System.out.println(strawberry);
        System.out.println(cherry);

        double sum = 0;
        double fruitSum = 0;

        List<String> fruits = new ArrayList<>();
        List<Double> fruitsSum = new ArrayList<>();


        System.out.println("Please enter the name of the fruit you want to purchase");
        fruitName = scan.next();

        while (fruitName.charAt(0) != 'q') {

            System.out.println("Please enter the quantity of the fruit kg");
            quantity = scan.nextDouble();
            if (fruitName.equals("Apple")) {
                fruitSum = apple.price * quantity;
                fruits.add("Apple");
                fruitsSum.add(fruitSum);
            }
            if (fruitName.equals("Banana")) {
                fruitSum = banana.price * quantity;
                fruits.add("Banana");
                fruitsSum.add(fruitSum);

            }
            if (fruitName.equals("Plum")) {
                fruitSum = plum.price * quantity;
                fruits.add("Plum");
                fruitsSum.add(fruitSum);

            }
            if (fruitName.equals("Strawberry")) {
                fruitSum = strawberry.price * quantity;
                fruits.add("Strawberry");
                fruitsSum.add(fruitSum);

            }
            if (fruitName.equals("Cherry")) {
                fruitSum = cherry.price * quantity;
                fruits.add("Cherry");
                fruitsSum.add(fruitSum);

            }
            System.out.println(fruits);
            System.out.println(fruitsSum);

            sum += fruitSum;

            System.out.println("Please enter the name of the fruit you want to purchase \n Press q to exit");
            fruitName = scan.next();
        }

        System.out.println("Enter the name of the product you want to remove? \n  Press N to continue");
        fruitName = scan.next();

        while (fruitName.charAt(0) != 'n') {
            System.out.println("Please enter the quantity of the fruit kg");
            quantity = scan.nextDouble();
            if (fruitName.equals("Apple")) {
                fruitSum = apple.price * quantity;

            }
            if (fruitName.equals("Banana")) {
                fruitSum = banana.price * quantity;

            }
            if (fruitName.equals("Plum")) {
                fruitSum = plum.price * quantity;

            }
            if (fruitName.equals("Strawberry")) {
                fruitSum = strawberry.price * quantity;

            }
            if (fruitName.equals("Cherry")) {
                fruitSum = cherry.price * quantity;

            }

            sum -= fruitSum;

            System.out.println("Enter the name of the fruit you want to remove \n  Press N to continue");
            fruitName = scan.next();
        }

        System.out.println("Total price of fruits: " + sum);
        System.out.println();


        return sum;
    }
}
