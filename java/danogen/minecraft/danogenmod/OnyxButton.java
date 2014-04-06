package danogen.minecraft.danogenmod;

import net.minecraft.block.BlockButton;
import net.minecraft.client.renderer.texture.IconRegister;

public class OnyxButton extends BlockButton {
    public OnyxButton(int par1){
        super(par1, false);
    }

    public void registerIcons(IconRegister register) {
        this.blockIcon = register.registerIcon("danogencraft:onyx_block");
    }
}

