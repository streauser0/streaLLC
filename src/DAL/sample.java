package DAL;

import java.util.List;

public class sample {

    public static void main(String[] args) {
        
        CompanyDao x = CompanyDaoImpl.getInstance();
       List<Company> companies = x.getAllCompanies();
       for(Company c : companies){
    
//Todo: Move to ToString and review next time
            System.out.println("\n" + c.getSymbol() + "\t" + c.getName() + "\t\t" + c.getDescription()+ "\n");
            
        }
    }
}
