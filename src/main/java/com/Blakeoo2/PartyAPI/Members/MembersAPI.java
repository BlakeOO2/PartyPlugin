package com.Blakeoo2.PartyAPI.Members;

import java.util.Set;
import java.util.UUID;

public interface MembersAPI {



    int getPartySize(UUID Player);

    //Sends any member that might be in a party and returns the UUID of the party leader
    UUID getPartyLeader(UUID Player);

    //checks if a player is the party leader
    boolean isPartyLeader(UUID Player);

    //gets a list of all the party members by sending the UUID of any player in the party
    Set<UUID> getPartyMembers(UUID Player);

    //checks if a player is in a party
    boolean isInParty(UUID Player);

}
