package hr.fer.oop.mtexam.task2;

class Wallet {
    private int count;
    private Token[] tokens;

    public Wallet(int count) {
        this.count = count;
        this.tokens = new Token[count];
    }

    public int getCount() {
        return count;
    }

    public Token[] getTokens() {
        return tokens;
    }

    public void setToken(Token token, int index) {
        if (index < count) {
            tokens[index] = token;
        }
    }

    public void printWallet() {
        for (int i = 0; i < count; i++) {
            if(tokens[i] != null) {
                if(tokens[i] instanceof Cryptocurrency) {
                    System.out.printf("%s equals %s EUR, token type: hr.fer.oop.mtexam.task2.Cryptocurrency%n", tokens[i].toString(), ((Cryptocurrency) tokens[i]).getExchangeRate() * tokens[i].getAmount());
                }
                if(tokens[i] instanceof NFT) {
                    System.out.printf("%s, token type: hr.fer.oop.mtexam.task2.NFT%n", tokens[i].toString());

                }
            }
        }
    }
}
