package model;

/**
 * Created by a on 20/11/2016.
 */
public class Idiotizm {

    public String date;
    public String author;
    public String description;
    public String imgLink;

    @Override
    public String toString() {
        return "Idiotizm{" +
                "date='" + date + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", imgLink='" + imgLink + '\'' +
                '}';
    }
}
