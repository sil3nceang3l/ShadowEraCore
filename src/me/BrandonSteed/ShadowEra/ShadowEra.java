
package me.BrandonSteed.ShadowEra;

import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import me.BrandonSteed.ShadowEra.Commands.*;

public class ShadowEra extends JavaPlugin {
public ShadowEra plugin;
     public void onEnable()
     {
        getCommand("rage").setExecutor((org.bukkit.command.CommandExecutor) new Command_rage(this));
        getCommand("announce").setExecutor((org.bukkit.command.CommandExecutor) new Command_announce(this));
        getCommand("administratemode").setExecutor((org.bukkit.command.CommandExecutor) new Command_administratemode(this));
        getCommand("pl").setExecutor((org.bukkit.command.CommandExecutor) new Command_pl(this));
        getCommand("slime").setExecutor((org.bukkit.command.CommandExecutor) new Command_slime(this));
        getCommand("promote").setExecutor((org.bukkit.command.CommandExecutor) new Command_promote(this));
        getCommand("nv").setExecutor((org.bukkit.command.CommandExecutor) new Command_nv(this));
        getCommand("fakeleave").setExecutor((org.bukkit.command.CommandExecutor) new Command_fakeleave(this));
        getCommand("consolesay").setExecutor((org.bukkit.command.CommandExecutor) new Command_consolesay(this));
        getCommand("machat").setExecutor((org.bukkit.command.CommandExecutor) new Command_machat(this));
        getCommand("vj").setExecutor((org.bukkit.CommandExecutor) new Command_vj(this));
        
        new PlayerListener(this);
        
        getLogger().info("[ShadowEraCore] Plugin by Got_No_Friends and VjGamingUK2000.");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.DARK_PURPLE + "Plugin by Got_No_Friends and VjGamingUK2000 sucessfully enabled!");
       
     }
     
     public void onDisable()
     {
        getLogger().info("[ShadowEraCore] Plugin going to sleep...");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.DARK_PURPLE + "Plugin going to sleep...");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.RED + "Warning: ShadowEraCore was disabled on the ShadowEra server! Please re-enable.");
     }

}