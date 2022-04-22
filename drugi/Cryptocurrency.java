package hr.fer.oop.mtexam.task2;

import java.util.Random;

class Cryptocurrency extends Token implements Exchangable{

    private double exchangeRate;
    private CryptocurrencyType type;

    public Cryptocurrency(double amount, CryptocurrencyType type){
        super(amount, type.toString());
        this.type = type;
        if (type == CryptocurrencyType.BTC) {
            this.exchangeRate = new Random().nextInt(40400,40900);
        } else {
            this.exchangeRate = new Random().nextInt(2900, 3000);
        }
    }

    public CryptocurrencyType getType() {
        return type;
    }

    public void setType(CryptocurrencyType type) {
        this.type = type;
    }

    @Override
    public String getTokenType() {
        return "Cryptocurrency";
    }



    @Override
    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return String.format("%.4f %s", getAmount(), type.toString());
    }
}
