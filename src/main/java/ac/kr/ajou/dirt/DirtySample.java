package ac.kr.ajou.dirt;

class DirtySample {
    Item[] items;

    public DirtySample(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")  //아이템의 이름이 Aged Brie가 아니고 Backstage passes to a TAFKAL80ETC concert가 아니라면
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) { //아이템의 퀄리티가 0보다 크다면
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {  //아이템의 이름이 Sulfuras, Hand of Ragnaros가 아니라면
                        items[i].quality = items[i].quality - 1;    //아이템의 퀄리티 -1
                    }
                }
            } else {    //아이템의 이름이 Aged Brie이거나 Backstage passes to a TAFKAL80ETC concert라면
                if (items[i].quality < 50) {    //아이템의 퀄리티가 50보다 작다면
                    items[i].quality = items[i].quality + 1;    //아이템의 퀄리티 +1

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {    //아이템의 이름이 Backstage passes to a TAFKAL80ETC concert라면
                        if (items[i].sellIn < 11) { //아이템의 sellIn이 11보다 작다면
                            if (items[i].quality < 50) {    //아이템의 퀄리티가 50보다 작다면
                                items[i].quality = items[i].quality + 1;    //아이템의 퀄리티 +1
                            }
                        }

                        if (items[i].sellIn < 6) {  //아이템의 sellIn이 6보다 작다면
                            if (items[i].quality < 50) {    //아이템의 퀄리티가 50보다 작다면
                                items[i].quality = items[i].quality + 1;    //아이템의 퀄리티 +1
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {  //아이템의 이름이 Sulfuras, Hand of Ragnaros가 아니라면
                items[i].sellIn = items[i].sellIn - 1;  //아이템의 sellIn -1
            }

            if (items[i].sellIn < 0) {  //아이템의 sellIn이 0보다 작다면
                if (!items[i].name.equals("Aged Brie")) {   //아이템의 이름이 Aged Brie가 아니라면
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {   //아이템의 이름이 Backstage passes to a TAFKAL80ETC concert가 아니라면
                        if (items[i].quality > 0) { //아이템의 퀄리티가 0보다 크다면
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {  //아이템의 이름이 Sulfuras, Hand of Ragnaros가 아니라면
                                items[i].quality = items[i].quality - 1;    //아이템의 퀄리티 -1
                            }
                        }
                    } else {    //아이템의 이름이 Backstage passes to a TAFKAL80ETC concert라면
                        items[i].quality = 0;   //아이템의 퀄리티 0
                    }
                } else {    //아이템의 이름이 Aged Brie라면
                    if (items[i].quality < 50) {    //아이템의 퀄리티가 50보다 작다면
                        items[i].quality = items[i].quality + 1;    //아이템의 퀄리티 +1
                    }
                }
            }
        }
    }
}