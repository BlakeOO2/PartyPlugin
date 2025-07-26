package com.Blakeoo2.PartyAPI.Chat;

import java.util.UUID;

public interface ChatAPI {


    void setPartyChat(UUID playerID, boolean partyChatActive);
    void setPlayerPartyChat(UUID playerID, boolean partyChatActive);
}
