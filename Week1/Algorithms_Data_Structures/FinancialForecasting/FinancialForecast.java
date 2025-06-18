package Week1.Algorithms_Data_Structures.FinancialForecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecast {
    public static double futureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return futureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemo(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;

        if (memo.containsKey(years)) return memo.get(years);

        double value = futureValueMemo(initialValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, value);
        return value;
    }
}
