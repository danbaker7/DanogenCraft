package danogen.minecraft.danogenmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;

public class OnyxArmor extends ItemArmor {

    private String texturePath = BasicInfo.ID + ":" + "textures/armor/";
    private String part;

    public OnyxArmor(int id, EnumArmorMaterial armorMaterial, int par3, int par4, String type) {
        super(id, armorMaterial, par3, par4);
        setMaxStackSize(1);
        setCreativeTab(DanogenCraft.danogenTabs);
        setTextureName(par4);
        this.part = type;
    }

    private void setTextureName(int armorPart){
        if (armorType == 0 || armorType == 1 || armorType == 3){
            this.texturePath += "onyx_armor" + "_layer_1.png";
        }else{
            this.texturePath += "onyx_armor" + "_layer_2.png";
        }
    }


    public void registerIcons(IconRegister register){
        this.itemIcon = register.registerIcon(BasicInfo.ID + ":onyx_" + this.part);
    }

    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer){
        return this.texturePath;
    }

}