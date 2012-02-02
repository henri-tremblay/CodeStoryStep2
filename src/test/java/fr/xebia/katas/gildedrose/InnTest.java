package fr.xebia.katas.gildedrose;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import org.junit.Test;

public class InnTest {

//    @Test
    public void generateOriginalAnswers() throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter("t.txt"));
        Inn inn = new Inn();
        List<Item> items = inn.getItems();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < items.size(); j++) {
                Item item = items.get(j);
                out.write("check(items.get(" + j + "), \"" + item.getName() + "\", " + item.getSellIn()
                        + ", " + item.getQuality() + ");\n");
            }
            out.write("inn.updateQuality();\n");
            inn.updateQuality();
        }
        out.close();
    }

    @Test
    public void test() {
        Inn inn = new Inn();
        List<Item> items = inn.getItems();
        check(items.get(0), "+5 Dexterity Vest", 10, 20);
        check(items.get(1), "Aged Brie", 2, 0);
        check(items.get(2), "Elixir of the Mongoose", 5, 7);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 15, 20);
        check(items.get(5), "Conjured Mana Cake", 3, 6);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 9, 19);
        check(items.get(1), "Aged Brie", 1, 1);
        check(items.get(2), "Elixir of the Mongoose", 4, 6);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 14, 21);
        check(items.get(5), "Conjured Mana Cake", 2, 4);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 8, 18);
        check(items.get(1), "Aged Brie", 0, 2);
        check(items.get(2), "Elixir of the Mongoose", 3, 5);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 13, 22);
        check(items.get(5), "Conjured Mana Cake", 1, 2);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 7, 17);
        check(items.get(1), "Aged Brie", -1, 4);
        check(items.get(2), "Elixir of the Mongoose", 2, 4);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 12, 23);
        check(items.get(5), "Conjured Mana Cake", 0, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 6, 16);
        check(items.get(1), "Aged Brie", -2, 6);
        check(items.get(2), "Elixir of the Mongoose", 1, 3);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 11, 24);
        check(items.get(5), "Conjured Mana Cake", -1, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 5, 15);
        check(items.get(1), "Aged Brie", -3, 8);
        check(items.get(2), "Elixir of the Mongoose", 0, 2);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 10, 25);
        check(items.get(5), "Conjured Mana Cake", -2, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 4, 14);
        check(items.get(1), "Aged Brie", -4, 10);
        check(items.get(2), "Elixir of the Mongoose", -1, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 9, 27);
        check(items.get(5), "Conjured Mana Cake", -3, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 3, 13);
        check(items.get(1), "Aged Brie", -5, 12);
        check(items.get(2), "Elixir of the Mongoose", -2, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 8, 29);
        check(items.get(5), "Conjured Mana Cake", -4, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 2, 12);
        check(items.get(1), "Aged Brie", -6, 14);
        check(items.get(2), "Elixir of the Mongoose", -3, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 7, 31);
        check(items.get(5), "Conjured Mana Cake", -5, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 1, 11);
        check(items.get(1), "Aged Brie", -7, 16);
        check(items.get(2), "Elixir of the Mongoose", -4, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 6, 33);
        check(items.get(5), "Conjured Mana Cake", -6, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", 0, 10);
        check(items.get(1), "Aged Brie", -8, 18);
        check(items.get(2), "Elixir of the Mongoose", -5, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 5, 35);
        check(items.get(5), "Conjured Mana Cake", -7, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -1, 8);
        check(items.get(1), "Aged Brie", -9, 20);
        check(items.get(2), "Elixir of the Mongoose", -6, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 4, 38);
        check(items.get(5), "Conjured Mana Cake", -8, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -2, 6);
        check(items.get(1), "Aged Brie", -10, 22);
        check(items.get(2), "Elixir of the Mongoose", -7, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 3, 41);
        check(items.get(5), "Conjured Mana Cake", -9, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -3, 4);
        check(items.get(1), "Aged Brie", -11, 24);
        check(items.get(2), "Elixir of the Mongoose", -8, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 2, 44);
        check(items.get(5), "Conjured Mana Cake", -10, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -4, 2);
        check(items.get(1), "Aged Brie", -12, 26);
        check(items.get(2), "Elixir of the Mongoose", -9, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 1, 47);
        check(items.get(5), "Conjured Mana Cake", -11, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -5, 0);
        check(items.get(1), "Aged Brie", -13, 28);
        check(items.get(2), "Elixir of the Mongoose", -10, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", 0, 50);
        check(items.get(5), "Conjured Mana Cake", -12, 0);
        check(items.get(6), "Backstage passes to a TAFKAL80ETC concert", 0, 50);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -6, 0);
        check(items.get(1), "Aged Brie", -14, 30);
        check(items.get(2), "Elixir of the Mongoose", -11, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -1, 0);
        check(items.get(5), "Conjured Mana Cake", -13, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -7, 0);
        check(items.get(1), "Aged Brie", -15, 32);
        check(items.get(2), "Elixir of the Mongoose", -12, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -2, 0);
        check(items.get(5), "Conjured Mana Cake", -14, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -8, 0);
        check(items.get(1), "Aged Brie", -16, 34);
        check(items.get(2), "Elixir of the Mongoose", -13, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -3, 0);
        check(items.get(5), "Conjured Mana Cake", -15, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -9, 0);
        check(items.get(1), "Aged Brie", -17, 36);
        check(items.get(2), "Elixir of the Mongoose", -14, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -4, 0);
        check(items.get(5), "Conjured Mana Cake", -16, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -10, 0);
        check(items.get(1), "Aged Brie", -18, 38);
        check(items.get(2), "Elixir of the Mongoose", -15, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -5, 0);
        check(items.get(5), "Conjured Mana Cake", -17, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -11, 0);
        check(items.get(1), "Aged Brie", -19, 40);
        check(items.get(2), "Elixir of the Mongoose", -16, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -6, 0);
        check(items.get(5), "Conjured Mana Cake", -18, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -12, 0);
        check(items.get(1), "Aged Brie", -20, 42);
        check(items.get(2), "Elixir of the Mongoose", -17, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -7, 0);
        check(items.get(5), "Conjured Mana Cake", -19, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -13, 0);
        check(items.get(1), "Aged Brie", -21, 44);
        check(items.get(2), "Elixir of the Mongoose", -18, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -8, 0);
        check(items.get(5), "Conjured Mana Cake", -20, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -14, 0);
        check(items.get(1), "Aged Brie", -22, 46);
        check(items.get(2), "Elixir of the Mongoose", -19, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -9, 0);
        check(items.get(5), "Conjured Mana Cake", -21, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -15, 0);
        check(items.get(1), "Aged Brie", -23, 48);
        check(items.get(2), "Elixir of the Mongoose", -20, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -10, 0);
        check(items.get(5), "Conjured Mana Cake", -22, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -16, 0);
        check(items.get(1), "Aged Brie", -24, 50);
        check(items.get(2), "Elixir of the Mongoose", -21, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -11, 0);
        check(items.get(5), "Conjured Mana Cake", -23, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -17, 0);
        check(items.get(1), "Aged Brie", -25, 50);
        check(items.get(2), "Elixir of the Mongoose", -22, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -12, 0);
        check(items.get(5), "Conjured Mana Cake", -24, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -18, 0);
        check(items.get(1), "Aged Brie", -26, 50);
        check(items.get(2), "Elixir of the Mongoose", -23, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -13, 0);
        check(items.get(5), "Conjured Mana Cake", -25, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -19, 0);
        check(items.get(1), "Aged Brie", -27, 50);
        check(items.get(2), "Elixir of the Mongoose", -24, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -14, 0);
        check(items.get(5), "Conjured Mana Cake", -26, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -20, 0);
        check(items.get(1), "Aged Brie", -28, 50);
        check(items.get(2), "Elixir of the Mongoose", -25, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -15, 0);
        check(items.get(5), "Conjured Mana Cake", -27, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -21, 0);
        check(items.get(1), "Aged Brie", -29, 50);
        check(items.get(2), "Elixir of the Mongoose", -26, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -16, 0);
        check(items.get(5), "Conjured Mana Cake", -28, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -22, 0);
        check(items.get(1), "Aged Brie", -30, 50);
        check(items.get(2), "Elixir of the Mongoose", -27, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -17, 0);
        check(items.get(5), "Conjured Mana Cake", -29, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -23, 0);
        check(items.get(1), "Aged Brie", -31, 50);
        check(items.get(2), "Elixir of the Mongoose", -28, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -18, 0);
        check(items.get(5), "Conjured Mana Cake", -30, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -24, 0);
        check(items.get(1), "Aged Brie", -32, 50);
        check(items.get(2), "Elixir of the Mongoose", -29, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -19, 0);
        check(items.get(5), "Conjured Mana Cake", -31, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -25, 0);
        check(items.get(1), "Aged Brie", -33, 50);
        check(items.get(2), "Elixir of the Mongoose", -30, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -20, 0);
        check(items.get(5), "Conjured Mana Cake", -32, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -26, 0);
        check(items.get(1), "Aged Brie", -34, 50);
        check(items.get(2), "Elixir of the Mongoose", -31, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -21, 0);
        check(items.get(5), "Conjured Mana Cake", -33, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -27, 0);
        check(items.get(1), "Aged Brie", -35, 50);
        check(items.get(2), "Elixir of the Mongoose", -32, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -22, 0);
        check(items.get(5), "Conjured Mana Cake", -34, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -28, 0);
        check(items.get(1), "Aged Brie", -36, 50);
        check(items.get(2), "Elixir of the Mongoose", -33, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -23, 0);
        check(items.get(5), "Conjured Mana Cake", -35, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -29, 0);
        check(items.get(1), "Aged Brie", -37, 50);
        check(items.get(2), "Elixir of the Mongoose", -34, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -24, 0);
        check(items.get(5), "Conjured Mana Cake", -36, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -30, 0);
        check(items.get(1), "Aged Brie", -38, 50);
        check(items.get(2), "Elixir of the Mongoose", -35, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -25, 0);
        check(items.get(5), "Conjured Mana Cake", -37, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -31, 0);
        check(items.get(1), "Aged Brie", -39, 50);
        check(items.get(2), "Elixir of the Mongoose", -36, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -26, 0);
        check(items.get(5), "Conjured Mana Cake", -38, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -32, 0);
        check(items.get(1), "Aged Brie", -40, 50);
        check(items.get(2), "Elixir of the Mongoose", -37, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -27, 0);
        check(items.get(5), "Conjured Mana Cake", -39, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -33, 0);
        check(items.get(1), "Aged Brie", -41, 50);
        check(items.get(2), "Elixir of the Mongoose", -38, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -28, 0);
        check(items.get(5), "Conjured Mana Cake", -40, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -34, 0);
        check(items.get(1), "Aged Brie", -42, 50);
        check(items.get(2), "Elixir of the Mongoose", -39, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -29, 0);
        check(items.get(5), "Conjured Mana Cake", -41, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -35, 0);
        check(items.get(1), "Aged Brie", -43, 50);
        check(items.get(2), "Elixir of the Mongoose", -40, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -30, 0);
        check(items.get(5), "Conjured Mana Cake", -42, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -36, 0);
        check(items.get(1), "Aged Brie", -44, 50);
        check(items.get(2), "Elixir of the Mongoose", -41, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -31, 0);
        check(items.get(5), "Conjured Mana Cake", -43, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -37, 0);
        check(items.get(1), "Aged Brie", -45, 50);
        check(items.get(2), "Elixir of the Mongoose", -42, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -32, 0);
        check(items.get(5), "Conjured Mana Cake", -44, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -38, 0);
        check(items.get(1), "Aged Brie", -46, 50);
        check(items.get(2), "Elixir of the Mongoose", -43, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -33, 0);
        check(items.get(5), "Conjured Mana Cake", -45, 0);
        inn.updateQuality();
        check(items.get(0), "+5 Dexterity Vest", -39, 0);
        check(items.get(1), "Aged Brie", -47, 50);
        check(items.get(2), "Elixir of the Mongoose", -44, 0);
        check(items.get(3), "Sulfuras, Hand of Ragnaros", 0, 80);
        check(items.get(4), "Backstage passes to a TAFKAL80ETC concert", -34, 0);
        check(items.get(5), "Conjured Mana Cake", -46, 0);
        inn.updateQuality();
    }

    private void check(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.getName());
        assertEquals(sellIn, item.getSellIn());
        assertEquals(quality, item.getQuality());
    }
}
