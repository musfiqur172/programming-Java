public class Main {
    public static void main(String[] args) {
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean isEligible = hasHighIncome || hasGoodCredit;

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasHighIncome;

        System.out.println(isEligible);
    }
}