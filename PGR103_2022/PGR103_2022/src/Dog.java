import java.time.LocalDateTime;

public class Dog extends Animal{

    private boolean leash;
    private String breed;

    public Dog(String where, LocalDateTime when, String comment, boolean leash, String breed) {
        super(where, when, comment);
        this.leash = leash;
        this.breed = breed;
    }

    public boolean isLeash() {
        return leash;
    }

    public void setLeash(boolean leash) {
        this.leash = leash;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Hund {" + super.toString() +
                ", trenger bånd='" + leash + '\'' +
                ", rase='" + breed + '\'' +
                '}';
    }
}
