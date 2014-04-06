package danogen.minecraft.danogenmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid=BasicInfo.ID, name=BasicInfo.NAME, version=BasicInfo.VERS)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class DanogenCraft {

    private static Item dirtBall;
    public static Item onyxIngot;
    public static Item brownies;
    public static Item cocoabeans;
    public static Block woodPlanks;
    public static Block oakWood;
    public static Item itemArmorOnyxHelmet;
    public static Item itemArmorOnyxChestplate;
    public static Item itemArmorOnyxLeggings;
    public static Item itemArmorOnyxBoots;
    public static Block onyxOre;
    public static Block onyxBlock;
    public Item onyxSword;
    public Item onyxShovel;
    public Item onyxHoe;
    public Item onyxAxe;
    public Item onyxPickaxe;
    public static Block onyxPressurePlate;
    public static Block onyxHalfSlab;
    public static Block onyxHalfDoubleSlab;
    public static Block onyxLever;

    public static EnumArmorMaterial armorMaterialOnyx;
    public static Block onyxButton;

//    public static Block danogenAcid;
//    public static final int idFluidAcid = 1001;
//    public static Fluid danogenFluid;

//   public static materialAcid

   public static CreativeTabs danogenTabs = new DanogenTabs("danogenTab");

    //initializations for tool materials
    public EnumToolMaterial Onyx = EnumHelper.addToolMaterial("Onyx", 3, 1600, 12.0F, 2, 18);

    EventManager oreManager= new EventManager();

    @Instance("Basic")
    public static DanogenCraft instance;

    @SidedProxy(clientSide="danogen.minecraft.danogenmod.client.ClientProxy", serverSide="danogen.minecraft.danogenmod.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        onyxOre = new OnyxOre(2998);
        onyxBlock = new OnyxBlock(2999, Material.ground);
        onyxIngot = new OnyxIngot(5002);
        dirtBall = new GenericItem(5000);
        brownies = new Brownies(5001);
        cocoabeans = Item.dyePowder;
      //tools
        onyxPickaxe = new OnyxPickaxe(5003, Onyx).setUnlocalizedName("onyxPickaxe");
        onyxSword = new OnyxSword(5004, Onyx).setUnlocalizedName("onyxSword");
        onyxShovel = new OnyxShovel(5005, Onyx).setUnlocalizedName("onyxShovel");
        onyxHoe = new OnyxHoe(5006, Onyx).setUnlocalizedName("onyxHoe");
        onyxAxe = new OnyxAxe(5007, Onyx).setUnlocalizedName("onyxAxe");
      //Onyx Armor
        armorMaterialOnyx = EnumHelper.addArmorMaterial("onyxArmorMaterial", 30, new int[]{2, 6, 5, 3}, 25);
        itemArmorOnyxHelmet = new OnyxArmor(5011, armorMaterialOnyx, 0, 0, "helmet").setUnlocalizedName("OnyxHelmet");
        itemArmorOnyxChestplate = new OnyxArmor(5008, armorMaterialOnyx, 0, 1, "chestplate").setUnlocalizedName("OnyxChestplate");
        itemArmorOnyxLeggings = new OnyxArmor(5010, armorMaterialOnyx, 0, 2, "leggings").setUnlocalizedName("OnyxLeggings");
        itemArmorOnyxBoots = new OnyxArmor(5009, armorMaterialOnyx, 0, 3, "boots").setUnlocalizedName("OnyxBoots");
      //OnyxButton
        onyxButton= (new OnyxButton(3000)).setHardness(0.5F).setUnlocalizedName("onyxButton").setCreativeTab(danogenTabs);
      //OnyxLever
        onyxLever = (new OnyxLever(3001)).setHardness(0.5F).setUnlocalizedName("onyxLever").setCreativeTab(danogenTabs);
      //Pressure Plate
        onyxPressurePlate = (new OnyxPressurePlate(3002, Material.rock, EnumMobType.players)).setHardness(50.0F).setUnlocalizedName("onyxPressurePlate").setCreativeTab(danogenTabs);
      //Half Slab
        onyxHalfSlab = new OnyxHalfSlab(3003, false, Material.ground).setUnlocalizedName("onyxHalfSlab");
        onyxHalfDoubleSlab = new OnyxHalfSlab(3004, true, Material.ground).setUnlocalizedName("onyxDoubleSlab");

        Item.itemsList[onyxHalfSlab.blockID] = new ItemSlab(onyxHalfSlab.blockID-256, (BlockHalfSlab)onyxHalfSlab, (BlockHalfSlab)onyxHalfDoubleSlab, false);

        woodPlanks = Block.planks;
        oakWood = Block.wood;

      //Acid
//        danogenAcid = new DanogenAcid(idFluidAcid).setUnlocalisedName("danogenAcid");
//        danogenFluid = new Fluid("acid").setBlockID()

    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();

        ItemStack dirtStack = new ItemStack(Block.dirt);
        ItemStack dirtBallStack = new ItemStack(dirtBall);
        ItemStack brownieStack = new ItemStack(brownies);
        ItemStack cocoaStack = new ItemStack(Item.dyePowder, 1, 3);
        ItemStack onyxOreStack = new ItemStack(onyxOre);
        ItemStack onyxBlockStack = new ItemStack(onyxBlock);
        ItemStack onyxIngotStack = new ItemStack(onyxIngot);
        ItemStack onyxPressureStack = new ItemStack(onyxPressurePlate);

        //OnyxOre Tools
        ItemStack onyxSwordStack = new ItemStack(onyxSword);
        ItemStack onyxPickaxeStack = new ItemStack(onyxPickaxe);
        ItemStack onyxAxeStack = new ItemStack(onyxAxe);
        ItemStack onyxHoeStack = new ItemStack(onyxHoe);
        ItemStack onyxShovelStack = new ItemStack(onyxShovel);
        ItemStack onyxHalfSlabStack = new ItemStack(onyxHalfSlab);
        ItemStack onyxHalfDoubleSlabStack = new ItemStack(onyxHalfDoubleSlab);

//        materialAcid = new MaterialLiquid(MapColor.grassColor);
//

        GameRegistry.registerBlock(onyxOre, "Onyx Ore");
        GameRegistry.registerBlock(onyxBlock, "Onyx Block");
        GameRegistry.registerItem(onyxIngot, "Onyx Ingot");
        GameRegistry.registerItem(brownies, "Brownies");
        GameRegistry.registerItem(itemArmorOnyxBoots, "Onyx Boots");
        GameRegistry.registerItem(itemArmorOnyxChestplate, "Onyx Chestplate");
        GameRegistry.registerItem(itemArmorOnyxHelmet, "Onyx Helmet");
        GameRegistry.registerItem(itemArmorOnyxLeggings, "Onyx Leggings");
        GameRegistry.registerBlock(onyxPressurePlate, "Onyx Pressure Plate");
        GameRegistry.registerBlock(onyxHalfSlab, "Onyx Slab");
        GameRegistry.registerBlock(onyxHalfDoubleSlab, "Onyx Double Slab");
        GameRegistry.registerBlock(onyxLever, "Onyx Lever");
        GameRegistry.registerBlock(onyxButton, "Onyx Button");

        GameRegistry.addRecipe(dirtBallStack, " x ", "xxx", " x ",
                'x', dirtStack);

        GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 5), dirtBallStack);

        GameRegistry.addShapelessRecipe(new ItemStack(onyxIngot, 9), onyxBlockStack);

        GameRegistry.addShapedRecipe(new ItemStack(onyxBlock, 1), "xxx", "xxx", "xxx",
                'x', onyxIngot);

        GameRegistry.addShapedRecipe(new ItemStack(brownies, 4), "xxx", "yzy", "   ",
                'x', cocoaStack, 'y', Item.sugar, 'z', Item.wheat);


        //OnyxOre Tools
        //Registry
        GameRegistry.registerItem(onyxPickaxe, "Onyx Pickaxe");
        GameRegistry.registerItem(onyxSword, "Onyx Sword");
        GameRegistry.registerItem(onyxHoe, "Onyx Hoe");
        GameRegistry.registerItem(onyxShovel, "Onyx Shovel");
        GameRegistry.registerItem(onyxAxe, "Onyx Axe");

        //Language Registry
        LanguageRegistry.addName(onyxPickaxe, "Onyx Pickaxe");
        LanguageRegistry.addName(onyxSword, "Onyx Sword");
        LanguageRegistry.addName(onyxHoe, "Onyx Hoe");
        LanguageRegistry.addName(onyxShovel, "Onyx Shovel");
        LanguageRegistry.addName(onyxAxe, "Onyx Axe");
//        LanguageRegistry.addName(danogenTab, "Danogen Craft");

        //Armor

        LanguageRegistry.addName(itemArmorOnyxBoots, "Onyx Boots");
        LanguageRegistry.addName(itemArmorOnyxHelmet, "Onyx Helmet");
        LanguageRegistry.addName(itemArmorOnyxChestplate, "Onyx Chestplate");
        LanguageRegistry.addName(itemArmorOnyxLeggings, "Onyx Leggings");

        //Other
        LanguageRegistry.addName(onyxButton, "Onyx Button");
        LanguageRegistry.addName(onyxLever, "Onyx Lever");

        //Make the freakin' armor
        GameRegistry.addShapedRecipe(new ItemStack(itemArmorOnyxChestplate), "x x", "xxx", "xxx",
                'x', onyxIngot);
        GameRegistry.addShapedRecipe(new ItemStack(itemArmorOnyxHelmet), "xxx", "x x",
                'x', onyxIngot);
        GameRegistry.addShapedRecipe(new ItemStack(itemArmorOnyxLeggings), "xxx", "x x", "x x",
                'x', onyxIngot);
        GameRegistry.addShapedRecipe(new ItemStack(itemArmorOnyxBoots), "x x", "x x",
                'x', onyxIngot);
        //Lever
        GameRegistry.addShapedRecipe(new ItemStack(onyxLever), " y ", " x ",
                'x', onyxIngot, 'y', Item.stick);
        //Button
        GameRegistry.addShapedRecipe(new ItemStack(onyxButton), " x ",
                'x', onyxIngot);

        //Pickaxe
        GameRegistry.addShapedRecipe(onyxPickaxeStack, "xxx", " y ", " y ",
                'x', onyxIngot, 'y', Item.stick);
        //Shovel
        GameRegistry.addShapedRecipe(onyxShovelStack, " x ", " y ", " y ",
                'x', onyxIngot, 'y', Item.stick);
        //Axe
        GameRegistry.addShapedRecipe(onyxAxeStack, "xx ", "xy ", " y ",
                'x', onyxIngot, 'y', Item.stick);
        //Hoe
        GameRegistry.addShapedRecipe(onyxHoeStack, "xx ", " y ", " y ",
                'x', onyxIngot, 'y', Item.stick);
        //Sword
        GameRegistry.addShapedRecipe(onyxSwordStack, " x ", " x ", " y ",
                'x', onyxIngot, 'y', Item.stick);
        //Pressure Plate
        GameRegistry.addShapedRecipe(onyxPressureStack, "xx ",
                'x', onyxIngot);
        //Half Slab
        GameRegistry.addShapedRecipe(new ItemStack(onyxHalfSlab, 6), "xxx",
                'x', onyxBlock);
        GameRegistry.addShapedRecipe(new ItemStack(onyxBlock), "x  ", "x  ", 'x', onyxHalfSlab);

        GameRegistry.addShapedRecipe(new ItemStack(oakWood, 2), "xxx", "xxx", "xxx",
                'x', woodPlanks);

        LanguageRegistry.addName(dirtBallStack, "Dirt Ball");
        LanguageRegistry.addName(brownieStack, "Brownies");
        LanguageRegistry.addName(onyxOreStack, "Onyx Ore");
        LanguageRegistry.addName(onyxBlock, "Onyx Block");
        LanguageRegistry.addName(onyxIngotStack, "Onyx Gem");
        LanguageRegistry.addName(onyxPressurePlate, "Onyx Pressure Plate");
        LanguageRegistry.addName(onyxHalfSlab, "Onyx Slab");
        LanguageRegistry.addName(onyxHalfDoubleSlabStack, "Onyx Slab");

        MinecraftForge.setBlockHarvestLevel(onyxOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(onyxBlock, "pickaxe", 2);

        GameRegistry.registerWorldGenerator(oreManager);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}