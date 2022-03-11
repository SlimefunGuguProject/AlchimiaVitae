package me.apeiros.alchimiavitae.setup;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import me.apeiros.alchimiavitae.AlchimiaVitae;
import me.apeiros.alchimiavitae.listeners.infusion.InfusionAxeListener;
import me.apeiros.alchimiavitae.listeners.infusion.InfusionBowListener;
import me.apeiros.alchimiavitae.listeners.infusion.InfusionFishingRodListener;
import me.apeiros.alchimiavitae.listeners.infusion.InfusionHoeListener;
import me.apeiros.alchimiavitae.listeners.infusion.InfusionTotemListener;
import me.apeiros.alchimiavitae.listeners.SheepDyeListener;
import me.apeiros.alchimiavitae.setup.items.crafters.AltarOfInfusion;
import me.apeiros.alchimiavitae.setup.items.crafters.DivineAltar;
import me.apeiros.alchimiavitae.setup.items.crafters.OrnateCauldron;
import me.apeiros.alchimiavitae.setup.items.electric.EXPCrystallizer;
import me.apeiros.alchimiavitae.setup.items.electric.PlantInfusionChamber;
import me.apeiros.alchimiavitae.setup.items.general.CondensedSoul;
import me.apeiros.alchimiavitae.setup.items.general.Darksteel;
import me.apeiros.alchimiavitae.setup.items.general.EXPCrystal;
import me.apeiros.alchimiavitae.setup.items.general.Illumium;
import me.apeiros.alchimiavitae.setup.items.general.MoltenMysteryMetal;
import me.apeiros.alchimiavitae.setup.items.general.MysteryMetal;
import me.apeiros.alchimiavitae.setup.items.general.SoulCollector;
import me.apeiros.alchimiavitae.setup.items.plants.EvilEssence;
import me.apeiros.alchimiavitae.setup.items.plants.EvilMagicPlant;
import me.apeiros.alchimiavitae.setup.items.plants.GoodEssence;
import me.apeiros.alchimiavitae.setup.items.plants.GoodMagicPlant;
import me.apeiros.alchimiavitae.setup.items.potions.BenevolentBrew;
import me.apeiros.alchimiavitae.setup.items.potions.MalevolentConcoction;
import me.apeiros.alchimiavitae.setup.items.potions.PotionOfOsmosis;
import me.apeiros.alchimiavitae.utils.Categories;
import org.bukkit.NamespacedKey;

public class Setup {

    public static void setup(AlchimiaVitae p) {
        // Category
        Categories.MAIN.register(p);

        // Items
        new SoulCollector(Categories.GENERAL).register(p);
        new CondensedSoul(Categories.GENERAL).register(p);
        new PlantInfusionChamber(Categories.GENERAL).register(p);
        new GoodMagicPlant(Categories.GENERAL).register(p);
        new EvilMagicPlant(Categories.GENERAL).register(p);
        new GoodEssence(Categories.GENERAL).register(p);
        new EvilEssence(Categories.GENERAL).register(p);
        new EXPCrystallizer(Categories.GENERAL).register(p);
        new EXPCrystal(Categories.GENERAL).register(p);
        new Illumium(Categories.GENERAL).register(p);
        new Darksteel(Categories.GENERAL).register(p);
        new DivineAltar(Categories.GENERAL).register(p);
        new MoltenMysteryMetal(Categories.GENERAL).register(p);
        new MysteryMetal(Categories.GENERAL).register(p);
        new OrnateCauldron(Categories.GENERAL).register(p);
        new PotionOfOsmosis(Categories.GENERAL).register(p);
        new BenevolentBrew(Categories.GENERAL, p).register(p);
        new MalevolentConcoction(Categories.GENERAL, p).register(p);
        new AltarOfInfusion(Categories.INFUSIONS).register(p);

        // Listeners
        new SheepDyeListener(p);
        
        // Infusion listeners
        new InfusionAxeListener(p);
        new InfusionBowListener(p);
        new InfusionHoeListener(p);
        new InfusionTotemListener(p);
        new InfusionFishingRodListener(p);

        // Researches
        setupResearches(p);
    }

    public static void setupResearches(AlchimiaVitae p) {
        new Research(new NamespacedKey(p, "soul"), 131072,
                "破坏轮回", 25)
                .addItems(Items.CONDENSED_SOUL, Items.SOUL_COLLECTOR)
                .register();

        new Research(new NamespacedKey(p, "magic_plants"), 131073,
                "两极对立", 30)
                .addItems(Items.PLANT_INFUSION_CHAMBER, Items.GOOD_MAGIC_PLANT, Items.EVIL_MAGIC_PLANT)
                .register();

        new Research(new NamespacedKey(p, "magic_essence"), 131074,
                "需要打磨", 10)
                .addItems(Items.GOOD_ESSENCE, Items.EVIL_ESSENCE)
                .register();

        new Research(new NamespacedKey(p, "exp_crystals"), 131075,
                "晶化经验", 21)
                .addItems(Items.EXP_CRYSTALLIZER, Items.EXP_CRYSTAL)
                .register();

        new Research(new NamespacedKey(p, "magic_steel"), 131076,
                "神秘金属", 16)
                .addItems(Items.DARKSTEEL, Items.ILLUMIUM)
                .register();

        new Research(new NamespacedKey(p, "divine_altar"), 131077,
                "古代祭坛的远房亲戚", 45)
                .addItems(Items.DIVINE_ALTAR)
                .register();

        new Research(new NamespacedKey(p, "metal_amalgamation"), 131078,
                "金属物质的混合", 19)
                .addItems(Items.MOLTEN_MYSTERY_METAL, Items.MYSTERY_METAL)
                .register();

        new Research(new NamespacedKey(p, "ornate_cauldron"), 131079,
                "酿造高级药水的装置", 35)
                .addItems(Items.ORNATE_CAULDRON)
                .register();

        new Research(new NamespacedKey(p, "potion_of_osmosis"), 131080,
                "渗透与吸收", 30)
                .addItems(Items.POTION_OF_OSMOSIS)
                .register();

        new Research(new NamespacedKey(p, "benevolent_brew"), 131081,
                "来自盖亚的祝福", 35)
                .addItems(Items.BENEVOLENT_BREW)
                .register();

        new Research(new NamespacedKey(p, "malevolent_concoction"), 131082,
                "带有轻微腐蚀的物质", 35)
                .addItems(Items.MALEVOLENT_CONCOCTION)
                .register();

        new Research(new NamespacedKey(p, "altar_of_infusion"), 131083,
                "终极祭坛", 30)
                .addItems(Items.ALTAR_OF_INFUSION)
                .register();
    }
}
