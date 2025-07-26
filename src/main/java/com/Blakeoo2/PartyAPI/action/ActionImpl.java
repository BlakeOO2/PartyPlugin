package com.Blakeoo2.PartyAPI.action;

import com.Blakeoo2.Main;
import com.Blakeoo2.party.PartyManager;
import org.bukkit.Location;

import java.util.UUID;

public class ActionImpl implements ActionAPI{
    private Main plugin;
    PartyManager partyManager = plugin.getPartyManager();

    @Override
    public void teleportParty(UUID playerID, Location location) {
        partyManager.teleportParty(playerID, location);
    }
}
