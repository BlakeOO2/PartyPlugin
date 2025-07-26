package com.Blakeoo2.PartyAPI.Members;

import com.Blakeoo2.party.PartyManager;
import com.Blakeoo2.Main;

import java.util.Set;
import java.util.UUID;

public class MembersImpl implements MembersAPI {
    private Main plugin;
    PartyManager partyManager = plugin.getPartyManager();


    public int getPartySize(UUID player) {
        return partyManager.getPartySize(player);
    }

    @Override
    public UUID getPartyLeader(UUID Player) {
        //TODO returns the party leader
        return null;
    }

    @Override
    public Set<UUID> getPartyMembers(UUID Player) {
        //TODO returns the list of party members
        return Set.of();
    }

    @Override
    public boolean isInParty(UUID Player) {
        //TODO returns true if player is in a party
        return false;
    }
}
