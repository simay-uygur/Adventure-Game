# Adventure-Game
This is a simple game for a better understanding in Object-Oriented Programming in Java.


Important Rules: When player exits the location the left location's set player variable should be set to null (Fot the onLocation() method in the Location class.).

## Class Diagram (General)
Some other methdos are added during coding but the general structure is in the image. This image is from Patika Java Intermediate Course.

![class diagram](https://github.com/simay-uygur/Adventure-Game/blob/main/src/class-diagram.jpg)


The special reward for the area should be added to the player’s inventory after all enemies in the battle areas have been cleared. If the player collects all rewards and returns to the “Safe House,” they win the game. Additionally, once a reward is obtained, the player cannot re-enter that area.

Area Rewards:

Cave => Food
Forest => Firewood
River => Water
2 - When the player encounters a monster, who gets the first move should be determined with a 50% chance. (Currently, the player always attacks first.)

3 - A new battle area should be added. The purpose of this area is to provide a chance to randomly obtain money, weapons, or armor from defeated enemies.

Area Name: Mine
Monster: Snake (1-5)
Feature: Combat and Loot
Item: Money, Weapon, or Armor

Snake Characteristics:

ID: 4
Damage: Random (between 3 and 6)
Health: 12
Money: None (instead, there’s a chance to win items)
Items Dropped by Defeated Enemies:

Weapon Drop Chance: 15%
Rifle Drop Chance: 20%
Sword Drop Chance: 30%
Pistol Drop Chance: 50%
Armor Drop Chance: 15%
Heavy Armor Drop Chance: 20%
Medium Armor Drop Chance: 30%
Light Armor Drop Chance: 50%
Money Drop Chance: 25%
10 Coins Drop Chance: 20%
5 Coins Drop Chance: 30%
1 Coin Drop Chance: 50%
Chance of Winning Nothing: 45%
Let me know if you need any more help!