package dhbw.fowler2.theatre;

public class Komödie extends Schauspiel{
    @Override
    public Integer priceCalculation(Integer thisAmount, Performance perf, Play play) {
        thisAmount = 30000;
        if (perf.audience > 20) {
            thisAmount += 10000 + 500 * (perf.audience - 20);
        }
        thisAmount += 300 * perf.audience;
        return thisAmount;
    }
}
