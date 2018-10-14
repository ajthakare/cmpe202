  

public interface Component {

    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
    void setPrintStrategy(PrintStrategy s);
    void printSlip();

}
 
