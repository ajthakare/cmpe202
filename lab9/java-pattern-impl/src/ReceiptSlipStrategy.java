package lab9;

public class ReceiptSlipStrategy implements IStrategy {
    @Override
    public void execute(String[] order) {

        String[] out = new String[order.length];
        for (int i = 0; i < order.length; i++) {
            if(order[i].contains("Cheese"))
                out[i] = order[i] + " $0.49";
            else if(order[i].contains("Meat"))
                out[i] = order[i] + " $0.99";
            else
                out[i] = order[i] + " $0.29";
        }
        System.out.println("\nReceipt Slip: ");
        for (String items : out) {
            System.out.println("\t" + items);
        }
    }
}
