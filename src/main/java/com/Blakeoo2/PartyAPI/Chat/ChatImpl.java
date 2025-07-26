package com.Blakeoo2.PartyAPI.Chat;

import com.Blakeoo2.Main;
import com.Blakeoo2.party.PartyManager;

import java.util.UUID;

public class ChatImpl implements ChatAPI {

    private Main plugin;
    PartyManager partyManager = plugin.getPartyManager();


    public void setPartyChat(UUID playerID, boolean partyChatActive) {
        //this will turn party chat on or off for the whole party
        partyManager.setPartysChat(playerID, partyChatActive);
    }

    public void setPlayerPartyChat(UUID playerID, boolean partyChatActive){

    }
}
