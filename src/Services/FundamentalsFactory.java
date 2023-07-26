package Services;

public class FundamentalsFactory extends AbstractFactory {

    public Fundamentals getFundamentals(String fundamentalsType) {  
       if(fundamentalsType.equalsIgnoreCase("COMPANY")){
          return new Company();         
       }else if(fundamentalsType.equalsIgnoreCase("SUMMARY")){
          return new Summary();
       }	 
       return null;
    }
 }