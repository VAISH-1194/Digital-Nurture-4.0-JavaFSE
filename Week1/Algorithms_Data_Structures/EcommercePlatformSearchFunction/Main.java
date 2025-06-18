package Week1.Algorithms_Data_Structures.EcommercePlatformSearchFunction;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Book", "Education"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "T-Shirt", "Clothing")
        };

        System.out.println(" Linear Search: Searching for 'Camera'");
        Product linearResult = SearchService.linearSearch(products, "Camera");
        System.out.println(linearResult != null ? "Found: " + linearResult : "Not Found");

        System.out.println("\n Binary Search: Searching for 'Camera'");
        Product binaryResult = SearchService.binarySearch(products, "Camera");
        System.out.println(binaryResult != null ? "Found: " + binaryResult : "Not Found");
    }
}