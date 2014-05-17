package me.capit.game;

// TODO: Build with LWJGL legacy for harware support on older systems.
import org.lwjgl.GL11.*; // GL1.1: Standard graphics and hardware fallback.
import org.lwjgl.GL12.*; // GL1.2: More modern software;

import java.util.Logger; // For logging.

import me.capit.game.data.Version; // Holds versions better than Strings.
import me.capit.game.data.DiskAccessor; // Convience class for disk accessing.

/**
 * Initializer class for the game's core. Has a few static method calls and initializes the graphic plane.
 * @author Sam Ple and Ran Dom.
 **/
public class GameInit implements Serializeable {
	/* 
	* Generally a good practice to implement Serializeable.
	* Class should always be serializeable for successful obfusication.
	*/
	public static final long serialVersionUID = -88581378463276421946327L // UID. Needed for serialization.
	
	public static final String name = "New Game" // Final var for game name. Actually needs to be named later. TODO.
	public static final Version = new Version(DiskAccessor.getVersionDataArray()); // Final var for version.
	
	/**
	 * Main program method. Called on start of program.
	 * @param args Runtime arguments.
	 **/
	public static void Main (String[] args){
		GameInit game = new GameInit(); // Create a self-instanced object.
			// Wouldn't calling statically be easier?
			// No.
			// Why not?
			// Because. Quiet you.
		game.start();
	}
	
	/**
	 * Initializer's constructor for when the initializer replicates itself.
	 **/ 
	public GameInit(){
		this.init(); // Initialize the GL plane.
	}
	
	private void init(){
		
	}
	
}
