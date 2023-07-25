package Test;
import DAL.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import example.util.Calculator;
//import org.junit.jupiter.api.Test;

import org.junit.Test;

public class AppTest {

 
    @Test
    public void test() {
        assertEquals(2, 1+1);
    }

    @Test
    public void createCompanyTest() {
        CompanyDao cd = CompanyDaoImpl.getInstance();
        String symbol = "AAPL";
        cd.deleteCompany(symbol);
        Company companyOne = new Company();
        companyOne.setName("Apple");
        companyOne.setDescription("Large deep sea oil drilling company");
        companyOne.setSymbol(symbol);
        
        boolean success = cd.addCompany(companyOne);
        assertEquals(success, true);

        Company result = cd.getCompany(symbol);
        assertEquals(result.getSymbol(), companyOne.getSymbol());
        
        companyOne.setDescription("Overpriced");
        
        success = cd.updateCompany(companyOne);
        assertEquals(success, true);

        result = cd.getCompany(symbol);
        assertEquals(result.getDescription(), companyOne.getDescription());


    }

}