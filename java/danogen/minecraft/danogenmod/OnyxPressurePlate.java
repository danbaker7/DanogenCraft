package danogen.minecraft.danogenmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OnyxPressurePlate extends BlockPressurePlate {
    public OnyxPressurePlate(int id, Material par2material, EnumMobType par3enumMobType) {
        super(id, "danogencraft:onyx_block", par2material, par3enumMobType);
        setHardness(50.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("onyxPressurePlate");
        setCreativeTab(DanogenCraft.danogenTabs);
    }
}

