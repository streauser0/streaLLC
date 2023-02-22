import java.sql.Timestamp;
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
                c.setSymbol(rs.getString("Symbol"));
//TODO: Implement other values
               summaries.add(c);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return summaries;
    }

    public Summary getSummary(String symbol, Timestamp timestamp) {
        // TODO Auto-generated method stub
        return null;
    }

    public void updateSummary(Summary summary) {
        // TODO Auto-generated method stub
        
    }

    public void deleteSummary(Summary summary) {
        // TODO Auto-generated method stub
        
    }
    
}
