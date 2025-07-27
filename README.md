# Party Plugin

## Summary
This Party Plugin provides functionality to manage and interact with player parties in Minecraft, including creation, invitations, chat toggling, and administrative commands.

---

## Commands

### Player Commands
| Command                     | Description                                                                   | Usage Example              |
|-----------------------------|-------------------------------------------------------------------------------|----------------------------|
| **/party help**             | Displays the list of available commands.                                      | `/party help`              |
| **/party create**           | Creates a party for the player.                                               | `/party create`            |
| **/party invite <player>**  | Sends a party invite to the specified player.                                 | `/party invite PlayerName` |
| **/party accept**           | Accepts the last received party invite.                                       | `/party accept`            |
| **/party accept <player>**  | Accepts a party invite from a specific player.                                | `/party accept PlayerName` |
| **/party leave**            | Leaves the current party.                                                    | `/party leave`             |
| **/party list**             | Lists members of the current party.                                           | `/party list`              |
| **/party promote <player>** | Promotes the specified member to be the party leader.                         | `/party promote PlayerName`|
| **/party kick <player>**    | Kicks the specified player from the party.                                    | `/party kick PlayerName`   |
| **/party disband**          | Disbands the current party (only available to the leader).                    | `/party disband`           |
| **/party chat**             | Toggles party chat mode, switching between global chat and party chat.        | `/party chat`              |
| **/party chat <message>**   | Sends a one-time message in the party chat.                                   | `/party chat Hello Party!` |

---

### Admin Commands
| Command                              | Description                                                                   | Usage Example                       |
|--------------------------------------|-------------------------------------------------------------------------------|-------------------------------------|
| **/party admin help**                | Displays a list of available admin commands.                                  | `/party admin help`                 |
| **/party admin reload**              | Reloads the plugin's configuration and language files.                        | `/party admin reload`               |
| **/party admin socialspy**           | Enables or disables social spy mode, allowing you to view all party messages. | `/party admin socialspy`            |
| **/party admin seeparty <player>**   | Views the party of the specified player, listing its leader and members.       | `/party admin seeparty PlayerName`  |

---

## Permissions

| Permission                         | Description                                                                  | Default          |
|-------------------------------------|------------------------------------------------------------------------------|------------------|
| **PartyPlugin.bypass.maxSize**      | Allows the user to exceed the party size limit.                              | OP               |
| **PartyPlugin.admin.***             | Grants all admin-related permissions.                                        | OP               |
| **PartyPlugin.admin.reload**        | Allows the admin to reload the plugin configuration and language files.      | OP               |
| **PartyPlugin.admin.socialspy**     | Allows the admin to enable party chat social spy.                            | OP               |
| **PartyPlugin.admin.seeParty**      | Allows the admin to view a player's party details.                           | OP               |

---




## Installation

### Maven Dependencies
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.BlakeOO2</groupId>
    <artifactId>PartyPlugin</artifactId>
    <version>v0.1.1</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```
Make sure to check the latest version that is posted on GitHub.

### Plugin Setup
Add the following to your plugin.yml:
```yml
depends: [PartyPlugin]
```

### Using the API
```java
import com.Blakeoo2.PartyAPI;

private PartyAPI partyAPI;
PartyAPI partyAPI = new PartyAPIImplementation();

public PartyAPI getPartyAPI() {
    if(partyAPI == null){
        debug("PartyAPI is null");
    }
    return partyAPI;
}

// Get party of a player
PartyAPI.getParty(playerUUID);

// Check if player is in a party
boolean isInParty = PartyAPI.isInParty(playerUUID);

// Get party leader
UUID leaderUUID = PartyAPI.getPartyLeader(playerUUID);

// Get party members
Set<UUID> members = PartyAPI.getPartyMembers(playerUUID);

//Gets a list of all the players in a party
getPartyAPI().members().getPartyMembers(UUID Player);


```

## API Overview

### MembersAPI.java
Provides methods to retrieve and manage party-related information.

#### Methods:
1. **`int getPartySize(UUID Player)`**  
   Retrieves the size of the party of the specified player.

2. **`UUID getPartyLeader(UUID Player)`**  
   Returns the UUID of the leader of the party to which the specified player belongs.

3. **`boolean isPartyLeader(UUID Player)`**  
   Checks if the specified player is the leader of their party.

4. **`Set<UUID> getPartyMembers(UUID Player)`**  
   Gets a set of UUIDs representing the members of the party the specified player belongs to.

5. **`boolean isInParty(UUID Player)`**  
   Checks if the specified player is in a party.

---


---

### ChatAPI.java
Handles party chat settings.

#### Methods:
1. **`void setPartyChat(UUID playerID, boolean partyChatActive)`**  
   Activates or deactivates party chat mode for a player.

2. **`void setPlayerPartyChat(UUID playerID, boolean partyChatActive)`**  
   Links a player's chat behavior with their party status.

---