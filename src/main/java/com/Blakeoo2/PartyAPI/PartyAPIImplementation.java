package com.Blakeoo2.PartyAPI;

import com.Blakeoo2.PartyAPI.Members.MembersAPI;
import com.Blakeoo2.PartyAPI.Members.MembersImpl;
import com.Blakeoo2.party.PartyManager;

public class PartyAPIImplementation {

    private final PartyManager partyManager;

    public PartyAPIImplementation(PartyManager partyManager){
        this.partyManager = partyManager;
    }


    public MembersAPI members(){
        return new MembersImpl();
    }
    //ChatAPI chat();
    //MembersAPI members();
}
