package dhbw.fowler2.theatre;

public class Komödie extends Play {

    Integer thisAmount = 3000;

    public Komödie(String name, String type) {
        super(name, type);
    }




 /*   @Override
    public Integer priceCalculation(Performance perf) {
        if (perf.audience > 20) {
            thisAmount += 10000 + 500 * (perf.audience - 20);
        }
        thisAmount += 300 * perf.audience;
        return thisAmount;
    }
*/
}
