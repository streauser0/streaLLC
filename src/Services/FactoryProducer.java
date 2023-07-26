package Services;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){   
       if(rounded){
          return new FundamentalsFactory();         
       }else{
          return null;
       }
    }
 }