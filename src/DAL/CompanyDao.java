import java.util.List;

public interface CompanyDao {
//Instance methods
   public List<Company> getAllCompanies();
   public boolean addCompany(Company company);
   public Company getCompany(String symbol);
   public boolean updateCompany(Company company);
   public boolean deleteCompany(String symbol);

}
