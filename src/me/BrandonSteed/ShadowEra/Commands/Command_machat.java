package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_machat implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_machat(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.machat"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
if (args.length == 0) {
          player.sendMessage(ChatColor.RED + "Correct Usage is: /machat <player> <message>");
          }
                 
        String Say = "";
        for (int i = 1; i <= args.length - 1; i++)
        {
          Say = Say + args[i];
          if (i != args.length - 1) {
            Say = Say + " ";
          }
        }
        if (player == sender)
        {
            sender.sendMessage(ChatColor.RED + "Don't try to machat yourself, idiot.");
            return true;
        }
        
        if (getServer().getPlayerExact(args[0]) == null) {
          sender.sendMessage("That player isn't online, Sorry ;(");
        } else {
          getServer().getPlayer(args[0]).chat(Say);
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD + "You made" + getServer().getPlayer(args[0]).getName() + " say " + Say);
                }
        return false;

        
    }
}