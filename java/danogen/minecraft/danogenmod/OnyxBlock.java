package danogen.minecraft.danogenmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OnyxBlock extends Block {

    public OnyxBlock(int id, Material material) {
        super(id, material);
        setHardness(3.0f);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("onyxBlock");
        setCreativeTab(DanogenCraft.danogenTabs);
        setTextureName("danogencraft:onyx_block");

    }
}