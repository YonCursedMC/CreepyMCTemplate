package net.minecraft.src;

public class WorldGenSign {
	public boolean generate(World var1, int var2, int var3, int var4, String var5, String var6, String var7, String var8) {
		var1.setBlock(var2, var3, var4, Block.signPost.blockID);
		TileEntitySign var9 = new TileEntitySign();
		var9.xCoord = var2;
		var9.yCoord = var3;
		var9.zCoord = var4;
		var9.worldObj = var1;
		var9.signText = new String[]{"\u00A74" + var5, "\u00A74" + var6, "\u00A74" + var7, "\u00A74" + var8};
		var1.setBlockTileEntity(var2, var3, var4, var9);
		return true;
	}
 public boolean generate(World var1, EntityPlayer p, String var5, String var6, String var7, String var8) {
		var1.setBlock(p.worldObj.posX, p.worldObj.posY, p.worldObj.posZ, Block.signPost.blockID);
		TileEntitySign var9 = new TileEntitySign();
		var9.xCoord = p.worldObj.posX;
		var9.yCoord = p.worldObj.posY;
		var9.zCoord = p.worldObj.posZ;
		var9.worldObj = var1;
		var9.signText = new String[]{"\u00A74" + var5, "\u00A74" + var6, "\u00A74" + var7, "\u00A74" + var8};
		var1.setBlockTileEntity(p.worldObj.posX, p.worldObj.posY, p.worldObj.posZ, var9);
		return true;
	}
}