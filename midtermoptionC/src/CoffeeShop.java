import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Select a coffee base: Espresso, Cappuccino, Latte, Americano");
        String coffeeType = scanner.nextLine();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        while (true) {
            System.out.println("Add toppings: Milk, Caramel, WhippedCream, Chocolate (type 'done' to finish)");
            String topping = scanner.nextLine().toLowerCase();

            switch (topping) {
                case "milk": coffee = new MilkDecorator(coffee); break;
                case "caramel": coffee = new CaramelDecorator(coffee); break;
                case "whippedcream": coffee = new WhippedCreamDecorator(coffee); break;
                case "chocolate": coffee = new ChocolateDecorator(coffee); break;
                case "done":
                    System.out.println("Final order: " + coffee.getDescription());
                    System.out.println("Total cost: $" + coffee.getCost());
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid topping, please try again.");
            }
        }
    }
}