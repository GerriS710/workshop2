package dhbw.fowler2.theatre;

public class Tragödie extends Play{

    Integer thisAmount = 40000;

    public Tragödie(String name, String type, Performance perf) {
        super(name, type, perf);
    }

    @Override
    public Integer berechnePreis() {
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        return thisAmount;
    }
}
