package Model;

import DataSaveLoad.SaveData;

import java.util.HashMap;
import java.util.List;

public class Statistics {

    public static double getBalanceCurrency(Currency currency){
        SaveData sd = SaveData.getInstanceSaveDate();
        double amountBalance = 0;
        for (Account account : sd.getAccounts()) {
            if (currency.equals(account.getCurrency())) amountBalance += account.getAmount();
        }
        return amountBalance;
    }

    public static double getBalance(Currency currency){
        SaveData sd = SaveData.getInstanceSaveDate();
        double amountBalance = 0;
        for (Account account : sd.getAccounts()) {
            amountBalance += account.getAmount() * account.getCurrency().getRateByCurrency(currency);
        }
        return  amountBalance;
    }

    private static HashMap<String, Double> getDataForChartOnArticles(boolean income){
        List<Transaction> transactions = SaveData.getInstanceSaveDate().getTransactions();
        HashMap<String, Double> data = new HashMap<>();
        for (Transaction t : transactions) {
            if(income && t.getAmount()>0 || (!income && t.getAmount() <0)){
                double temp =0;
                double amount = t.getAmount();
                if (!income) amount *= -1;
                if (data.containsKey(t.getArticle().getTitle())) temp = data.get(t.getArticle().getTitle());
            }
        }
        return data;
    }
}
