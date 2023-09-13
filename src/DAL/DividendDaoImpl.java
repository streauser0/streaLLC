package DAL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DividendDaoImpl implements DividendDao{
    
    private static DividendDaoImpl instance = new DividendDaoImpl();
    private Connection conn = null;

    private DividendDaoImpl() {

        if (instance == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/strea";
                String username = "root";
                String password = "root";
    
                Class.forName("com.mysql.cj.jdbc.Driver");
    
                conn = DriverManager.getConnection(url, username, password);
                instance = this;
            }
            catch(Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    public static DividendDaoImpl getInstance() {
        return instance;
    }

    public List<Dividend> getAllDividends(String ticker) {
        
        List<Dividend> dividends = new ArrayList<Dividend>();
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from dividend where ticker = '"+ ticker +"'");
            
            while(rs.next())
            {
                Dividend d = new Dividend();
                d.setTicker(rs.getString("Ticker"));
                d.setCashAmount(rs.getDouble("CashAmount"));
                d.setExDividendDate(rs.getObject("ExDividendDate", LocalDateTime.class));

               dividends.add(d);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return dividends;
    }

    //public boolean addDividend(Dividend dividend);
    @Override
    public boolean addDividend(Dividend dividend) {

        boolean result = false;
        try{
            Statement s = conn.createStatement();
            String query = "INSERT INTO Dividend (CashAmount, DeclarationDate, DividendType, " +
            "ExDividendDate, Frequency, PayDate, RecordDate, Ticker)" +
            "VALUES (" +
            + dividend.getCashAmount() + "," +
            "'" + dividend.getDeclarationDate() + "'," +
            "'" + dividend.getDividendType() +  "'," +
            "'" + dividend.getExDividendDate() + "'," +
                  dividend.getFrequency() + "," +
           "'" +  dividend.getPayDate() + "'," +
           "'" +  dividend.getRecordDate() + "'," +
           "'" +  dividend.getTicker() + "')";
            s.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;

    }  
}
