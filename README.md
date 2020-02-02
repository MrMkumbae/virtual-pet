# virtual-pet

For this project I have five different instance variables, hunger, thirst, boredom, tiredness and waste.

Hunger determines how hungry the virtual pet is. The method feed() is called in order to feed the virtual pet.
Thirst determines how thirsty the virtual pet is. The method water() is called when the pet needs to be watered.
Boredom determines how bored the virtual pet is and the method play() is called when the pet is bored and needs to play.
Tiredness determines how tired the virtual pet is and the method sleep() is called when the pet needs to sleep.
Waste determines how much the virtual pet needs go out to the bathroom and the bathroom() method is called when the pet needs to be let out to the bathroom.

When the method feed() is called, the hunger decreases but the thirst, tiredness and waste increases.
When the method water() is called, thirst and hunger decreases but waste increases.
When the method play() is called, boredom decreases but tiredness, thirst and hunger increases.
When the method sleep() is called, tiredness decreases but hunger, thirst and waste increases.
When the method bathroom() is called, waste decreases.
The tick() method increases hunger, thirst, tiredness and waste. The tick() method is called after every iteration to express a change in time.
VirtualPetApp class has the display method which is used to display the instance variables of the object when called.
