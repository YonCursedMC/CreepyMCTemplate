package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class WorldRandomEvent {
	public World worldObj;
	public boolean[] timerS;
	public int[] timer;

	public WorldRandomEvent(World world) {
		this.worldObj = world;
		this.timerS = new boolean[20];
		this.timer = new int[20];
	}

	public void event0(EntityPlayerMP playerSP) {
	}

	public void event1(EntityPlayerMP playerSP) {
	}

	public void event2(EntityPlayerMP playerSP) {
	}

	public void event3(EntityPlayerMP playerSP) {
	}

	public void event4(EntityPlayerMP playerSP) {
	}

	public void event5(EntityPlayerMP playerSP) {
	}

	public void event6(EntityPlayerMP playerSP) {
	}

	public void event7(EntityPlayerMP playerSP) {
	}

	public void event8(EntityPlayerMP playerSP) {
	}

	public void event9(EntityPlayerMP playerSP) {
	}

	public void event10(EntityPlayerMP playerSP) {
	}

	public void event11(EntityPlayerMP playerSP) {
	}

	public void event12(EntityPlayerMP playerSP) {
	}

	public void event13(EntityPlayerMP playerSP) {
	}

	public void event14(EntityPlayerMP playerSP) {
	}

	public void event15(EntityPlayerMP playerSP) {
	}

	public void tickEvents() {
		List<EntityPlayerMP> playerSPList = this.worldObj.playerEntities;
		if(!playerSPList.isEmpty()) {
			EntityPlayerMP playerSP = playerSPList.get(new Random().nextInt(playerSPList.size()));
			switch(new Random().nextInt(20 * 60 * 30)) {
			case 0:
				this.event0(playerSP);
				break;
			case 1:
				this.event1(playerSP);
				break;
			case 2:
				this.event2(playerSP);
				break;
			case 3:
				this.event3(playerSP);
				break;
			case 4:
				this.event4(playerSP);
				break;
			case 5:
				this.event5(playerSP);
				break;
			case 6:
				this.event6(playerSP);
				break;
			case 7:
				this.event7(playerSP);
				break;
			case 8:
				this.event8(playerSP);
				break;
			case 9:
				this.event9(playerSP);
				break;
			case 10:
				this.event10(playerSP);
				break;
			case 11:
				this.event11(playerSP);
				break;
			case 12:
				this.event12(playerSP);
				break;
			case 13:
				this.event13(playerSP);
				break;
			case 14:
				this.event14(playerSP);
				break;
			case 15:
				this.event15(playerSP);
				break;
			}
			if(this.timerS[0]) {
				this.timer[0]++;
				if(this.timer[0] >= 20 * 60 * 6) {
					this.timerS[0] = false;
					this.timer[0] = 0;
				}
			}
			if(this.timerS[1]) {
				this.timer[1]++;
				if(this.timer[1] >= 20 * 8) {
					this.timerS[1] = false;
					this.timer[1] = 0;
				}
			}
			if(this.timerS[2]) {
				this.timer[2]++;
				if(this.timer[2] >= 20 * 8) {
					this.timerS[2] = false;
					this.timer[2] = 0;
				}
			}
			if(this.timerS[3]) {
				this.timer[3]++;
				if(this.timer[3] >= 20 * 8) {
					this.timerS[3] = false;
					this.timer[3] = 0;
				}
			}
			if(this.timerS[4]) {
				this.timer[4]++;
				if(this.timer[4] >= 20 * 8) {
					this.timerS[4] = false;
					this.timer[4] = 0;
				}
			}
			if(this.timerS[5]) {
				this.timer[5]++;
				if(this.timer[5] >= 20 * 8) {
					this.timerS[5] = false;
					this.timer[5] = 0;
				}
			}
			if(this.timerS[6]) {
				this.timer[6]++;
				if(this.timer[6] >= 20 * 8) {
					this.timerS[6] = false;
					this.timer[6] = 0;
				}
			}
		}
	}
}
