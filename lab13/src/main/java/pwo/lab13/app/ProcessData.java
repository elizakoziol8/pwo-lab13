package pwo.lab13.app;

public class ProcessData {

    public enum Action {
        UNDEFINE, SUM, MAX
    }

    public Double process(Action action, double[] numbers) {

        switch (action) {

            case SUM:
                return sum(numbers);

            case MAX:
                return max(numbers);

            default:
                return null;

        }
    }

    /*
ZWaraca sume tablicy.
     */
    private Double sum(double[] numbers) {
        if (numbers.length == 0) return null;
        double sum = 0;
        for(double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /*
Zwraca max z podanej tablicy.
     */
    private Double max(double[] numbers) {
        if (numbers.length == 0) return null;
        double max = numbers[0];
        for(double num : numbers) {
            if(num > max) max = num;
        }
        return max;
    }
}