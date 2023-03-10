import java.util.List;

public class sample {

    public static void main(String[] args) {
        
        CompanyDao cd = CompanyDaoImpl.getInstance();
        String symbol = "MNM";
        /*boolean value = cd.deleteCompany(symbol);
        if(value == false)
             System.out.println("Unable to find "+symbol);
        else
             System.out.println(symbol+" Deleted");*/

       List<Company> companies = cd.getAllCompanies();
       for(Company c : companies){
    
//Todo: Move to ToString and review next time. Discuss factory pattern and list vs arraylist :)
            System.out.println(c);
            
        }

        SummaryDao sd = SummaryDaoImpl.getInstance();
        List<Summary> summaries = sd.getAllSummaries("CVX");
        for(Summary s : summaries){
        System.out.println(s); 
             
         }
        

        System.out.println("--------------------------");
        Company newCompany = cd.getCompany("CVX");
        if (newCompany.getSymbol() != null)
            System.out.println(newCompany);
        else
            System.out.println("Company not found."); 

         Company c = new Company("MNM", "Mars", "A candy company corp");
         cd.addCompany(c);
    }


}
