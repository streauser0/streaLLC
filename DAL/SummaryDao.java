
import java.sql.Timestamp;
import java.util.List;

public interface SummaryDao {
//Instance methods
   public List<Summary> getAllSummaries(String symbol);
   public Summary getSummary(int id);
   public boolean updateSummary(Summary summary);
   public boolean deleteSummary(int id);
   public boolean addSummary(Summary summary);

}