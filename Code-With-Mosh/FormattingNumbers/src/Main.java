import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        $1,234,567
//        10%
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);

        String result = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(result);
    }
}