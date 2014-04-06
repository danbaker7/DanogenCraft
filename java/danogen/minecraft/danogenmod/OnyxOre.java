package danogen.minecraft.danogenmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class OnyxOre extends BlockOre {

    public OnyxOre(int id) {
        super(id);
        setHardness(3.0f);
        setResistance(5.0f);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("onyxOre");
        setCreativeTab(DanogenCraft.danogenTabs);
        setTextureName("danogencraft:onyx_ore");

    }
    public int idDropped(int metadeta, Random random, int fortune) {
        return DanogenCraft.onyxIngot.itemID;
    }

    public void dropBlockAsItemWithChance(World world, int par2, int par3, int par4, int par5, int par6, int par7){

        super.dropBlockAsItemWithChance(world, par2, par3, par4,par5, par6, par7);

        if (this.idDropped(par5, world.rand, par7) != this.blockID);{
                 int j1 = 0;
                 j1 = MathHelper.getRandomIntegerInRange(world.rand, 2, 6);

            this.dropXpOnBlockBreak(world, par2, par3, par4, j1);

        }
    }
}