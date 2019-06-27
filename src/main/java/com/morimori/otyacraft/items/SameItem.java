package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import afu.org.checkerframework.checker.nullness.qual.Nullable;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
public class SameItem extends SpawnEggItem{

	public OCMaterial matelia;
	public OCmaterialType mateliatype;
	private int PrimaryColor;



	public SameItem(Properties properties, OCMaterial materoal, OCmaterialType materialtype) {
		super(null, 0, 0,properties);

		this.matelia = materoal;
		this.mateliatype = materialtype;
		this.PrimaryColor =this.matelia.getPrimaryColor();


		this.setRegistryName(Variable.MODID,materoal.getMaterialName()+"_"+this.mateliatype.getMaterialTypeName());

	}
	 public ActionResultType onItemUse(ItemUseContext p_195939_1_) {
		return ActionResultType.PASS;

	 }

	   @OnlyIn(Dist.CLIENT)
		public ITextComponent getDisplayName(ItemStack stack) {
		      return new TranslationTextComponent(this.getTranslationKey(stack),matelia.getTranslationKey());
		   }


	   public String getTranslationKey() {


	      return "item."+this.mateliatype.getMaterialTypeName()+".loacl";
	   }

       @OnlyIn(Dist.CLIENT)
       public int getColor(int p_195983_1_) {

    	   return PrimaryColor;
      }
       public static SpawnEggItem getEgg(@Nullable EntityType<?> p_200889_0_) {
		return null;

       }
}
