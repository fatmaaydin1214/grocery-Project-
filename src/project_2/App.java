package project_2;

public class App {

    public static void main(String[] args) {

        double calculate = new Fruits().calculate();

        double calculate2 = new Vegetables().calculate2();

        double total = calculate + calculate2;


        if (total > 100) {
            System.out.println("Congrats! Your delivery is free because your purchase is more than 100 CHF " + "\nYour payment: " + total);

        } else if (total > 50) {

            total = total * 0.90;
            System.out.println("You've got 10% discount for your shopping over 50 CHF: " + total);
        } else {
            System.out.println("Your payment: " + total);
        }

    }
}
