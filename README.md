# Party Plugin
## plugin.yml

```yml
depends: [PartyPlugin]
```

## Permission nodes
```yml
permissions:
  PartyPlugin.bypass.maxSize:
    default: op
    description: Allows the user to join a party when it is full
```

## Commands
```yml
commands:
  party:
    description: Base party command
    usage: /party <create/invite/accept/disband/leave/chat>
    aliases:
      - p

  partychat:
    description: Command shortcut for /party chat
    usage: /partychat (message)
    aliases:
      - pc
      - pchat
      - partyc
```

## API Usage

## POM files
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
    <version>v0.0.x</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```
Make sure to check the latest version that is posted on github

## Import usage
```java
import com.Blakeoo2.PartyAPI;

PartyAPI party = Main.getInstance().getPartyAPI();
```

```java

 party.getparty(userID) //User Id can be any member inside of the party, will return the UUID of the leader of the party

```