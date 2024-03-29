package DAL;

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

    public boolean deleteCompany(String symbol) {
        // delete from company where Symbol = 'MNM';
        boolean result = true;
        try{
            Statement s = conn.createStatement();
          int value = s.executeUpdate("delete from company where Symbol = '"+symbol+"'");
          if(value == 0){
            result = false;
          }
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;
        
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

    public boolean updateCompany(Company company) {
        // UPDATE company
        // SET Name = 'Transocean', Description = 'Small deep sea oil drilling company'
        // WHERE Symbol = 'RIG';
        boolean result = false;
        try{
            Statement s = conn.createStatement();
            s.executeUpdate("UPDATE company SET Name = '" + company.getName() + 
                            "', Description = '" + company.getDescription() + 
                            "' WHERE Symbol = '" + company.getSymbol() + "';");
            result = true;
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;
    }

    @Override
    public boolean addCompany(Company company) {
        /*
        INSERT INTO company (Symbol, name, Description)
        VALUES ('MNM', 'CANDY COMPANY', 'Chocolate');
        */
        boolean result = false;
        try{
            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO company (Symbol, name, Description) VALUES ('"+company.getSymbol()+
                                        "', '"+company.getName()+"', '"+company.getDescription()+"')");
            result = true;
        }
        catch(Exception e){
            System.out.println(e);
            }
    return result;
    
    }
    
}
