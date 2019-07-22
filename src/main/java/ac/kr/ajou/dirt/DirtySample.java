package ac.kr.ajou.dirt;

class DirtySample {
    Item[] items;

    public DirtySample(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!isNameSameToitemname(item, "Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;

                if (isNameSameToitemname(item, "Aged Brie")) {
                    updateQualityForAgedBrie(item);
                }
                if (isNameSameToitemname(item, "Backstage passes to a TAFKAL80ETC concert")) {
                    updateQualityForBackstagePasses(item);
                }
                if (isNeitherAgedBrieNorBackstagePasses(item)) {
                    updateQualityForOtherItems(item);
                }
            }
        }
    }

    private void updateQualityForOtherItems(Item item) {
        if (item.quality > 0) {
            reduceQuality(item);

            if (item.sellIn < 0) {
                reduceQuality(item);
            }
        }
    }

    private void updateQualityForBackstagePasses(Item item) {
        if (item.quality < 50) {
            raiseQuality(item);

            if (item.sellIn < 11) {
                raiseQuality(item);
            }

            if (item.sellIn < 6) {
                raiseQuality(item);
            }
        }

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateQualityForAgedBrie(Item item) {
        if (item.quality < 50) {
            raiseQuality(item);

            if (item.sellIn < 0) {
                raiseQuality(item);
            }
        }
    }

    private void raiseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    private void reduceQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private boolean isNameSameToitemname(Item item, String nametocompare) {
        return item.name.equals(nametocompare);
    }

    private boolean isNeitherAgedBrieNorBackstagePasses(Item item) {
        return !isNameSameToitemname(item, "Aged Brie") && !isNameSameToitemname(item, "Backstage passes to a TAFKAL80ETC concert");
    }
}