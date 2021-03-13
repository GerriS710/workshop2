package dhbw.fowler2.theatre;

public class Tragödie extends Schauspiel{
    @Override
    public Integer priceCalculation(Integer thisAmount, Performance perf, Play play) {
        thisAmount = 40000;
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        return thisAmount;
    }
}
