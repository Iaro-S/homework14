package ro.fasttrackit.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    public List<Quote> quoteList;

    public QuoteService(List<Quote> quoteList) {
        this.quoteList = new ArrayList<>();
        if (quoteList != null) {
            this.quoteList.addAll(quoteList);
        }
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quoteList) {
            if (quote.getAuthor().equals(author)) {
                result.add(quote);
            }
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
        for (Quote quote : quoteList) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
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

    public String getRandomQuote() {
        String result = null;
        Random random = new Random();
        int randomId = 1 + random.nextInt(5420);
        for (Quote quote : quoteList) {
            if (randomId == quote.getId()) {
                result = randomId + ": " + quote.getQuote();
            }
        }
        return result;
    }
}