package DAL;

public class sample {

    public static void main(String[] args) {
        System.out.println("Hello");
    }
//     public static void main(String[] args) {
        
//         CompanyDao cd = CompanyDaoImpl.getInstance();

//         Company companyOne = new Company();
//         companyOne.setName("Transocean Ltd");
//         companyOne.setDescription("Large deep sea oil drilling company");
//         companyOne.setSymbol("RIG");
//         cd.updateCompany(companyOne);

//         String symbol = "MNM";
//         boolean value = cd.deleteCompany(symbol);
//         if(value == false)
//              System.out.println("Unable to find "+symbol);
//         else
//              System.out.println(symbol+" Deleted");

//        List<Company> companies = cd.getAllCompanies();
//        for(Company c : companies){
    
// //Todo: Move to ToString and review next time. Discuss factory pattern and list vs arraylist :)
//             System.out.println(c);
            
//         }

//         SummaryDao sd = SummaryDaoImpl.getInstance();
//         //int id, String symbol, double fiftyTwoWeekHigh,
//         //double fiftyTwoWeekLow, double pe
//         Summary g = sd.getSummary(6);
//         g.setPe(100);

//         sd.updateSummary(g);

//         Summary s2 = new Summary(0, "CVX", 150, 140, 20);

//         sd.addSummary(s2);

//         List<Summary> summaries = sd.getAllSummaries("CVX");
//         for(Summary s : summaries){
//         System.out.println(s); 
             
//          }
        

//         System.out.println("--------------------------");
//         Company newCompany = cd.getCompany("CVX");
//         if (newCompany.getSymbol() != null)
//             System.out.println(newCompany);
//         else
//             System.out.println("Company not found."); 

//          Company c = new Company("MNM", "Mars", "A candy company corp");
//          cd.addCompany(c);

//          Summary summary = sd.getSummary(5);
//          System.out.println(summary);
         

//          sd.deleteSummary(5);

//          summary = sd.getSummary(5);
//          System.out.println(summary);
//     }
      


   


 }
