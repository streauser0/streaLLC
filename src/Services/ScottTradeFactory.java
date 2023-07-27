package Services;

public class ScottTradeFactory extends AbstractFactory {
    @Override
    public Stock getStockInfo(){
      return new Stock("CVX");
    }
 }