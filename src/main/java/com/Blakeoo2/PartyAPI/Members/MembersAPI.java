package com.Blakeoo2.PartyAPI.Members;

import java.util.Set;
import java.util.UUID;

public interface MembersAPI {



    int getPartySize(UUID Player);
    //TODO return party leader
    UUID getPartyLeader(UUID Player);
    //TODO return party members
    Set<UUID> getPartyMembers(UUID Player);
    //TODO is in Party
    boolean isInParty(UUID Player);

}
