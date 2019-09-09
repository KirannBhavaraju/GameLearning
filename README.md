
# GameLearning
An A.I learns how to play the old IQ game.

## Temp Notes 
> Date: 09/09/2019
> Time: 17:38 PM CEST
* Separate the classes which contain the main method from all the other asthetics, like windows, etc.

* implement Runnable and use synchronized methods where the game starts and stops.

* The synchronized methods basically wait for the main to finish before completing.

* Implemnent a Game Loop in the run method... Many game loops are present on the internet ... implement any one which can display the FPS.

* Create the thread in the start method.

* Handle exceptions in the stop method.

* Window class basically sets a canvas we can draw on and sets its properties.

* Handler class updates and handles all the objects of the Game.

* Create an abstract GameObject. *all the move operations and all the other aspects.
 
* GAmeObject will have the basic properties of every game object and will have the getters and setters.

* Handler will handle all the game objects.

* ID is an enum with values for ID of in Game Objects.

* tick() is a method used to specify the action of each game object.
* render() is a method used to Render that particular GameObject.

* GameObjects for the Game as a Linked List in the handler.
* handler has a method to create and Remove the GameObjects. 
* handler's tick() goes to the tick() of each GameObject and changes it.
* handler's render() goes to the render() of each GameObject and renders it.
* handler is initialized and declared in the main game class.
* objects are added from the main Game class aswell.

* main Game has a tick() which calls the handlers tick()
* main Game has a render() which calls the handlers render()



