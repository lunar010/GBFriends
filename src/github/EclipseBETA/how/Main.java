package github.EclipseBETA.how;

import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public static Main getInstance() { return instance; }
	
	@Override
	public void onEnable() {
		instance = this; 
	}
	
	@Override
	public void onDisable() { instance = null; }
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("owo")){ 
			if (args.length >= 2) {
				int rand = getRandom(1,100);
				if(args[1] == "girlfriend") {
					executor.sendMessage("Probably... You will " + rand + "% have a girlfriend! OwO");
				} else if (args[1] == "boyfriend") {
					executor.sendMessage("Probably... You will " + rand + "% have a boyfriend! OwO");
				} else {
					executor.sendMessage("Unknown Command. use /owo");
				}
			} else {
				executor.sendMessage("OwO");
				executor.sendMessage("/owo girlfriend - Chances of having a girlfriend");
				executor.sendMessage("/owo boyfriend - Chances of having a boyfriend");
			}
		}
		return false;
	}
	
	public int getRandom(int lower, int upper) {
        Random random = new Random();
        return random.nextInt((upper - lower) + 1) + lower;
    }
}