package Test;
import Services.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceTest {
    @Test
    public void test() {
        assertEquals(2, 1+1);
    }


    @Test
    public void testAbstractFactory(){
        System.out.println("Sample stock program.");
        AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.POLYGONIO);
        Stock stockInfo = factory.getStockInfo();
        System.out.println(stockInfo.getSymbol());
        assertEquals("MNM", stockInfo.getSymbol());

        factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.IEX);
        stockInfo = factory.getStockInfo();
        System.out.println(stockInfo.getSymbol());
        assertEquals("BLD", stockInfo.getSymbol());

        factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.SCOTTTRADE);
        stockInfo = factory.getStockInfo();
        System.out.println(stockInfo.getSymbol());
        assertEquals("CVX", stockInfo.getSymbol());
    }

}
