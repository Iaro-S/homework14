package ro.fasttrackit.homework14;

import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    public List<Quote> quoteList;

    public QuoteService(List<Quote> quoteList) {
        this.quoteList = new ArrayList<>();
        this.quoteList.addAll(quoteList);
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            result.add(quote.getAuthor());
        }
        return result;
    }

    public void setFavourite(int id) {
        setFavourite(id);
    }

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            if (quote.getFavourite()) {
                result.add(quote);
            }
        }
        return result;
    }
}
