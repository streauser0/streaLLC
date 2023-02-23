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
        System.out.println(s);

          
             
         }
    }
}
