import java.util.List;

public class sample {

    public static void main(String[] args) {
        
        CompanyDao x = CompanyDaoImpl.getInstance();
       List<Company> companies = x.getAllCompanies();
       for(Company c : companies){
    
//Todo: Move to ToString and review next time. Discuss factory pattern and list vs arraylist :)
            System.out.println(c);
            
        }

        SummaryDao sd = SummaryDaoImpl.getInstance();
        List<Summary> summaries = sd.getAllSummaries("CVX");
        for(Summary s : summaries){
        System.out.println(s);

          
             
         }
    }
}
