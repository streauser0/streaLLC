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
                d.setCashAmount(rs.getDouble("CashAmount"));
                d.setDeclarationDate(rs.getObject("DeclarationDate", LocalDateTime.class));
                d.setDividendType(rs.getString("DividendType"));
                d.setExDividendDate(rs.getObject("ExDividendDate", LocalDateTime.class));
                d.setFrequency(rs.getInt("Frequency"));
                d.setPayDate(rs.getObject("PayDate", LocalDateTime.class));
                d.setRecordDate(rs.getObject("RecordDate", LocalDateTime.class));
                d.setTicker(rs.getString("Ticker"));
               dividends.add(d);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return dividends;
    }

    @Override
    public Dividend getDividend(String ticker, LocalDateTime exDividendDate) {

        Dividend dividend = new Dividend();
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from dividend " +
                                            "where Ticker ='" + ticker + "' AND ExDividendDate ='" + exDividendDate + "'");

            if(rs.next())
            {
                dividend.setCashAmount(rs.getDouble("CashAmount"));
                dividend.setDeclarationDate(rs.getObject("DeclarationDate", LocalDateTime.class));
                dividend.setDividendType(rs.getString("DividendType"));
                dividend.setExDividendDate(rs.getObject("ExDividendDate", LocalDateTime.class));
                dividend.setFrequency(rs.getInt("Frequency"));
                dividend.setPayDate(rs.getObject("PayDate", LocalDateTime.class));
                dividend.setRecordDate(rs.getObject("RecordDate", LocalDateTime.class));
                dividend.setTicker(rs.getString("Ticker"));
            }
        }
            catch(Exception e){
                System.out.println(e);
                }
        return dividend;
    }

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

    @Override
    public boolean deleteDividends(String ticker) {

        boolean result = false;
            try{
                Statement s = conn.createStatement();
                String query = "DELETE FROM Dividend WHERE Ticker = '" + ticker + "';";
                s.executeUpdate(query);
                result = true;
            }
            catch(Exception e){
                System.out.println(e);
                }
        return result;
    }

}
