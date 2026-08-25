package net.minecraft.src;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;

public class WavPlaySound {

	public static void playsound(String resourcePath) {
		try(InputStream rawStream = WavPlaySound.class.getResourceAsStream(resourcePath)) {
			if(rawStream == null) {
				System.err.println("Non Resource: " + resourcePath); return;
			}

			try(BufferedInputStream bufferedStream = new BufferedInputStream(rawStream); AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedStream)) {

				Clip clip = AudioSystem.getClip(); clip.open(audioInputStream); clip.start();

				clip.addLineListener(event->{
					if(event.getType() == LineEvent.Type.STOP) {
						clip.close();
					}
				});

				while(clip.isRunning()) {
					Thread.sleep(100);
				}
			}

		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
