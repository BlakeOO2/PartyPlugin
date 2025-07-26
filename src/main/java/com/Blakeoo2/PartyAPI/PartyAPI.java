package com.Blakeoo2.PartyAPI;

import com.Blakeoo2.PartyAPI.Chat.ChatAPI;
import com.Blakeoo2.PartyAPI.Members.MembersAPI;

public interface PartyAPI {


    ChatAPI chat();
    MembersAPI members();



}
