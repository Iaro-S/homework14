package ro.fasttrackit.homework14;

import java.util.Objects;

public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = false;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quote)) return false;
        Quote quote1 = (Quote) o;
        return getId() == quote1.getId() && favourite == quote1.favourite && Objects.equals(getAuthor(), quote1.getAuthor()) && Objects.equals(getQuote(), quote1.getQuote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAuthor(), getQuote(), favourite);
    }
}
