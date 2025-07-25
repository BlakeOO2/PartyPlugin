package com.Blakeoo2;

import com.Blakeoo2.Language.LanguageManager;
import com.Blakeoo2.party.PartyChatCommand;
import com.Blakeoo2.party.PartyCommands;
import com.Blakeoo2.party.PartyListener;
import com.Blakeoo2.party.PartyManager;
import org.bukkit.plugin.java.JavaPlugin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JavaPlugin {
   private static Main plugin;
   private LanguageManager languageManager;
   private PartyManager partyManager;

    public void onEnable() {
        saveDefaultConfig();
        plugin = this;
        languageManager = new LanguageManager(this);
        PartyManager partyManager = new PartyManager(this);

        //TODO RegisterCommands();
        //TODO RegisterListeners();
        //TODO cleanUpOfflinePlayers();
    }

    public void onDisable() {
        //not sure what ill need to add here yet if any
    }

    public void reload(){
        reloadConfig();
        //TODO make this reload language file as well
        //TODO make a command that will run this in game
    }

    public void reginsterCommands(){
        //Base party command that allows for create, leave, accept, disband, invite, kick, list, promote, and chat
        getCommand("party").setExecutor(new PartyCommands(this));
        getCommand("partychat").setExecutor(new PartyChatCommand(this));
        //TODO create subcommands for party create, party invite, party leave, party join, party kick, party list, party info, party delete
        //TODO create command for config reload

    }

    public void registerListeners(){
        //Listener for chat and join/quit for party members
        getServer().getPluginManager().registerEvents(new PartyListener(this), this);
    }

    public void cleanUpOfflinePlayers(){
        //TODO remove players that have been offline for to long check the config to get this number
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



}

