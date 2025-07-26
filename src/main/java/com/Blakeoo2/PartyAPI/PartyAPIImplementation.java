package com.Blakeoo2.PartyAPI;

import com.Blakeoo2.PartyAPI.Chat.ChatAPI;
import com.Blakeoo2.PartyAPI.Chat.ChatImpl;
import com.Blakeoo2.PartyAPI.Members.MembersAPI;
import com.Blakeoo2.PartyAPI.Members.MembersImpl;
import com.Blakeoo2.PartyAPI.action.ActionAPI;
import com.Blakeoo2.PartyAPI.action.ActionImpl;
import com.Blakeoo2.party.PartyManager;

public class PartyAPIImplementation implements PartyAPI{


    public PartyAPIImplementation(){

    }


    @Override
    public ChatAPI chat() {
        return new ChatImpl();
    }

    public MembersAPI members(){
        return new MembersImpl();
    }

    @Override
    public ActionAPI action() {
        return new ActionImpl();
    }
}
