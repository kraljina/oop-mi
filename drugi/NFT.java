package hr.fer.oop.mtexam.task2;

class NFT extends Token {

    public NFT(int amount, String name) {
        super(amount, name);
    }

    @Override
    public String getTokenType() {
        return "NFT";
    }

    @Override
    public String toString() {
        return (int) getAmount() + " " + getName();
    }
}
