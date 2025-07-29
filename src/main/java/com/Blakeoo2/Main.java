package com.Blakeoo2;

import com.Blakeoo2.Language.LanguageManager;
import com.Blakeoo2.PartyAPI.PartyAPI;
import com.Blakeoo2.PartyAPI.PartyAPIImplementation;
import com.Blakeoo2.party.*;
import org.bukkit.plugin.java.JavaPlugin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JavaPlugin {
   private static Main plugin;
   private LanguageManager languageManager;
   private PartyManager partyManager;
   private PartyAPI partyAPI;

   // Static initializer to ensure plugin is never null
   static {
       // Default initialization to prevent NPE
       plugin = null;
   }

    public void onEnable() {
        plugin = this;  // Set the static instance first
        saveDefaultConfig();
        languageManager = new LanguageManager(this);
        partyManager = new PartyManager(this);
        // Initialize API after plugin instance is set
        this.partyAPI = new PartyAPIImplementation();

        registerCommands();
        registerListeners();
        cleanUpOfflinePlayers();
    }

    public void onDisable() {
        //not sure what ill need to add here yet if any
    }

    public void reload(){
        reloadConfig();
        languageManager.reloadLanguages();
    }

    public void registerCommands(){
        //Base party command that allows for create, leave, accept, disband, invite, kick, list, promote, and chat
        getCommand("party").setExecutor(new PartyCommands(this));
        getCommand("partychat").setExecutor(new PartyChatCommand(this));

    }

    public void registerListeners(){
        //Listener for chat and join/quit for party members
        getServer().getPluginManager().registerEvents(new PartyListener(this), this);
    }

    public void cleanUpOfflinePlayers(){
        getServer().getScheduler().runTaskTimer(this, () -> {
            getPartyManager().cleanupOfflineMembers();
        }, 20L * 60, 20L * 60);
    }

    public void debug(String message){
        if(getConfig().getBoolean("debug")){
            getLogger().info("[DEBUG] " + message);
        }
    }

    public LanguageManager getLanguageManager() {
        return languageManager;
    }

    public PartyManager getPartyManager() {
        return partyManager;
    }


    public static Main getInstance() {
        if (plugin == null) {
            throw new IllegalStateException("Main plugin instance is not yet initialized. This method should be called after the plugin has been enabled.");
        }
        return plugin;
    }


    public PartyAPI getPartyAPI() {
        if (partyAPI == null) {
            // Ensure we're using 'this' instead of the static reference for guaranteed initialization
            partyAPI = new PartyAPIImplementation();
        }
        return partyAPI;
    }





}

