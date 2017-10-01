/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.heroz.lobbyapi;

import org.bukkit.command.ConsoleCommandSender;

/**
 *
 * @author Admin
 */
public final class Console {
    
    public static void log(String message, Object... args){
        print("&7[&9LOG&7] %s",LobbySystem.format(message, args));
    }
    
    public static void info(String message, Object... args){
        print("&7[&bINFO&7] %s",LobbySystem.format(message, args));
    }
    
    public static void warn(String message, Object... args){
        print("&7[&eWARN&7] %s",LobbySystem.format(message, args));
    }
    
    public static void error(String message, Object... args){
        print("&7[&cERR&7] %s",LobbySystem.format(message, args));
    }
    
    private static void print(String message, Object... args){
        ConsoleCommandSender console = LobbySystem.getConsoleSender();
        console.sendMessage(LobbySystem.format(message, args));
    }
    
}
