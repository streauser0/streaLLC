package DAL;
import java.time.LocalDateTime;
public class Dividend {
    
  
        private Double cashAmount;
        private String  dividendType, ticker;
        private int frequency;
        private LocalDateTime declarationDate, exDividendDate, payDate, recordDate;

       public Dividend(){}



        Dividend(Double cashAmount, String  dividendType, String ticker,
                 int frequency, LocalDateTime declarationDate, LocalDateTime exDividendDate ,
                 LocalDateTime payDate , LocalDateTime recordDate ){
         this.cashAmount = cashAmount;
         this.dividendType = dividendType;
         this.ticker = ticker;
         this.frequency = frequency;
         this.declarationDate = declarationDate;
         this.exDividendDate = exDividendDate;
         this.payDate = payDate;
         this.recordDate = recordDate;
        }
    
        
        public void setTicker(String ticker) {
            this.ticker = ticker;
        }

        public void setCashAmount(Double cashAmount) {
            this.cashAmount = cashAmount;
        }
        
        public void setExDividendDate(LocalDateTime exDividendDate) {
            this.exDividendDate = exDividendDate;
        }
       



        @Override
        public String toString() {

           String result = this.ticker + "\t" + this.exDividendDate + "\t" + this.cashAmount;
           return result;


        }

        
}
