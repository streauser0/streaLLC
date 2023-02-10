import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;

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

    @Override
    public void deleteCompany(Company company) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Company> getAllCompanies() {
        
        return null;
    }

    @Override
    public Company getCompany(String symbol) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateCompany(Company company) {
        // TODO Auto-generated method stub
        
    }
    
}
