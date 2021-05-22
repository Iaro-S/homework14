package ro.fasttrackit.homework14;

import static ro.fasttrackit.homework14.readQuotesFromFile.readFromFile;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteService quoteList = new QuoteService(readFromFile());
        System.out.println(quoteList.getAllQuotes() + "\n");
        System.out.println(quoteList.getAuthors() + "\n");
        System.out.println(quoteList.getFavourites() + "\n");
    }
}
