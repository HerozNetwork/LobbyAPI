/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.heroz.lobbyapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

/**
 *
 * @author Admin
 */
public final class LobbySystem {
    
    public static LobbyAPI getPlugin(){
        return LobbyAPI.getInstance();
    }
    
    public static String format(String format, Object... args){
      return ChatColor.translateAlternateColorCodes('&', String.format(format, args));
    }
    
    public static ConsoleCommandSender getConsoleSender(){
        return Bukkit.getConsoleSender();
    }
    
}
