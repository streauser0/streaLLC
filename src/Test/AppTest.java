package Test;
import DAL.*;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.time.LocalDateTime;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import example.util.Calculator;
//import org.junit.jupiter.api.Test;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class AppTest {

 
    @Test
    public void test() {
        assertEquals(2, 1+1);
    }


    @Test
    public void readAllDividendsTest() {
        DividendDao dd = DividendDaoImpl.getInstance();
        List<Dividend> dividends = dd.getAllDividends("AAPL");
        for (Dividend dividend : dividends) 
    { 
        System.out.println(dividend);
    }
    assertEquals(dividends.size(), 1);
    }

    @Test
    public void readDividendTest() {
        DividendDao dd = DividendDaoImpl.getInstance();
        String str = "2021-11-05 00:00"; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        Dividend dividend = dd.getDividend("AAPL", dateTime);
        assertEquals(dividend.getExDividendDate(), dateTime);
    }

    @Test
    public void addGetUpdateDeleteDividendTest() {
        DividendDao dd = DividendDaoImpl.getInstance();
        Dividend div = new Dividend();
        div.setSymbol("CVX");
        div.setExDividendDate(LocalDateTime.now());
        dd.addDividend(div);
        List<Dividend> dividends = dd.getAllDividends("CVX");
        assertEquals(dividends.size(), 1);
        

        Dividend div2 = dividends.get(0);
        div2.setFrequency(1);
        dd.updateDividend(div2);
        Dividend div3 = dd.getDividend(div2.getSymbol(),div2.getExDividendDate());
        assertEquals(div2.getFrequency(),div3.getFrequency());

        dd.deleteDividends("CVX");
        dividends = dd.getAllDividends("CVX");
        assertEquals(dividends.size(), 0);
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