package Week1.Algorithms_Data_Structures.FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08; 
        int years = 5;

        System.out.println(" Recursive Forecast:");
        double result = FinancialForecast.futureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: ₹" + result);

        System.out.println("\n Optimized Recursive Forecast with Memoization:");
        double optimizedResult = FinancialForecast.futureValueMemo(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: ₹" + optimizedResult);
    }
}