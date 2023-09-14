import java.time.LocalDateTime;

public class Cat extends Animal{

    private String color;

    public Cat(String where, LocalDateTime when, String comment, String color) {
        super(where, when, comment);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Katt {" + super.toString() +
                ", farge='" + color + '\'' +
                '}';
    }
}
