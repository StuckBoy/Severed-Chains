package legend.lodmod.shops;

import legend.game.types.ShopStruct40;
import legend.lodmod.LodEquipment;
import legend.lodmod.LodItems;

import java.util.LinkedHashMap;

public class Shops {
  public static LinkedHashMap<String, ShopStruct40> shops = new LinkedHashMap<>();

  static {
    shops.put("bale_equipment_castle", new ShopStruct40(0, LodEquipment.BASTARD_SWORD::get, LodEquipment.SPARKLE_ARROW::get, LodEquipment.SCALE_ARMOR::get, LodEquipment.LEATHER_JACKET::get, LodEquipment.SALLET::get, LodEquipment.POISON_GUARD::get, LodEquipment.PANIC_GUARD::get, LodEquipment.STUN_GUARD::get, LodEquipment.BRAVERY_AMULET::get, LodEquipment.KNIGHT_SHIELD::get));
    shops.put("serdio_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.SPEAR_FROST::get, LodItems.METEOR_FALL::get, LodItems.CHARM_POTION::get));
    shops.put("lohan_equipment_shop", new ShopStruct40(0, LodEquipment.LANCE::get, LodEquipment.CAPE::get, LodEquipment.LEGEND_CASQUE::get, LodEquipment.ACTIVE_RING::get, LodEquipment.PROTECTOR::get, LodEquipment.PANIC_GUARD::get, LodEquipment.POWER_WRIST::get, LodEquipment.WARGOD_CALLING::get, LodEquipment.PHANTOM_SHIELD::get, LodEquipment.DRAGON_SHIELD::get, LodEquipment.ANGEL_SCARF::get, LodEquipment.ULTIMATE_WARGOD::get));
    shops.put("lohan_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.SPINNING_GALE::get, LodItems.GUSHING_MAGMA::get, LodItems.CHARM_POTION::get));
    shops.put("kazas_equipment_shop", new ShopStruct40(0, LodEquipment.HEAT_BLADE::get, LodEquipment.LONG_BOW::get, LodEquipment.ARMET::get, LodEquipment.IRON_KNEEPIECE::get));
    shops.put("kazas_fort_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.DARK_MIST::get, LodItems.FATAL_BLIZZARD::get));
    shops.put("fletz_equipment_shop", new ShopStruct40(0, LodEquipment.SHADOW_CUTTER::get, LodEquipment.CHAIN_MAIL::get, LodEquipment.SOFT_BOOTS::get, LodEquipment.POISON_GUARD::get, LodEquipment.ACTIVE_RING::get, LodEquipment.PROTECTOR::get, LodEquipment.PANIC_GUARD::get, LodEquipment.STUN_GUARD::get, LodEquipment.BRAVERY_AMULET::get, LodEquipment.MAGIC_EGO_BELL::get, LodEquipment.POWER_WRIST::get, LodEquipment.KNIGHT_SHIELD::get, LodEquipment.WARGOD_CALLING::get));
    shops.put("fletz_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.TRANS_LIGHT::get, LodItems.BLACK_RAIN::get, LodItems.CHARM_POTION::get));
    shops.put("donau_equipment_shop", new ShopStruct40(0, LodEquipment.SILVER_VEST::get, LodEquipment.TIARA::get));
    shops.put("donau_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.RAVE_TWISTER::get));
    shops.put("queen_fury_equipment_shop", new ShopStruct40(0, LodEquipment.GLAIVE::get, LodEquipment.BEAST_FANG::get, LodEquipment.WARRIOR_DRESS::get, LodEquipment.STUN_GUARD::get, LodEquipment.MAGIC_EGO_BELL::get));
    shops.put("queen_fury_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.TRANS_LIGHT::get, LodItems.DANCING_RAY::get));
    shops.put("fueno_equipment_shop", new ShopStruct40(0, LodEquipment.FALCHION::get, LodEquipment.BEMUSING_ARROW::get, LodEquipment.MORNING_STAR::get, LodEquipment.PLATE_MAIL::get, LodEquipment.SPARKLE_DRESS::get, LodEquipment.KNIGHT_HELM::get));
    shops.put("fueno_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.CHARM_POTION::get, LodItems.BURN_OUT::get, LodItems.GUSHING_MAGMA::get));
    shops.put("furni_equipment_shop", new ShopStruct40(0, LodEquipment.DANCING_DAGGER::get, LodEquipment.GIGANTO_HELM::get, LodEquipment.COMBAT_SHOES::get, LodEquipment.DESTONE_AMULET::get, LodEquipment.ATTACK_BADGE::get, LodEquipment.ELUDE_CLOAK::get));
    shops.put("furni_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.DEPETRIFIER::get, LodItems.THUNDERBOLT::get));
    shops.put("deningrad_equipment_shop", new ShopStruct40(0, LodEquipment.TOMAHAWK::get, LodEquipment.SPEAR_OF_TERROR::get, LodEquipment.DIAMOND_CLAW::get, LodEquipment.BREAST_PLATE::get, LodEquipment.MASTERS_VEST::get, LodEquipment.SOUL_HEADBAND::get, LodEquipment.JEWELED_CROWN::get, LodEquipment.STARDUST_BOOTS::get, LodEquipment.PROTECTOR::get, LodEquipment.BRAVERY_AMULET::get, LodEquipment.DESTONE_AMULET::get, LodEquipment.ARMOR_OF_LEGEND::get));
    shops.put("deningrad_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.DEPETRIFIER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.SPARK_NET::get, LodItems.THUNDERBOLT::get, LodItems.CHARM_POTION::get));
    shops.put("wingly_forest_equipment_shop", new ShopStruct40(0, LodEquipment.WAR_HAMMER::get, LodEquipment.MAGICAL_RING::get, LodEquipment.SPIRITUAL_RING::get, LodEquipment.SPIRIT_CLOAK::get));
    shops.put("wingly_forest_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.SUN_RHAPSODY::get, LodItems.HEALING_BREEZE::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.DARK_MIST::get, LodItems.BLACK_RAIN::get));
    shops.put("vellweb_equipment_shop", new ShopStruct40(0, LodEquipment.PARTISAN::get, LodEquipment.HEAVY_MACE::get, LodEquipment.GIGANTO_ARMOR::get, LodEquipment.ENERGY_GIRDLE::get, LodEquipment.GIGANTO_RING::get));
    shops.put("vellweb_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.CHARM_POTION::get));
    shops.put("ulara_equipment_shop", new ShopStruct40(0, LodEquipment.FAIRY_SWORD::get, LodEquipment.ARROW_OF_FORCE::get, LodEquipment.THUNDER_FIST::get, LodEquipment.MAGICAL_GREAVES::get, LodEquipment.MAGICAL_RING::get, LodEquipment.SPIRITUAL_RING::get, LodEquipment.ELUDE_CLOAK::get, LodEquipment.SPIRIT_CLOAK::get, LodEquipment.SAGES_CLOAK::get));
    shops.put("ulara_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.CHARM_POTION::get, LodItems.PANIC_BELL::get, LodItems.STUNNING_HAMMER::get, LodItems.POISON_NEEDLE::get, LodItems.MIDNIGHT_TERROR::get, LodItems.ATTACK_BALL::get, LodItems.RECOVERY_BALL::get));
    shops.put("rouge_equipment_shop", new ShopStruct40(0, LodEquipment.ATTACK_BADGE::get, LodEquipment.GUARD_BADGE::get, LodEquipment.GIGANTO_RING::get));
    shops.put("rouge_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.PANIC_BELL::get));
    shops.put("moon_equipment_shop", new ShopStruct40(0, LodEquipment.CLAYMORE::get, LodEquipment.HALBERD::get, LodEquipment.BASHER::get, LodEquipment.DESTROYER_MACE::get, LodEquipment.RED_DG_ARMOR::get, LodEquipment.JADE_DG_ARMOR::get, LodEquipment.GOLD_DG_ARMOR::get, LodEquipment.VIOLET_DG_ARMOR::get, LodEquipment.SILVER_DG_ARMOR::get, LodEquipment.DARK_DG_ARMOR::get, LodEquipment.BLUE_DG_ARMOR::get, LodEquipment.MAGICAL_RING::get, LodEquipment.SPIRITUAL_RING::get, LodEquipment.ATTACK_BADGE::get, LodEquipment.GUARD_BADGE::get, LodEquipment.GIGANTO_RING::get));
    shops.put("moon_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.DEPETRIFIER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.PANIC_BELL::get, LodItems.POISON_NEEDLE::get));
    shops.put("hellena_01_item_shop", new ShopStruct40(3, LodItems.HEALING_POTION::get, LodItems.ANGELS_PRAYER::get, LodItems.SPARK_NET::get));
    shops.put("kashua_equipment_shop", new ShopStruct40(0, LodEquipment.MIND_CRUSH::get, LodEquipment.BATTLE_AXE::get, LodEquipment.FLAMBERGE::get, LodEquipment.VIRULENT_ARROW::get, LodEquipment.SAINT_ARMOR::get, LodEquipment.ROBE::get, LodEquipment.GUARD_BADGE::get));
    shops.put("kashua_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.HEALING_BREEZE::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.BODY_PURIFIER::get, LodItems.CHARM_POTION::get));
    shops.put("fletz_accessory_shop", new ShopStruct40(0, LodEquipment.RUBY_RING::get, LodEquipment.SAPPHIRE_PIN::get, LodEquipment.EMERALD_EARRING::get, LodEquipment.PLATINUM_COLLAR::get));
    shops.put("forest_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.BODY_PURIFIER::get, LodItems.BURN_OUT::get, LodItems.CHARM_POTION::get));
    shops.put("kazas_fort_equipment_shop", new ShopStruct40(0, LodEquipment.FAKE_POWER_WRIST::get, LodEquipment.FAKE_SHIELD::get));
    shops.put("volcano_item_shop", new ShopStruct40(1, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.DANCING_RAY::get, LodItems.PELLET::get));
    shops.put("zenebatos_equipment_shop", new ShopStruct40(0, LodEquipment.GREAT_AXE::get, LodEquipment.GLADIUS::get, LodEquipment.RED_DG_ARMOR::get, LodEquipment.JADE_DG_ARMOR::get, LodEquipment.DARK_DG_ARMOR::get, LodEquipment.BLUE_DG_ARMOR::get, LodEquipment.PANIC_GUARD::get, LodEquipment.BRAVERY_AMULET::get, LodEquipment.DESTONE_AMULET::get));
    shops.put("zenebatos_item_shop", new ShopStruct40(1, LodItems.HEALING_FOG::get, LodItems.SUN_RHAPSODY::get, LodItems.HEALING_BREEZE::get, LodItems.ANGELS_PRAYER::get, LodItems.DEPETRIFIER::get, LodItems.MIND_PURIFIER::get, LodItems.BODY_PURIFIER::get, LodItems.CHARM_POTION::get));
    shops.put("hellena_02_item_shop", new ShopStruct40(3, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get, LodItems.MIND_PURIFIER::get, LodItems.MIDNIGHT_TERROR::get, LodItems.THUNDERBOLT::get));
    shops.put("unknown_shop_01", new ShopStruct40(0, LodItems.HEALING_POTION::get, LodItems.SUN_RHAPSODY::get, LodItems.ANGELS_PRAYER::get));
    shops.put("empty_shop", new ShopStruct40(0));
  }
}
