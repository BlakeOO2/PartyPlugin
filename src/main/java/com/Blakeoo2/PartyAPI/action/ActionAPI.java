package com.Blakeoo2.PartyAPI.action;

import org.bukkit.Location;

import java.util.UUID;

public interface ActionAPI {

    void teleportParty(UUID playerID, Location location);
}
