import java.time.LocalDateTime;

public class Walrus extends Animal{

    private int intactFangs;

    public Walrus(String where, LocalDateTime when, String comment, int intactFangs) {
        super(where, when, comment);
        this.intactFangs = intactFangs;
    }

    public int getIntactFangs() {
        return intactFangs;
    }

    public void setIntactFangs(int intactFangs) {
        this.intactFangs = intactFangs;
    }

    @Override
    public String toString() {
        return "Hvalross {" + super.toString() +
                ", inntakte huggtenner='" + intactFangs + '\'' +
                '}';
    }
}
