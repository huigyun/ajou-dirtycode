package ac.kr.ajou.dirt;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DirtySampleTest {
    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_작고_quality가_0보다_작으면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", -3, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(-3));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_2감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", -3, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(1));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_작고_quality가_50보다_크면_sellIn_1감소_quality_2감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", -3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(51));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_작으면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 3, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(-3));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 3, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(2));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_0보다_크고_6보다_작고_quality가_50보다_크면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(52));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_작으면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 8, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(-3));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 8, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(2));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이_6보다_크고_11보다_작고_quality가_50보다_크면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 8, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(52));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이11보다_크고_quality가_0보다_작으면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 18, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(-3));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이11보다_크고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 18, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(2));
    }

    @Test
    public void 이름이_Aged가_아니고_Backstage가_아니고_Sulfuras가_아니고_sellIn이11보다_크고_quality가_50보다_크면_sellIn_1감소_quality_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("name", 18, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(52));
    }
    ////////
    @Test
    public void 이름이_Aged고_sellIn이_0보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_2증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", -3, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(-1));
    }

    @Test
    public void 이름이_Aged고_sellIn이_0보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_2증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", -3, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(5));
    }

    @Test
    public void 이름이_Aged고_sellIn이_0보다_작고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", -3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(53));
    }

    @Test
    public void 이름이_Aged고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 3, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(-2));
    }

    @Test
    public void 이름이_Aged고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 3, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(4));
    }

    @Test
    public void 이름이_Aged고_sellIn이_0보다_크고_6보다_작고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(53));
    }

    @Test
    public void 이름이_Aged고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 8, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(-2));
    }

    @Test
    public void 이름이_Aged고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 8, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(4));
    }

    @Test
    public void 이름이_Aged고_sellIn이_6보다_크고_11보다_작고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 8, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(53));
    }

    @Test
    public void 이름이_Aged고_sellIn이11보다_크고_quality가_0보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 18, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(-2));
    }

    @Test
    public void 이름이_Aged고_sellIn이11보다_크고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 18, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(4));
    }

    @Test
    public void 이름이_Aged고_sellIn이11보다_크고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 18, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(53));
    }
    /////
    @Test
    public void 이름이_Backstage고_sellIn이_0보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_0() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", -3, -5);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(0));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_0보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_0() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", -3, 5);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(0));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_0보다_작고_quality가_50보다_크면_sellIn_1감소_quality_0() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", -3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(-4));
        assertThat(dirtySample.items[0].quality, is(0));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_3증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 3, -5);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(-2));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_0보다_크고_6보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_3증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(6));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_0보다_크고_6보다_작고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(2));
        assertThat(dirtySample.items[0].quality, is(53));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_작으면_sellIn_1감소_quality_2증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 8, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(-1));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_6보다_크고_11보다_작고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_2증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(5));
    }

    @Test
    public void 이름이_Backstage고_sellIn이_6보다_크고_11보다_작고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(7));
        assertThat(dirtySample.items[0].quality, is(53));
    }

    @Test
    public void 이름이_Backstage고_sellIn이11보다_크고_quality가_0보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 18, -3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(-2));
    }

    @Test
    public void 이름이_Backstage고_sellIn이11보다_크고_quality가_0보다_크고_50보다_작으면_sellIn_1감소_quality_1증가() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 18, 3);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(4));
    }

    @Test
    public void 이름이_Backstage고_sellIn이11보다_크고_quality가_50보다_크면_sellIn_1감소() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 18, 53);
        DirtySample dirtySample = new DirtySample(items);
        dirtySample.updateQuality();

        assertThat(dirtySample.items[0].sellIn, is(17));
        assertThat(dirtySample.items[0].quality, is(53));
    }
}