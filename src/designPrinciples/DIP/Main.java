package designPrinciples.DIP;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();

        System.out.println("顾客购买了以下商品");
        c.shopping(new BeijingShop());
        c.shopping(new HenanShop());
    }
}
