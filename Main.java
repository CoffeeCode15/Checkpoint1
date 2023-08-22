public class Main {
    public static void printManufacturerFirstLetters(Product[] productArray) {
        for (Product product : productArray) {
            System.out.println(product.getManufacturer().charAt(0));
        }
    }
    
    public static float calcAverage(Product[] productArray) {
        int divisore = productArray.length;
        int sum = 0;
        for (Product product : productArray) {
            sum += product.getQuantity();
        }
        float average = (float) sum / divisore;
        return average;
    }
    
    public static void main(String[] args) {
        Product[] productArray = new Product[]{
                new Product("telefono", "samsung", 123456, 2),
                new Product("automobile", "Fiat", 456789, 1),
                new Product("televisore", "LG", 123789, 3),
        };
        
        printManufacturerFirstLetters(productArray);
        
        System.out.println("The average quantity is: " + calcAverage(productArray));
    }
}
