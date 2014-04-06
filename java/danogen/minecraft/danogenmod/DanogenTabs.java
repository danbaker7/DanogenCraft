package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;

public class DanogenTabs extends CreativeTabs{
    @Override
    public String getTranslatedTabLabel() {
        return "Danogen Craft";
    }

    @Override
    public int getTabIconItemIndex() {
        return DanogenCraft.onyxIngot.itemID;
    }

    public DanogenTabs(String label) {
        super(label);
    }
}
