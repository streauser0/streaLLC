import java.sql.Timestamp;
import java.util.List;

public interface SummaryDao {
//Instance methods
   public List<Summary> getAllSummaries(String symbol);
   public Summary getSummary(String symbol, Timestamp timestamp);
   public void updateSummary(Summary summary);
   public void deleteSummary(Summary summary);

}