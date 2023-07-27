package Services;

public class IexFactory extends AbstractFactory {
    @Override
    public Stock getStockInfo(){
      return new Stock("BLD");
    }
 }