package ro.fasttrackit.homework14;

import java.util.*;

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

    public Set<String> getAuthors() {
        Set<String> result = new HashSet<>();
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
        Random random = new Random();
        int randomId = 1 + random.nextInt(quoteList.size());
        return quoteList.get(randomId).getQuote();
    }
}