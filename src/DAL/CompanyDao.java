import java.util.List;

public interface CompanyDao {
//Instance methods
   public List<Company> getAllCompanies();
   public Company getCompany(String symbol);
   public void updateCompany(Company company);
   public boolean deleteCompany(String symbol);

}
