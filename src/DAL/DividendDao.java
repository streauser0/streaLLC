package DAL;
import java.time.LocalDateTime;
import java.util.List;

public interface DividendDao {
//Instance methods
   
    public List getAllDividends(String ticker);
    public boolean addDividend(Dividend dividend);

  /* 
   public Company getDividend(String ticker, LocalDateTime exDividendDate);
   public boolean updateDividend(Dividend dividend);
   public boolean deleteDividend(String ticker, LocalDateTime exDividendDate);
*/
}