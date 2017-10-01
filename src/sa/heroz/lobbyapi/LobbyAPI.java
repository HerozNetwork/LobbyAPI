/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.heroz.lobbyapi;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Admin
 */
public class LobbyAPI extends JavaPlugin{

    private static LobbyAPI instance = null;

    public static LobbyAPI getInstance() {
        return instance;
    }
    
    public LobbyAPI() {
        this.u();
    }
    
    private void u(){
        instance = this;
    }

    @Override
    public void onEnable() {
        this.u();
        Console.log("&aEnabled!");
        this.u();
    }

    @Override
    public void onDisable() {
        Console.log("&cDisabled!");
    }
    
}
