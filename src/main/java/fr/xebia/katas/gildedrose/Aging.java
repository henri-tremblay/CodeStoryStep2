package fr.xebia.katas.gildedrose;

public enum Aging {

    DECREASE(1, -1), INCREASE(1, 1), STABLE(0, 0);

    private int sellInDelta;

    private int qualityDelta;

    private Aging(int sellInDelta, int qualityDelta) {
        this.sellInDelta = sellInDelta;
        this.qualityDelta = qualityDelta;
    }

    public int getSellInDelta() {
        return sellInDelta;
    }

    public int getQualityDelta() {
        return qualityDelta;
    }

}
