# TestMCAMod
This is the TestMCA Mod, a quick mod that Fir3will (me) and AXELPOLTINO quickly put together,
to show you how the MCAnimator can potentially be used in your Minecraft Mod!
You can copy, paste, fork, clone, or pull as much as you want! It's a public thing that is used just for instructions!

###Entities###
####Horned Goat####
The first entity is the Horned Goat, pretty much a simple animal entity that doesn't do much.
One thing that it does do is if you feed it a grass block, it will start it's eating animation.
If you simply right click it with nothing in your hand, it will play it's charge animation! Pretty Cool!

####Grenade####
This entity is a bit more complex as what it does is pretty much what you'd think. It's a grenade!
You can throw it and it will blow up after a specific time.
It's model is like a spikey ball and is actually customizable using the constructor of the model class!
It's crafting and it's ItemStack is a bit more complex because it goes pretty deep into the whole crafting scene
There are multiple things you can change about the grenade:
######1. It's Explosion Radius (size)
######2. It's Timer before exploding (fuse)
######3. It's Bounce (bounceFactor)
######4. and It's Speed (speed)

To craft a grenade, you have to go to your crafting table and put a gunpowder with a string and BOOM you have a grenade!
(Here's the tricky part!)
Once you have a piece of gunpowder and string in the crafting grid, you can:
######1. Add gunpowder or TNT to increate it's explosion radius
######2. Add string or wool to increase it's timer
######3. Add sugar cane or sugar to increase it's speed
######4. and lastly, add clay blocks or balls of clay to increase it's bounce height. 
#####(BEWARE IT'S MAX BOUNCE HEIGHT IS 100, ITEMS AFTER 100 WILL NOT BE USED!)#####
