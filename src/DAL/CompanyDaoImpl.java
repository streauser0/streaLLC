import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class CompanyDaoImpl implements CompanyDao {

    private static CompanyDaoImpl instance = new CompanyDaoImpl();
    private Connection conn = null;

    private CompanyDaoImpl() {

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

    public static CompanyDaoImpl getInstance() {
        return instance;
    }

    public void deleteCompany(Company company) {
        // TODO Auto-generated method stub
        
    }

    public List<Company> getAllCompanies() {
        
        List<Company> companies = new ArrayList<Company>();
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from company");
            
            while(rs.next())
            {
                Company c = new Company();
                c.setDescription(rs.getString("Description"));
                c.setName(rs.getString("Name"));
                c.setSymbol(rs.getString("Symbol"));

               companies.add(c);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return companies;
    }
    
    public Company getCompany(String symbol) {
        Company c = new Company();
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from company " +
                                          "where symbol='" + symbol + "'");

            if(rs.next())
            {
                c.setDescription(rs.getString("Description"));
                c.setName(rs.getString("Name"));
                c.setSymbol(rs.getString("Symbol"));
            }            
        }
        catch(Exception e){
            System.out.println(e);
            }
    return c;
    }

    public void updateCompany(Company company) {
        // TODO Auto-generated method stub
        
    }
    
}
