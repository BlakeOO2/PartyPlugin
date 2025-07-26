package com.Blakeoo2.PartyAPI.Chat;

import java.util.UUID;

public interface ChatAPI {


    //TODO set party chat active for all party members
    void setPartyChat(UUID playerID, boolean partyChatActive);
}
