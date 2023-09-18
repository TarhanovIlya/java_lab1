import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class myLogTest {


    @org.junit.jupiter.api.Test
    void solveTesr1() {
        double num = 0.3;
        int k = 5;
        myLog a = new myLog(num,k);

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        Double upsilon = Math.pow(10, -(k));

        Double expected = Math.log((1+num)/(1-num));
        Double actual = Double.parseDouble(formatter.format(a.Solve())); //trimmed result of myLog.Solve

        assertTrue(Math.abs(actual-expected)<upsilon);

    }

    @org.junit.jupiter.api.Test
    void solveTesr2() {
        double num = 0.5;
        int k = 2;
        myLog a = new myLog(num,k);

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        Double upsilon = Math.pow(10, -(k));

        Double expected = Math.log((1+num)/(1-num));
        Double actual = Double.parseDouble(formatter.format(a.Solve())); //trimmed result of myLog.Solve

        assertTrue(Math.abs(actual-expected)<upsilon);
    }

    @org.junit.jupiter.api.Test
    void solveTesr3() {
        double num = 0.8;
        int k = 5;
        myLog a = new myLog(num,k);

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        Double upsilon = Math.pow(10, -(k));

        Double expected = Math.log((1+num)/(1-num));
        Double actual = Double.parseDouble(formatter.format(a.Solve())); //trimmed result of myLog.Solve

        assertTrue(Math.abs(actual-expected)<upsilon);
    }
}