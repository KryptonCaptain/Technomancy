package theflogat.technomancy.common.items;

import theflogat.technomancy.Technomancy;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super();
        setMaxStackSize(1);
        setCreativeTab(Technomancy.tabsTM);
    }

}
