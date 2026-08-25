package net.minecraft.src;

import java.util.Random;

public class WorldGenTen extends WorldGenerator {
	public boolean generate(World var1, Random var2, int var3, int var4, int var5) {
		boolean var6 = new Random().nextBoolean();
		int petrol = new Random().nextInt(2);
		int block;
		switch(new Random().nextInt(2)) {
		case 0:
			block = Block.lavahome.blockID;
			break;
		case 1:
		default:
			block = Block.sponge.blockID;
			break;
		}

		int var7;
		for(var7 = 0; var7 < 4; ++var7) {
			var1.setBlock(var3, var4 + var7, var5, block);
		}

		for(var7 = 0; var7 < 3; ++var7) {
			if(var7 != 1) {
				if(var6) {
					var1.setBlock(var3 + (var7 - 1), var4 + 1 + petrol, var5, block);
				} else {
					var1.setBlock(var3, var4 + 1 + petrol, var5 + (var7 - 1), block);
				}
			}
		}

		return true;
	}
}
