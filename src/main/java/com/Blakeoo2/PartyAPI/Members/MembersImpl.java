package com.Blakeoo2.PartyAPI.Members;

import com.Blakeoo2.party.Party;
import com.Blakeoo2.party.PartyManager;
import com.Blakeoo2.Main;

import java.util.Set;
import java.util.UUID;

public class MembersImpl implements MembersAPI {
    private Main plugin;
    PartyManager partyManager;

    public MembersImpl(Main plugin){
        this.plugin = plugin;
        this.partyManager  = plugin.getPartyManager();
        if(plugin == null){
            throw new IllegalArgumentException("Plugin cannot be null");
        }
    }


    public int getPartySize(UUID player) {
        return partyManager.getPartySize(player);
    }

    @Override
    public UUID getPartyLeader(UUID Player) {
        Party party = partyManager.getParty(Player);
        return party.getLeader() != null ? party.getLeader() : null;
    }

    @Override
    public boolean isPartyLeader(UUID Player) {
        return partyManager.getParty(Player).getLeader().equals(Player);
    }

    @Override
    public Set<UUID> getPartyMembers(UUID Player) {
        return partyManager.getParty(Player).getMembers();
    }

    @Override
    public Set<UUID> getPartyMembersInRange(UUID player, int range) {
        return partyManager.getPartyMembersInRange(player, range);
    }

    @Override
    public boolean isInParty(UUID Player) {
        return partyManager.getParty(Player) != null;
    }
}
