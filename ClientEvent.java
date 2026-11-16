package net.minecraft.src;

import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Random;

public class ClientEvent {
	public boolean[] timerS;
	public int[] timer;
	public Minecraft mc;
	private Random rand;

	public ClientEvent(Minecraft mc) {
		this.timerS = new boolean[20];
		this.timer = new int[20];
		this.mc = mc;
	}

	public void event0() {
	}

	public void event1() {
	}

	public void event2() {
	}

	public void event3() {
	}

	public void event4() {
	}

	public void event5() {
	}

	public void event6() {
	}

	public void event7() {
	}

	public void tickEvents() {
		if(this.timerS[0]) {
			this.timer[0]++;
			if(this.timer[0] >= 20 * 10) {
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
