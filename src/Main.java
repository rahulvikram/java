public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("2397394", "12837", "Toothbrush", 2, 11.99);
        Order order2 = new Order("8472910", "45629", "Coffee Mug", 1, 14.99);
        Order order3 = new Order("3847561", "78123", "Phone Charger", 3, 9.99);
        Order order4 = new Order("9283746", "34521", "Notebook", 5, 4.99);

        Transaction transaction = new Transaction("9283478923", "343453", "Vibrator", 4, 119.54, "apple");
    }
}