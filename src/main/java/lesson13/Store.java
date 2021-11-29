package lesson13;

public class Store {

    private int product = 0;

    public synchronized void getProduct() {
        if (product < 1) {
            System.out.println("Customer was blocked");
            try {
                wait();
                System.out.println("Customer unblocked");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Customer bought 1 item of product");
        System.out.println("Total amount of product: " + product);
        notify();
    }

    public synchronized void setProduct() {
        if (product > 3) {
            System.out.println("Seller was blocked");
            try {
                wait();
                System.out.println("Seller unblocked");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Seller added 1 item of product");
        System.out.println("Total amount of product: " + product);
        notify();
    }
}

class MainStore {
    public static void main(String[] args) {

        Store store = new Store();

        //Customer
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.getProduct();
            }
        }).start();

        //Seller
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.setProduct();
            }
        }).start();
    }
}
