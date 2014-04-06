package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Brownies extends ItemFood {

    public Brownies(int id) {
        super(id, 7, 0.6F, false);
        setMaxStackSize(64);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("brownie");
        setTextureName("danogencraft:brownie");
    }
}