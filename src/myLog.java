import java.text.NumberFormat;

public class myLog {
    Double num;
    Integer precision_k;

    public myLog(Double num, Integer precision_k) {
        this.num = num;
        this.precision_k = precision_k;
    }

    public Double Solve() {

        double result = num;
        double currentX=num;
        double iteration=num;
        int counter=3;

        //double precision=0.001;
        double precision = Math.pow(10, -(precision_k+1));

        while (Math.abs(iteration)>precision)
        {
            currentX*=num*num;
            iteration=currentX/counter;
            result +=iteration;
            counter+=2;
        }
        result=result*2;


        return result;
    }
}
