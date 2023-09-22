package DAL;
import java.time.LocalDateTime;
public class Dividend {
    
  
        private Double cashAmount;
        private String  dividendType, symbol;
        private int frequency;
        private LocalDateTime declarationDate, exDividendDate, payDate, recordDate;

        public Dividend() {
            this.cashAmount = 0.0;
            this.dividendType = "";
            this.symbol = "";
            this.frequency = 0;
            this.declarationDate = LocalDateTime.now();
            this.exDividendDate = LocalDateTime.now();
            this.payDate = LocalDateTime.now();
            this.recordDate = LocalDateTime.now();
            
        }

        public Dividend(Double cashAmount, String  dividendType, String symbol,
                 int frequency, LocalDateTime declarationDate, LocalDateTime exDividendDate ,
                 LocalDateTime payDate , LocalDateTime recordDate ){
         this.cashAmount = cashAmount;
         this.dividendType = dividendType;
         this.symbol = symbol;
         this.frequency = frequency;
         this.declarationDate = declarationDate;
         this.exDividendDate = exDividendDate;
         this.payDate = payDate;
         this.recordDate = recordDate;
        }
    
        public double getCashAmount() {
            return this.cashAmount;
        }

        public void setCashAmount(Double cashAmount) {
            this.cashAmount = cashAmount;
        }

        public String getDividendType() {
            return this.dividendType;
        }

        public void setDividendType(String dividendType) {
            this.dividendType = dividendType;
        }

        public String getSymbol() {
            return this.symbol;
        }
        
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public int getFrequency() {
            return this.frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public LocalDateTime getDeclarationDate() {
            return this.declarationDate;
        }

        public void setDeclarationDate(LocalDateTime declarationDate) {
            this.declarationDate = declarationDate;
        }

        public LocalDateTime getExDividendDate() {
            return this.exDividendDate;
        }
        
        public void setExDividendDate(LocalDateTime exDividendDate) {
            this.exDividendDate = exDividendDate;
        }

        public LocalDateTime getPayDate() {
            return this.payDate;
        }

        public void setPayDate(LocalDateTime payDate) {
            this.payDate = payDate;
        }

        public LocalDateTime getRecordDate() {
            return this.recordDate;
        }

        public void setRecordDate(LocalDateTime recordDate) {
            this.recordDate = recordDate;
        }

        @Override
        public String toString() {

           String result = this.symbol + "\t" + this.exDividendDate + "\t" + this.cashAmount;
           return result;


        }

        
}
