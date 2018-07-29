/*



*/

package me.gobli989.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Tutorial plugin sikeresen betöltött!");
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("tutorial")) {
			
			if(sender instanceof Player) {
				
				player.sendMessage(ChatColor.AQUA + "Szia " + player.getName() + "!");
				player.sendMessage(ChatColor.YELLOW + "Életed: " + player.getHealth() / 2);
				
				if(args.length == 1) {
					player.setHealth(player.getHealth() + Integer.parseInt(args[0]));
					//player.sendMessage(ChatColor.RED + "Mennyit vigyek le?");
				}
				
			}
			
		}
		
		
		return false;
	}
	
	

}
