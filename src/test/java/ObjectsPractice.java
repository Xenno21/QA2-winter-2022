import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();
        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("rigas str.22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("lubanas43");
        secondOrder.setItemCount(3);

        System.out.println("hello");
        System.out.println("1st order");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2st order");
        System.out.println(secondOrder.getTotalPrice());












    }
}
