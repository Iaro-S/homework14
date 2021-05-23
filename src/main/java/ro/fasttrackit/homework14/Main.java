package ro.fasttrackit.homework14;

import static ro.fasttrackit.homework14.ReadQuotesFromFile.readFromFile;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteService quoteList = new QuoteService(readFromFile());
        System.out.println(quoteList.getAllQuotes() + "\n");
        System.out.println(quoteList.getQuotesForAuthor("Buddha"));
        System.out.println(quoteList.getAuthors() + "\n");
        quoteList.setFavourite(5);
        quoteList.setFavourite(1754);
        quoteList.setFavourite(3200);
        System.out.println(quoteList.getFavourites() + "\n");
        System.out.println(quoteList.getRandomQuote());
    }
}
