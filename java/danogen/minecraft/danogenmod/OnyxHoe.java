package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class OnyxHoe extends ItemHoe {

    public OnyxHoe(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("onyxHoe");
        setTextureName("danogencraft:onyx_hoe");
    }
}