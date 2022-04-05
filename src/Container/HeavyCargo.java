package Container;

import java.util.LinkedList;
import Program.*;

public class HeavyCargo extends StandardContainer {

    public HeavyCargo(Sender sender, String security, double tare, double netWeight, double grossWeight,String certificates) {
        super(sender, security, tare, netWeight, grossWeight, certificates);
    }

    public String print() {
        return "(id=" + id + ") Heavy container";
    }

    @Override
    public String toString(){
        return id + ";" + "Heavy;" + sender.getId() + ";" + shipId + ";" + security + ";" + tare + ";" + netWeight + ";" + grossWeight + ";" + certificates;
    }
}