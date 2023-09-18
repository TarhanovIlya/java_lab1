import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class myLogTest {


    @org.junit.jupiter.api.Test
    void solveTesr1() {

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(5);


        myLog a = new myLog(0.5,5);
        assertEquals(a.Solve(),Double.parseDouble(formatter.format(Math.log((1+0.5)/(1-0.5)))));
    }

    @org.junit.jupiter.api.Test
    void solveTesr2False() {

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(5);


        myLog a = new myLog(0.8,5);
        assertEquals(a.Solve(),Double.parseDouble(formatter.format(Math.log((1+0.5)/(1-0.5)))));
    }

    @org.junit.jupiter.api.Test
    void solveTesr3() {

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(6);


        myLog a = new myLog(0.7,6);
        assertEquals(a.Solve(),Double.parseDouble(formatter.format(Math.log((1+0.7)/(1-0.7)))));
    }
}