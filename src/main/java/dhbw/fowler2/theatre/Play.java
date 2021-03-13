package dhbw.fowler2.theatre;

public abstract class Play {

    public Performance perf;
    public String name;
    public String type;

    public Play(String name, String type, Performance perf) {
        this.perf = perf;
        this.name = name;
        this.type = type;
    }

    public abstract Integer berechnePreis();
}
