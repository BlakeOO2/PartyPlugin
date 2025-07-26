package com.Blakeoo2.PartyAPI;

import com.Blakeoo2.PartyAPI.Chat.ChatAPI;
import com.Blakeoo2.PartyAPI.Chat.ChatImpl;
import com.Blakeoo2.PartyAPI.Members.MembersAPI;
import com.Blakeoo2.PartyAPI.Members.MembersImpl;
import com.Blakeoo2.party.PartyManager;

public class PartyAPIImplementation implements PartyAPI{

    private final PartyManager partyManager;

    public PartyAPIImplementation(PartyManager partyManager){
        this.partyManager = partyManager;
    }


    @Override
    public ChatAPI chat() {
        return new ChatImpl();
    }

    public MembersAPI members(){
        return new MembersImpl();
    }
}
