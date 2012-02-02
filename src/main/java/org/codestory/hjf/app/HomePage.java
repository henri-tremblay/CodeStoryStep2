package org.codestory.hjf.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import fr.xebia.katas.gildedrose.Inn;
import fr.xebia.katas.gildedrose.Item;

@SuppressWarnings("serial")
public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        Inn inn = new Inn();
        add(new ListView<Item>("listview", inn.getItems()) {
            @Override
            protected void populateItem(ListItem<Item> listItem) {
                Item item = listItem.getModelObject();
                listItem.add(new Label("name", item.getName()));
                listItem.add(new Label("quality", Integer.toString(item.getQuality())));
                listItem.add(new Label("sellIn", Integer.toString(item.getSellIn())));
            }
        });
    }
}
