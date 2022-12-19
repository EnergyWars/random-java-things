import java.util.Objects;

public class Bruch implements Addierer<Bruch, Bruch>, Subtrahierer {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        super();
        this.zaehler = zaehler;
        this.nenner = nenner;

        this.kuerze();
    }

    @Override
    public Bruch addiere(Bruch ziel) {
        return new Bruch((this.zaehler * ziel.nenner) + (ziel.zaehler * this.nenner), (this.nenner * ziel.nenner)).kuerze();
    }

    @Override
    public Subtrahierer subtrahiere(Operand target) {
        return null;
    }

    private Bruch kuerze() {
        for (int i = 2; i <= this.nenner; i++) {
            if (this.zaehler % i == 0 && this.nenner % i == 0) {
                this.zaehler /= i;
                this.nenner /= i;
                return this;
            }
        }

        return this;
    }

    @Override
    public String toString() {
        return "Bruch{" +
                "zaehler=" + zaehler +
                ", nenner=" + nenner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bruch bruch = (Bruch) o;
        this.kuerze();
        bruch.kuerze();
        return zaehler == bruch.zaehler && nenner == bruch.nenner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaehler, nenner);
    }
}
