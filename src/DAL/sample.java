import java.util.List;

public class sample {

    public static void main(String[] args) {
        
        CompanyDao x = CompanyDaoImpl.getInstance();
       List<Company> companies = x.getAllCompanies();
       for(Company c : companies){
    
//Todo: Move to ToString and review next time. Discuss factory pattern and list vs arraylist :)
            System.out.println("\n" + c.getSymbol() + "\t" + c.getName() + "\t\t" + c.getDescription()+ "\n");
            
        }

        SummaryDao sd = SummaryDaoImpl.getInstance();
        List<Summary> summaries = sd.getAllSummaries("RIG");
        for(Summary s : summaries){
     
 //Todo: Move to ToString and review next time. Discuss factory pattern and list vs arraylist :)
             System.out.print("\n" + s.getSymbol() + "  ");
             System.out.print(s.getFiftyTwoWeekHigh() + "  ");
             System.out.print(s.getFiftyTwoWeekLow() + "  ");
             System.out.print(s.getPe() + "  ");
             
         }
    }
}
