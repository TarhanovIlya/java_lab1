import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
//12

class Program {


    public static void main(String[] args) {
        try {

            // ln((1 + x) / (1 - x))
            System.out.printf("enter a number (-1;1): ");

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            /* чтение строки из буфера; метод readLine() требует обработки возможной ошибки при вводе c консоли в блоке try */
            String line = br.readLine();
            //пробуем перевести строку в число
            double number = Double.parseDouble(line);
            if(number<=-1 || number>=1)
            { IllegalArgumentException problem=new IllegalArgumentException() ;
                throw problem;
            }



            System.out.printf("enter a precision: ");
            line = br.readLine();
            int k=Integer.parseInt(line);
            double precision = Math.pow(10, -(k+1));


            myLog log = new myLog(number,k);


            //
            double expected_result= Math.log((1+number)/(1-number));
            //

            NumberFormat formatter = NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(k);

            System.out.println("result = " + log.Solve());
            System.out.println("expected result = " + formatter.format(expected_result));


        }







        catch (NumberFormatException e) //введено НЕ число, преобразовать к типу int нельзя
        {
            System.out.println("Не целое число");
        }

        catch (IOException e) {
            System.out.println("Ошибка чтения с клавиатуры");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Число вне допустимого отрезка");
        }


    }
}