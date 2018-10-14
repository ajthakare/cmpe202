  

public class Client {

    public static void main(String args[])
    {
        Component theOrder = BuildOrder.getOrder() ;
        
        theOrder.setPrintStrategy(new PrintReceiptSlip());
        theOrder.printSlip();
        
        theOrder.setPrintStrategy(new PrintPackageSlip());
        theOrder.printSlip();
        
    }
}
 
