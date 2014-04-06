package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OnyxIngot extends Item {

    public OnyxIngot(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("onyxIngot");
        setTextureName("danogencraft:onyx_ingot");
    }
}