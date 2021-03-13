package dhbw.fowler2.theatre;

public class Tragödie implements Schauspiel{

    Performance perf;
    Play play;
    Integer thisAmount = 40000;

    @Override
    public Integer priceCalculation() {
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        return thisAmount;
    }
}
