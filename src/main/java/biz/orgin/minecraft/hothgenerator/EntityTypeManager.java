package biz.orgin.minecraft.hothgenerator;

import org.bukkit.entity.EntityType;

/**
 * Handles converting materials between ID's an instances of the Material class.
 * Since all type ID functions have been deprecated in bukkit then this
 * plugin must handle ID's on its own.
 * Unknown ID's and Materials are treated with the deprecated functions for now.
 * Unfortunately any new block must be added to this class..
 * @author orgin
 *
 */
public class EntityTypeManager
{
	public static void main(String[] args)
	{
		// Generate code for toID() function
		System.out.println("/*");
		System.out.println(" * Returns a classic block type id related to the material");
		System.out.println(" */");
		System.out.println("@SuppressWarnings(\"deprecation\")");
		System.out.println("public static int toID(EntityType entityType)");
		System.out.println("{");
		boolean added = false;
		for(int i=0;i<1024;i++)
		{
			
			@SuppressWarnings("deprecation")
			EntityType entityType = EntityType.fromId(i);
			if(entityType!=null)
			{
				String name = entityType.name();
				String suffix = "";
				if(added)
				{
					suffix = "else ";
				}
				System.out.println("\t" + suffix + "if(entityType.equals(EntityType." + name + "))");
				System.out.println("\t{");
				System.out.println("\t\treturn " + i + ";");
				System.out.println("\t}");
				added = true;
			}
		}
		System.out.println("\treturn entityType.getTypeId();");
		System.out.println("}");
		
		System.out.println();
		
		// Generate code for toMaterial() function
		System.out.println("/*");
		System.out.println(" * Returns a classic block type id related to the material");
		System.out.println(" */");
		System.out.println("@SuppressWarnings(\"deprecation\")");
		System.out.println("public static EntityType toEntityType(int id)");
		System.out.println("{");
		added = false;
		for(int i=0;i<1024;i++)
		{
			@SuppressWarnings("deprecation")
			EntityType entityType = EntityType.fromId(i);
			if(entityType!=null)
			{
				String name = entityType.name();
				String suffix = "";
				if(added)
				{
					suffix = "else ";
				}
				System.out.println("\t" + suffix + "if(id==" + i + ")");
				System.out.println("\t{");
				System.out.println("\t\treturn EntityType." + name + ";");
				System.out.println("\t}");
				added = true;
			}
		}
		System.out.println("\treturn EntityType.fromId(id);");
		System.out.println("}");
	}

	// Generated code below
	
	/*
	 * Returns a classic block type id related to the material
	 */
	//@SuppressWarnings("deprecation")
	/*public static int toID(EntityType entityType)
	{
		if(entityType.equals(EntityType.DROPPED_ITEM))
		{
			return 1;
		}
		else if(entityType.equals(EntityType.EXPERIENCE_ORB))
		{
			return 2;
		}
		else if(entityType.equals(EntityType.LEASH_HITCH))
		{
			return 8;
		}
		else if(entityType.equals(EntityType.PAINTING))
		{
			return 9;
		}
		else if(entityType.equals(EntityType.ARROW))
		{
			return 10;
		}
		else if(entityType.equals(EntityType.SNOWBALL))
		{
			return 11;
		}
		else if(entityType.equals(EntityType.FIREBALL))
		{
			return 12;
		}
		else if(entityType.equals(EntityType.SMALL_FIREBALL))
		{
			return 13;
		}
		else if(entityType.equals(EntityType.ENDER_PEARL))
		{
			return 14;
		}
		else if(entityType.equals(EntityType.ENDER_SIGNAL))
		{
			return 15;
		}
		else if(entityType.equals(EntityType.THROWN_EXP_BOTTLE))
		{
			return 17;
		}
		else if(entityType.equals(EntityType.ITEM_FRAME))
		{
			return 18;
		}
		else if(entityType.equals(EntityType.WITHER_SKULL))
		{
			return 19;
		}
		else if(entityType.equals(EntityType.PRIMED_TNT))
		{
			return 20;
		}
		else if(entityType.equals(EntityType.FALLING_BLOCK))
		{
			return 21;
		}
		else if(entityType.equals(EntityType.FIREWORK))
		{
			return 22;
		}
		else if(entityType.equals(EntityType.TIPPED_ARROW))
		{
			return 23;
		}
		else if(entityType.equals(EntityType.SPECTRAL_ARROW))
		{
			return 24;
		}
		else if(entityType.equals(EntityType.SHULKER_BULLET))
		{
			return 25;
		}
		else if(entityType.equals(EntityType.DRAGON_FIREBALL))
		{
			return 26;
		}
		else if(entityType.equals(EntityType.ARMOR_STAND))
		{
			return 30;
		}
		else if(entityType.equals(EntityType.MINECART_COMMAND))
		{
			return 40;
		}
		else if(entityType.equals(EntityType.BOAT))
		{
			return 41;
		}
		else if(entityType.equals(EntityType.MINECART))
		{
			return 42;
		}
		else if(entityType.equals(EntityType.MINECART_CHEST))
		{
			return 43;
		}
		else if(entityType.equals(EntityType.MINECART_FURNACE))
		{
			return 44;
		}
		else if(entityType.equals(EntityType.MINECART_TNT))
		{
			return 45;
		}
		else if(entityType.equals(EntityType.MINECART_HOPPER))
		{
			return 46;
		}
		else if(entityType.equals(EntityType.MINECART_MOB_SPAWNER))
		{
			return 47;
		}
		else if(entityType.equals(EntityType.CREEPER))
		{
			return 50;
		}
		else if(entityType.equals(EntityType.SKELETON))
		{
			return 51;
		}
		else if(entityType.equals(EntityType.SPIDER))
		{
			return 52;
		}
		else if(entityType.equals(EntityType.GIANT))
		{
			return 53;
		}
		else if(entityType.equals(EntityType.ZOMBIE))
		{
			return 54;
		}
		else if(entityType.equals(EntityType.SLIME))
		{
			return 55;
		}
		else if(entityType.equals(EntityType.GHAST))
		{
			return 56;
		}
		else if(entityType.equals(EntityType.PIG_ZOMBIE))
		{
			return 57;
		}
		else if(entityType.equals(EntityType.ENDERMAN))
		{
			return 58;
		}
		else if(entityType.equals(EntityType.CAVE_SPIDER))
		{
			return 59;
		}
		else if(entityType.equals(EntityType.SILVERFISH))
		{
			return 60;
		}
		else if(entityType.equals(EntityType.BLAZE))
		{
			return 61;
		}
		else if(entityType.equals(EntityType.MAGMA_CUBE))
		{
			return 62;
		}
		else if(entityType.equals(EntityType.ENDER_DRAGON))
		{
			return 63;
		}
		else if(entityType.equals(EntityType.WITHER))
		{
			return 64;
		}
		else if(entityType.equals(EntityType.BAT))
		{
			return 65;
		}
		else if(entityType.equals(EntityType.WITCH))
		{
			return 66;
		}
		else if(entityType.equals(EntityType.ENDERMITE))
		{
			return 67;
		}
		else if(entityType.equals(EntityType.GUARDIAN))
		{
			return 68;
		}
		else if(entityType.equals(EntityType.SHULKER))
		{
			return 69;
		}
		else if(entityType.equals(EntityType.PIG))
		{
			return 90;
		}
		else if(entityType.equals(EntityType.SHEEP))
		{
			return 91;
		}
		else if(entityType.equals(EntityType.COW))
		{
			return 92;
		}
		else if(entityType.equals(EntityType.CHICKEN))
		{
			return 93;
		}
		else if(entityType.equals(EntityType.SQUID))
		{
			return 94;
		}
		else if(entityType.equals(EntityType.WOLF))
		{
			return 95;
		}
		else if(entityType.equals(EntityType.MUSHROOM_COW))
		{
			return 96;
		}
		else if(entityType.equals(EntityType.SNOWMAN))
		{
			return 97;
		}
		else if(entityType.equals(EntityType.OCELOT))
		{
			return 98;
		}
		else if(entityType.equals(EntityType.IRON_GOLEM))
		{
			return 99;
		}
		else if(entityType.equals(EntityType.HORSE))
		{
			return 100;
		}
		else if(entityType.equals(EntityType.RABBIT))
		{
			return 101;
		}
		else if(entityType.equals(EntityType.VILLAGER))
		{
			return 120;
		}
		else if(entityType.equals(EntityType.ENDER_CRYSTAL))
		{
			return 200;
		}
		return entityType.getTypeId();
	}*/

	/*
	 * Returns a classic block type id related to the material
	 */
	//@SuppressWarnings("deprecation")
	public static EntityType toEntityType(int id)
	{
            return EntityType.fromId(id);
            /*
            switch (id) {
                case 1:
                    return EntityType.ITEM;
                case 2:
                    return EntityType.EXPERIENCE_ORB;
                case 8:
                    return EntityType.LEASH_KNOT;
                case 9:
                    return EntityType.PAINTING;
                case 10:
                    return EntityType.ARROW;
                case 11:
                    return EntityType.SNOWBALL;
                case 12:
                    return EntityType.FIREBALL;
                case 13:
                    return EntityType.SMALL_FIREBALL;
                case 14:
                    return EntityType.ENDER_PEARL;
                case 15:
                    return EntityType.EYE_OF_ENDER;
                case 17:
                    return EntityType.EXPERIENCE_BOTTLE;
                case 18:
                    return EntityType.ITEM_FRAME;
                case 19:
                    return EntityType.WITHER_SKULL;
                case 20:
                    return EntityType.TNT;
                case 21:
                    return EntityType.FALLING_BLOCK;
                case 22:
                    return EntityType.FIREWORK_ROCKET;
                case 23:
                    return EntityType.SPECTRAL_ARROW;
                case 24:
                    return EntityType.SPECTRAL_ARROW;
                case 25:
                    return EntityType.SHULKER_BULLET;
                case 26:
                    return EntityType.DRAGON_FIREBALL;
                case 30:
                    return EntityType.ARMOR_STAND;
                case 40:
                    return EntityType.MINECART_COMMAND;
                case 41:
                    return EntityType.BOAT;
                case 42:
                    return EntityType.MINECART;
                case 43:
                    return EntityType.MINECART_CHEST;
                case 44:
                    return EntityType.MINECART_FURNACE;
                case 45:
                    return EntityType.MINECART_TNT;
                case 46:
                    return EntityType.MINECART_HOPPER;
                case 47:
                    return EntityType.MINECART_MOB_SPAWNER;
                case 50:
                    return EntityType.CREEPER;
                case 51:
                    return EntityType.SKELETON;
                case 52:
                    return EntityType.SPIDER;
                case 53:
                    return EntityType.GIANT;
                case 54:
                    return EntityType.ZOMBIE;
                case 55:
                    return EntityType.SLIME;
                case 56:
                    return EntityType.GHAST;
                case 57:
                    return EntityType.PIG_ZOMBIE;
                case 58:
                    return EntityType.ENDERMAN;
                case 59:
                    return EntityType.CAVE_SPIDER;
                case 60:
                    return EntityType.SILVERFISH;
                case 61:
                    return EntityType.BLAZE;
                case 62:
                    return EntityType.MAGMA_CUBE;
                case 63:
                    return EntityType.ENDER_DRAGON;
                case 64:
                    return EntityType.WITHER;
                case 65:
                    return EntityType.BAT;
                case 66:
                    return EntityType.WITCH;
                case 67:
                    return EntityType.ENDERMITE;
                case 68:
                    return EntityType.GUARDIAN;
                case 69:
                    return EntityType.SHULKER;
                case 90:
                    return EntityType.PIG;
                case 91:
                    return EntityType.SHEEP;
                case 92:
                    return EntityType.COW;
                case 93:
                    return EntityType.CHICKEN;
                case 94:
                    return EntityType.SQUID;
                case 95:
                    return EntityType.WOLF;
                case 96:
                    return EntityType.MUSHROOM_COW;
                case 97:
                    return EntityType.SNOWMAN;
                case 98:
                    return EntityType.OCELOT;
                case 99:
                    return EntityType.IRON_GOLEM;
                case 100:
                    return EntityType.HORSE;
                case 101:
                    return EntityType.RABBIT;
                case 120:
                    return EntityType.VILLAGER;
                case 200:
                    return EntityType.ENDER_CRYSTAL;
                default:
                    break;
            }
		return EntityType.fromId(id);*/
	}
}
