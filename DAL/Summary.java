
public class Summary {
    
    private int id;
    private String symbol;
    private double fiftyTwoWeekHigh, fiftyTwoWeekLow, pe;

    Summary(){}

    //todo: implement timestamp

    Summary(int id, String symbol, double fiftyTwoWeekHigh,
     double fiftyTwoWeekLow, double pe) {
    this.id = id;
    this.symbol = symbol;
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    this.pe = pe;
   }
  


   public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getSymbol() {
        return symbol;
    }



    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }



    public double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }



    public void setFiftyTwoWeekHigh(double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }



    public double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }



    public void setFiftyTwoWeekLow(double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }



    public double getPe() {
        return pe;
    }



    public void setPe(double pe) {
        this.pe = pe;
    }


   

    @Override
    public String toString() {
        //return "Summary [id=" + id + ", symbol=" + symbol + ", fiftyTwoWeekHigh=" + fiftyTwoWeekHigh
          //      + ", fiftyTwoWeekLow=" + fiftyTwoWeekLow + ", pe=" + pe + "]";

        String result = getId() + "  " + getSymbol() + "  " + getFiftyTwoWeekHigh() + "  " + getFiftyTwoWeekLow() + "  " + getPe();
        return result;
    }

    

}