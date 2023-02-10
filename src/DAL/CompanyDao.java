import java.util.List;

public interface CompanyDao {
   public List<Company> getAllCompanies();
   public Company getCompany(String symbol);
   public void updateCompany(Company company);
   public void deleteCompany(Company company);
}