# Design Patterns Examples with Java
## Strategy : 
- It's about using composition rather than inheritance 
- Strategy Pattern defines a family of algorithms, encapsulate them and make them interchangeable
- Strategy let the algorithm vary independently of the client using it. 
- Examples at `com.ridait.dps.strategy`
- UML Diagram: 
![Strategy UML Diagram](https://cdn.journaldev.com/wp-content/uploads/2013/07/Strategy-Pattern.png)

## Observer :
- Observer Pattern defines a One-To-Many dependency between objects so that when one object changes state all of its dependent are notified and updated automatically
- Observable (called also subject) is observed by Observers
- addObserver(), removeObserver() and notifyObservers() are the main methods that an Observable implements
- update() is the method inside the Observer that is called whenever an Observable try to notifyObservers()
- Example at `com.ridait.dps.observer`
- UML Diagram: 
![Observer UML Diagram](https://java-design-patterns.com/patterns/observer/etc/observer.png)
