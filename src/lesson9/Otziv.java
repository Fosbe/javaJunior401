package lesson9;

import java.util.Date;
import java.util.Objects;

public class Otziv {
    private int raiteng;

    private String textOfOtziv;
    private Date date;

    private User user;

    public Otziv() {
    }

    public Otziv(int raiteng, String textOfOtziv) {
        this.raiteng = raiteng;
        this.textOfOtziv = textOfOtziv;
    }

    public int getRaiteng() {
        return raiteng;
    }

    public void setRaiteng(int raiteng) {
        this.raiteng = raiteng;
    }

    public String getTextOfOtziv() {
        return textOfOtziv;
    }

    public void setTextOfOtziv(String textOfOtziv) {
        this.textOfOtziv = textOfOtziv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (raiteng != otziv.raiteng) return false;
        if (!Objects.equals(textOfOtziv, otziv.textOfOtziv)) return false;
        if (!Objects.equals(date, otziv.date)) return false;
        return Objects.equals(user, otziv.user);
    }

    @Override
    public int hashCode() {
        int result = raiteng;
        result = 31 * result + (textOfOtziv != null ? textOfOtziv.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "raiteng=" + raiteng +
                ", textOfOtziv='" + textOfOtziv + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
