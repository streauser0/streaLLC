package Services;

public class PolygonioFactory extends AbstractFactory {
    @Override
    public Stock getStockInfo(){
      return new Stock("MNM");
    }
 }