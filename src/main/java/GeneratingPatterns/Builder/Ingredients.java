package GeneratingPatterns.Builder;

public class Ingredients {
    private boolean corn;
    private boolean ananas;
    private boolean chiken;
    private boolean lem;
    private boolean biff;
    private boolean chess;
    private boolean rukula;

    public boolean isCorn() {
        return corn;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public boolean isAnanas() {
        return ananas;
    }

    public void setAnanas(boolean ananas) {
        this.ananas = ananas;
    }

    public boolean isChiken() {
        return chiken;
    }

    public void setChiken(boolean chiken) {
        this.chiken = chiken;
    }

    public boolean isLem() {
        return lem;
    }

    public void setLem(boolean lem) {
        this.lem = lem;
    }

    public boolean isBiff() {
        return biff;
    }

    public void setBiff(boolean biff) {
        this.biff = biff;
    }

    public boolean isChess() {
        return chess;
    }

    public void setChess(boolean chess) {
        this.chess = chess;
    }

    public boolean isRukula() {
        return rukula;
    }

    public void setRukula(boolean rukula) {
        this.rukula = rukula;
    }

    @Override
    public String toString() {
        return "\tcorn : " + corn + "\n" +
                "\tananas : " + ananas + "\n" +
                "\tchiken : " + chiken + "\n" +
                "\tlem : " + lem + "\n" +
                "\tbiff : " + biff + "\n" +
                "\tchess : " + chess + "\n" +
                "\trukula : " + rukula + "\n";
    }
}
