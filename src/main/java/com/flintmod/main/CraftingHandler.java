package com.flintmod.main;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.RecipeManager;

public class CraftingHandler {
	
	public static void removeRecipes(final RecipeManager manager) {
		// list of all recipes to later remove
		List<Item> toRemove = new ArrayList<>();
		
		final boolean removeWood = FlintConfig.WORLD.REMOVE_WOOD_RECIPES.get();
		final boolean removeStone = FlintConfig.WORLD.REMOVE_STONE_RECIPES.get();
//		final boolean enableAxe = FlintConfig.ITEMS.ENABLE_AXE.get();
//		final boolean enableHoe = FlintConfig.ITEMS.ENABLE_HOE.get();
//		final boolean enablePick = FlintConfig.ITEMS.ENABLE_PICK.get();
//		final boolean enableShovel = FlintConfig.ITEMS.ENABLE_SHOVEL.get();
//		final boolean enableSword = FlintConfig.ITEMS.ENABLE_SWORD.get();
		
		// replace wooden tools IF their flint counterpart is enabled
		if (removeWood) {
			//if(enableAxe) {
				toRemove.add(Items.WOODEN_AXE);
			//}
			//if(enableHoe) {
				toRemove.add(Items.WOODEN_HOE);
			//}
			//if(enablePick) {
				toRemove.add(Items.WOODEN_PICKAXE);
			//}
			//if(enableShovel) {
				toRemove.add(Items.WOODEN_SHOVEL);
			//}
			//if(enableSword) {
				toRemove.add(Items.WOODEN_SWORD);
			//}
		}
		
		// replace stone tools IF their flint counterpart is enabled
		if (removeStone) {
			//if(enableAxe) {
				toRemove.add(Items.STONE_AXE);
			//}
			//if(enableHoe) {
				toRemove.add(Items.STONE_HOE);
			//}
			//if(enablePick) {
				toRemove.add(Items.STONE_PICKAXE);
			//}
			//if(enableShovel) {
				toRemove.add(Items.STONE_SHOVEL);
			//}
			//if(enableSword) {
				toRemove.add(Items.STONE_SWORD);
			//}
		}
		// remove recipes for all the items determined above
		if(!toRemove.isEmpty()) {
			System.out.println("Attempting to remove:\n" + toRemove.toString());
			removeRecipes(manager, toRemove);
		}
	}

	private static void removeRecipes(RecipeManager manager, List<Item> itemsToRemove) {
		
		//Iterator<Item> remove = itemsToRemove.iterator();
//		Map<ResourceLocation, IRecipe> recipes;
//		try {
//			recipes = (Map<ResourceLocation, IRecipe>) org.apache.logging.log4j.core.util.ReflectionUtil
//						.getFieldValue(RecipeManager.class.getDeclaredField("recipes"), manager);
//		} catch (NoSuchFieldException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return;
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return;
//		}
//		
//		if(recipes instanceof Map) {
//			final Set<ResourceLocation> toRemove = new HashSet<>();
//			// populate a list of which recipes to remove
//			for(Entry<ResourceLocation, IRecipe> e : recipes.entrySet()) {
//				ItemStack result = e.getValue().getRecipeOutput();
//				if(result != null && result.getItem() != null && itemsToRemove.contains(result.getItem())) {
//					toRemove.add(e.getKey());
//				}
//			}
//			
//			// remove the flagged recipes
//			for(ResourceLocation rl : toRemove) {
//				System.out.println("Removing " + rl);
//				recipes.remove(rl);
//			}
//		}
		
		
		//manager.getRecipes().removeIf(i -> 
		//	i != null && i.getRecipeOutput() != null 
		//	&& itemsToRemove.contains(i.getRecipeOutput().getItem()));
		// go through each recipe currently registered
//		while (recipes.hasNext()) {
//			ItemStack stack = recipes.next().getRecipeOutput();
//			// get the item result of the recipe
//			if (stack != null && stack.getItem() != null) {
//				Item item = stack.getItem();
//				// go through the list of items that must be removed
//				while(remove.hasNext()) {
//					// if a match is found, remove the recipe.
//					// Also remove the item from the original list
//					// to make the next pass quicker.
//					if (remove.next() == item) {
//						recipes.remove();
//						remove.remove();
//					}
//				}
//			}
//		}
	}

//	private static void addModRecipes()
//	{
//		GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_TOOL_HEAD), "F "," F",'F',Items.FLINT);
//		GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_TOOL_HEAD), " F","F ",'F',Items.FLINT);
//		
//		if(FlintConfig.ENABLE_AXE)
//		{
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_AXE), "FF","SF",'H',FlintItemInit.FLINT_TOOL_HEAD,'F',Items.FLINT,'S',Items.STICK);
//		}
//		if(FlintConfig.ENABLE_HOE)
//		{
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_HOE), "FF","S ",'F',Items.FLINT,'S',Items.STICK);
//		}
//		if(FlintConfig.ENABLE_PICK)
//		{
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_PICK), "HF","S ",'H',FlintItemInit.FLINT_TOOL_HEAD,'F',Items.FLINT,'S',Items.STICK);
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_PICK), "FH","S ",'H',FlintItemInit.FLINT_TOOL_HEAD,'F',Items.FLINT,'S',Items.STICK);
//		}
//		if(FlintConfig.ENABLE_SHOVEL)
//		{
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_SHOVEL), "F","S",'F',Items.FLINT,'S',Items.STICK);
//		}
//		if(FlintConfig.CRAFT_SWORD)
//		{
//			GameRegistry.addShapedRecipe(new ItemStack(FlintItemInit.FLINT_SWORD), "H","S",'H',FlintItemInit.FLINT_TOOL_HEAD,'S',Items.STICK);
//		}
//	}
}
