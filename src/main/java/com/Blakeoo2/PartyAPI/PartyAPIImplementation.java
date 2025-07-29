package com.Blakeoo2.PartyAPI;

import com.Blakeoo2.Main;
import com.Blakeoo2.PartyAPI.Chat.ChatAPI;
import com.Blakeoo2.PartyAPI.Chat.ChatImpl;
import com.Blakeoo2.PartyAPI.Members.MembersAPI;
import com.Blakeoo2.PartyAPI.Members.MembersImpl;
import com.Blakeoo2.PartyAPI.action.ActionAPI;
import com.Blakeoo2.PartyAPI.action.ActionImpl;
import com.Blakeoo2.party.PartyManager;

public class PartyAPIImplementation implements PartyAPI{
    private final Main plugin;

    public PartyAPIImplementation(){
        plugin = Main.getInstance();
    }


    @Override
    public ChatAPI chat() {
        return new ChatImpl(plugin);
    }

    public MembersAPI members(){
        return new MembersImpl(plugin);
    }

    @Override
    public ActionAPI action() {
        return new ActionImpl(plugin);
    }
}
