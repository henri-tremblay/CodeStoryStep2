package fr.xebia.katas.gildedrose;

public class ItemDecorator extends Item {

    private Aging aging;

    private Categorie categorie;

    public static class Builder {

        // Required parameters
        private final String name;

        private final int sellIn;

        private final int quality;

        private Aging aging;

        private Categorie categorie;

        public Builder(String name, int sellIn, int quality) {
            this.name = name;
            this.sellIn = sellIn;
            this.quality = quality;
        }

        public Builder aging(Aging aging) {
            this.aging = aging;
            return this;
        }

        public Builder categorie(Categorie categorie) {
            this.categorie = categorie;
            return this;
        }

        public ItemDecorator build() {
            ItemDecorator item = new ItemDecorator(name, sellIn, quality);
            item.setAging(aging);
            item.setCategorie(categorie);
            return item;
        }
    }

    private ItemDecorator(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Aging getAging() {
        return aging;
    }

    public void setAging(Aging aging) {
        this.aging = aging;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void updateQuality() {
        categorie.computeQuality(this);
    }
}
