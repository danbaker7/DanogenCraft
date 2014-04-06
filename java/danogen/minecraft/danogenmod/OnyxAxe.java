package danogen.minecraft.danogenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class OnyxAxe extends ItemAxe {

    public OnyxAxe(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(DanogenCraft.danogenTabs);
        setUnlocalizedName("onyxAxe");
        setTextureName("danogencraft:onyx_axe");
    }
}