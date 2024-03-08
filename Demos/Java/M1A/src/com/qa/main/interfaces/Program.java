package com.qa.main.interfaces;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Smartphone s = new Smartphone();
		CdPlayer c = new CdPlayer();
		
		ArrayList<MusicPlayer> musicPlayers = new ArrayList<>();
		
		musicPlayers.add(s);
		musicPlayers.add(c);

		for (MusicPlayer player : musicPlayers) {
			player.play();
		}
	}

}
