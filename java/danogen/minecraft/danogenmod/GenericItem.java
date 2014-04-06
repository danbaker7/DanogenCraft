package danogen.minecraft.danogenmod;

import net.minecraft.item.Item;

public class GenericItem extends Item {

    public GenericItem(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("compressedDirtBall");
        setTextureName("danogencraft:dirt_ball");
    }
}