package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class OnyxShovel extends ItemSpade {

    public OnyxShovel(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("onyxShovel");
        setTextureName("danogencraft:onyx_shovel");
    }
}