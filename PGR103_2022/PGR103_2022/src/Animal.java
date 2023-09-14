import java.time.LocalDateTime;

abstract class Animal {
    private String where;
    private LocalDateTime when;
    private String comment;

    public Animal(String where, LocalDateTime when, String comment) {
        this.where = where;
        this.when = when;
        this.comment = comment;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return  "hvor='" + where + '\'' +
                ", når='" + when + '\'' +
                ", kommentar='" + comment + '\'';
    }
}
