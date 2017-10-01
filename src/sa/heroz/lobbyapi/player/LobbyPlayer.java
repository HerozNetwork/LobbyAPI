/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.heroz.lobbyapi.player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;
import sa.heroz.lobbyapi.until.Rank;

/**
 *
 * @author Admin
 */
public class LobbyPlayer {
    private static Map<UUID, PlayerUpdater> players = new HashMap<>();
    private static Map<String, UUID> names = new HashMap<>();
    private static void put(PlayerUpdater updater){
        
    }
    private static PlayerUpdater getUpdater(UUID uuid){
        return players.get(uuid);
    }
    private static PlayerUpdater getUpdater(String name){
        return getUpdater(names.get(name));
    }
}
class PlayerUpdater{
    private Player player;
    private UUID uuid;
    private Rank rank;

    public PlayerUpdater(Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
        this.rank = Rank.HERO;
    }
    
    public Player getBukkitPlayer() {
        return player;
    }

    public Rank getRank() {
        return rank;
    }

    public UUID getUuid() {
        return uuid;
    }
    
}
