package DAL;

public class Company {
    
  
        private String symbol, name, description;
     
       Company(){}



        Company(String symbol, String name, String description){
         this.symbol = symbol;
         this.name = name;
         this.description = description;
        }
       
        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        @Override
        public String toString() {
            //return "Company [symbol=" + symbol + ", name=" + name + ", description=" + description + "]";

           String result = getSymbol() + "\t" + getName() + "\t" + getDescription();
           return result;


        }

        
}
