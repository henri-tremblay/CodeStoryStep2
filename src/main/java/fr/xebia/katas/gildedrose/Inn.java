package fr.xebia.katas.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {
    private final List<Item> items;

    public Inn() {
        items = new ArrayList<Item>();
        items.add(new ItemDecorator.Builder("+5 Dexterity Vest", 10, 20).aging(Aging.DECREASE)
                .categorie(Categorie.NORMAL).build());

        items.add(new ItemDecorator.Builder("Aged Brie", 2, 0).aging(Aging.INCREASE)
                .categorie(Categorie.NORMAL).build());

        items.add(new ItemDecorator.Builder("Elixir of the Mongoose", 5, 7).aging(Aging.DECREASE)
                .categorie(Categorie.NORMAL).build());

        items.add(new ItemDecorator.Builder("Sulfuras, Hand of Ragnaros", 0, 80).aging(Aging.STABLE)
                .categorie(Categorie.LEGENDARY).build());

        items.add(new ItemDecorator.Builder("Backstage passes to a TAFKAL80ETC concert", 15, 20)
                .aging(Aging.INCREASE).categorie(Categorie.SPECIAL_RULE_EXPIRES).build());

        items.add(new ItemDecorator.Builder("Conjured Mana Cake", 3, 6).aging(Aging.DECREASE)
                .categorie(Categorie.CONJURED).build());

        //un conceret qui peut depasser 50 de quality
        items.add(new ItemDecorator.Builder("Backstage passes to a TAFKAL80ETC concert", 15, 21)
                .aging(Aging.INCREASE).categorie(Categorie.SPECIAL_RULE_EXPIRES).build());
    }

    public void updateQuality() {
        for (Item item : items) {
            ((ItemDecorator) item).updateQuality();
        }
    }

    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        new Inn().updateQuality();

    }

    public List<Item> getItems() {
        return items;
    }

}
