
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SummaryDaoImpl implements SummaryDao {

    private static SummaryDaoImpl instance = new SummaryDaoImpl();
    private Connection conn = null;

    private SummaryDaoImpl() {

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

    public static SummaryDaoImpl getInstance() {
        return instance;
    }

    public List<Summary> getAllSummaries(String symbol) {
        
        List<Summary> summaries = new ArrayList<Summary>();
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from summary where symbol = '" + symbol + "'");
            
            while(rs.next())
            {
                Summary c = new Summary();
                c.setId(rs.getInt("id"));
                c.setSymbol(rs.getString("Symbol"));
                c.setFiftyTwoWeekHigh(rs.getDouble("FiftyTwoWeekHigh"));
                c.setFiftyTwoWeekLow(rs.getDouble("FiftyTwoWeekLow"));
                c.setPe(rs.getDouble("PE"));

               summaries.add(c);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return summaries;
    }

    public Summary getSummary(int id) {
       Summary sum = new Summary(); 
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from summary " +
                                          "where Id ='" + id + "'");

            if(rs.next())
            {
                sum.setId(rs.getInt("Id"));
                sum.setSymbol(rs.getString("Symbol"));
                sum.setFiftyTwoWeekHigh(rs.getDouble("FiftyTwoWeekHigh"));
                sum.setFiftyTwoWeekLow(rs.getDouble("FiftyTwoWeekLow"));
                sum.setPe(rs.getDouble("PE"));
            }            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return sum;
    }

    public boolean updateSummary(Summary summary) {
      
        boolean result = false;
        try{
            Statement s = conn.createStatement();
           
            String query = "UPDATE summary SET pe = " + summary.getPe() + 
            ", FiftyTwoWeekHigh = " + summary.getFiftyTwoWeekHigh() +
            ", FiftyTwoWeekLow = " + summary.getFiftyTwoWeekLow() +
            " where id = " + summary.getId() + ";";

            s.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;
        
    }

    public boolean deleteSummary(int id) {
       //Delete from summary where Id = id
         boolean result = false;
         try{
             Statement s = conn.createStatement();
           int value = s.executeUpdate("delete from summary where Id = '"+id+"'");
           if(value != 0){
             result = true;
           }
         }
         catch(Exception e){
             System.out.println(e);
             }
     return result;
        
    }

    @Override
    public boolean addSummary(Summary summary) {

        /*
        INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
        VALUES ( 'RIG', 159.68, 123.84, 18.08);
        */
        boolean result = false;
        try{
            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO Summary (Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)" +
            "VALUES (" +
            "'" + summary.getSymbol() + "'," +
                  summary.getFiftyTwoWeekHigh() + "," +
                  summary.getFiftyTwoWeekLow() + "," +
                  summary.getPe() + ")");
            result = true;
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;

    }  
    
}
