import java.time.LocalDateTime;

public class Bird extends Animal{

    private String birdType;
    private int number;

    public Bird(String where, LocalDateTime when, String comment, String birdType, int number) {
        super(where, when, comment);
        this.birdType = birdType;
        this.number = number;
    }

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Fugl {" + super.toString() +
                ", Type fugl='" + birdType + '\'' +
                ", nummer=" + number + '\'' +
                '}';
    }
}
