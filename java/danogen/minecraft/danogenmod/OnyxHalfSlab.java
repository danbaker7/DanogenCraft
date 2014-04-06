package danogen.minecraft.danogenmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OnyxHalfSlab extends BlockHalfSlab{
    public OnyxHalfSlab(int id, boolean fullBlock, Material material) {
        super(id, fullBlock, material);

        setTextureName("danogencraft:onyx_block");

        if(!fullBlock){
            this.setCreativeTab(DanogenCraft.danogenTabs);
            useNeighborBrightness[id] = true;
        }
    }

    public String getFullSlabName(int i) {
        return super.getUnlocalizedName();

    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World world, int x, int y, int z){
        return DanogenCraft.onyxHalfSlab.blockID;
    }
}

