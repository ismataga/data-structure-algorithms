package org.mastercode.datastructurealgoritms.streamApi.transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
//        sortedAllTransactionIn2011ByValue(transactions);

//        uniqueCities(raoul, mario, alan, brian);
//        allTransactionsByRaoul(transactions);
//        namesSortedAlphabetically(transactions);
//        tradersBasedInMilan(transactions);
//        sortedAlllivingInCambridge(transactions);
        highestValueAllTransactions( transactions);
    }

    private static void allTransactionsByRaoul(List<Transaction> transactions) {
        List<Transaction> cambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(transaction -> transaction.getTrader().getName()))
                .collect(toList());
        System.out.println(cambridge);
    }

    private static void uniqueCities(Trader raoul, Trader mario, Trader alan, Trader brian) {
        List<Trader> trades = Arrays.asList(raoul, mario, alan, brian);
        List<String> distinctCities = trades.stream().map(Trader::getCity).distinct().collect(toList());
        System.out.println(distinctCities);
    }

    private static void sortedAllTransactionIn2011ByValue(List<Transaction> transactions) {
        List<Transaction> transactions2 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(toList());

        List<Trader> traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);
    }

    private static void namesSortedAlphabetically(List<Transaction> transactions) {

        String traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .map(Trader::getName)
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traders);
    }

    private static void tradersBasedInMilan(List<Transaction> transactions) {

        boolean traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .anyMatch(t -> t.getCity().equals("Milan"));
        System.out.println(traders);
    }

    private static void sortedAlllivingInCambridge(List<Transaction> transactions) {
        transactions.stream()
                .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    private static void highestValueAllTransactions(List<Transaction> transactions) {
    Optional<Integer> a =  transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(a);
    }
    private static void highestValueAllTransactionsin(List<Transaction> transactions) {
        Optional<Integer> a =  transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(a);
    }


}
