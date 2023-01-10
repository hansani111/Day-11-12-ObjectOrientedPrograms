package com.bridgelabz;

public class Account {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Account Management Program!!!!!!!!!");

        Stock stockObj = new Stock();
        StockPortfolio portfolio = new StockPortfolio();
        stockObj.addStocks(portfolio);
        portfolio.displayStockReport();
    }
}