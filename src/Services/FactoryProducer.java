package Services;

public class FactoryProducer {
   
   public enum FactoryType {
      POLYGONIO, IEX, SCOTTTRADE
   }


    public static AbstractFactory getFactory(FactoryType factoryType){   
      AbstractFactory factory = null;
      
      switch (factoryType) {
         case POLYGONIO:
            factory = new PolygonioFactory();
            break;
         case IEX:
         factory = new IexFactory();
            break;
         case SCOTTTRADE:
         factory = new ScottTradeFactory();
            break;
      }
      return factory;
      
    }
 }