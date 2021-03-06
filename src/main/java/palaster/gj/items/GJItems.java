package palaster.gj.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import palaster.gj.libs.LibMod;

@ObjectHolder(LibMod.MODID)
public class GJItems {

	public static final Item RPG_INTRO = new ItemRPGIntro(),
			JOB_PAMPHLET = new ItemJobPamphlet(),
			PINK_SLIP = new ItemPinkSlip(),
			GJ_MATERIAL = new ItemGJMaterial(),
			CLERIC_STAFF = new ItemClericStaff(),
			BLOOD_BOOK = new ItemBloodBook(),
			HAND = new ItemHand(),
			TEST = new ItemTest();
}