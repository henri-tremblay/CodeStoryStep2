package fr.xebia.katas.gildedrose;

public enum Categorie {
    CONJURED {
        /* Congured items age twice as fast
         * @see fr.xebia.katas.gildedrose.Categorie#internalComputeQuality(fr.xebia.katas.gildedrose.ItemDecorator, int)
         */
        @Override
        public void internalComputeQuality(ItemDecorator item, int difference) {
            difference *= 2;
            if (Categorie.basicBoundaryCheck(item, difference)) {
                item.setQuality(item.getQuality() + difference);
            }
        }
    },
    NORMAL {
        /* Normal items are.. well normal.
         * @see fr.xebia.katas.gildedrose.Categorie#internalComputeQuality(fr.xebia.katas.gildedrose.ItemDecorator, int)
         */
        @Override
        public void internalComputeQuality(ItemDecorator item, int difference) {

            if (Categorie.basicBoundaryCheck(item, difference)) {
                item.setQuality(item.getQuality() + difference);
            }
        }
    },
    LEGENDARY {
        /* Legendary dont age
         * @see fr.xebia.katas.gildedrose.Categorie#internalComputeQuality(fr.xebia.katas.gildedrose.ItemDecorator, int)
         */
        @Override
        public void internalComputeQuality(ItemDecorator item, int difference) {
        }
    },
    SPECIAL_RULE_EXPIRES {
        /* Special rule. Exponential when close to sell in. And then expires.
         * @see fr.xebia.katas.gildedrose.Categorie#internalComputeQuality(fr.xebia.katas.gildedrose.ItemDecorator, int)
         */
        @Override
        public void internalComputeQuality(ItemDecorator item, int difference) {
            if (item.getSellIn() <= 0) {
                item.setQuality(0);
                //Were done here,nothing more to see!
                return;
            } else if (item.getSellIn() <= 5) {
                difference *= 3;
            } else if (item.getSellIn() <= 10) {
                difference *= 2;
            }
            if (Categorie.basicBoundaryCheck(item, difference)) {
                item.setQuality(item.getQuality() + difference);
            }
        }
    };

    /**
     * Must implement depending on the category for how it is computed.
     * 
     * @param item
     * @param difference
     */
    public abstract void internalComputeQuality(ItemDecorator item, int difference);

    /**
     * Compute the quality of an item after 1 day
     * 
     * @param item
     */
    public void computeQuality(ItemDecorator item) {
        int difference = item.getAging().getQualityDelta();
        int sellInDelta = item.getAging().getSellInDelta();

        if (item.getSellIn() <= 0) {
            difference *= 2;
        }

        internalComputeQuality(item, difference);

        item.setSellIn(item.getSellIn() - sellInDelta);
    }

    /**
     * Check the boundaries of quality. Min 0 and Max 50. return true if the
     * boundaries are not hit. false if they hit, and sets it to the boundary
     * value.
     * 
     * @param item
     * @param difference
     * @return
     */
    private static boolean basicBoundaryCheck(ItemDecorator item, int difference) {
        if (difference != 0) {
            if (item.getQuality() + difference < 0) {
                item.setQuality(0);
                return false;
            } else if (item.getQuality() + difference > 50) {
                item.setQuality(50);
                return false;
            }
        }
        return true;
    }
}
