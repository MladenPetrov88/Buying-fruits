import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPirce = 0;
        if (city.equalsIgnoreCase("sofia")) {
            if (product.equalsIgnoreCase("coffee")) {
                productPirce = 0.50;
            } else if (product.equalsIgnoreCase("water")) {
                productPirce = 0.80;
            } else if (product.equalsIgnoreCase("beer")) {
                productPirce = 1.20;
            } else if (product.equalsIgnoreCase("sweets")) {
                productPirce = 1.45;
            } else if (product.equalsIgnoreCase("peanuts")) {
                productPirce = 1.60;
            }
        }
        if (city.equalsIgnoreCase("plovdiv")) {
            if (product.equalsIgnoreCase("coffee")) {
                productPirce = 0.40;
            } else if (product.equalsIgnoreCase("water")) {
                productPirce = 0.70;
            } else if (product.equalsIgnoreCase("beer")) {
                productPirce = 1.15;
            } else if (product.equalsIgnoreCase("sweets")) {
                productPirce = 1.30;
            } else if (product.equalsIgnoreCase("peanuts")) {
                productPirce = 1.50;
            }
        }
        if (city.equalsIgnoreCase("varna")) {
            if (product.equalsIgnoreCase("coffee")) {
                productPirce = 0.45;
            } else if (product.equalsIgnoreCase("water")) {
                productPirce = 0.70;
            } else if (product.equalsIgnoreCase("beer")) {
                productPirce = 1.10;
            } else if (product.equalsIgnoreCase("sweets")) {
                productPirce = 1.35;
            } else if (product.equalsIgnoreCase("peanuts")) {
                productPirce = 1.55;
            }
        }
        System.out.println(productPirce * quantity);
    }
}

