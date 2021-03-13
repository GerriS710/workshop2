package dhbw.fowler2.theatre;

public class ChooseSchauspiel {

    private Schauspiel schauspiel;

    public ChooseSchauspiel(Schauspiel schauspiel) {
        this.schauspiel = schauspiel;
    }

    public Integer berechnePreis(Performance performance) {
        return schauspiel.priceCalculation(performance);
    }
}
