package DAL;
import java.time.LocalDateTime;
import java.util.List;

public interface DividendDao {
//Instance methods
   
    public List getAllDividends(String symbol);
    public boolean addDividend(Dividend dividend);
    public boolean deleteDividends(String symbol);
    public Dividend getDividend(String symbol, LocalDateTime exDividendDate);

  
   public boolean updateDividend(Dividend dividend);


  

}
