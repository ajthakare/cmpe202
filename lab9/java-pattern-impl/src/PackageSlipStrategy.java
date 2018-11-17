package lab9;

public class PackageSlipStrategy implements IStrategy {

    @Override
    public void execute(String[] order) {
        String[] out = new String[order.length];
        for (int i = 0; i < order.length; i++) {
            if(order[i].startsWith("->"))
                out[i] = order[i].substring(2) + " on Bottom bun";
            else
                out[i] = order[i] + " on Top bun";
        }
        System.out.println("Package Slip: ");
        for (String items : out) {
            System.out.println("\t" + items);
        }
    }
}
