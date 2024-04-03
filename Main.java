public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println("Calculation : " + Calculator.add(10 , 15));
        System.out.println("Compound Interest : " + CompoundInterestCalculator.calculate(100000 , 8 ,5));
        System.out.println("SIP return : " + SIPCalculator.calculate(10000 , 12 , 12 , 20));
        System.out.println("Home loan : " + HomeLoanCalculator.calculate());
    }
}
