This is a model of a gym(Gym) where game players(User) can workout with equipment (Equipment) to gain stats (e.g. str, cardio).
User is an abstract class modeling a game player.
Man extends User and adds functionalities to the abstract methods specific to male players (e.g. t_level=2 representing testosterone levels).
Equipment is an interface for any equipment in the gym to workout with.
Liftable and Runnable are interfaces that inherit from Equipment (an example of liftable equipment is the Barbell).
Barbell is a concrete Liftable Equipment, and ElectronicBarbell extends Barbell to add the functionality of displaying the number of reps done.
Finally, the Gym class acts as the client, holding the driver code/main method to run the application.

The application implements the SOLID principles as follows:

1. SRP:
Rather than having User calculate all the gains from workout, it delegates the calculations specific to equipments to the Equipment reference it contains.
Therefore User is focused on holding player information and doing player specific calculations.

3. OCP:
Although the upgrade of Barbell to display reps could have been added by modifying the Barbell class, instead the Barbell class was extended to make
ElectronicBarbell. Since they both use the same interface (Liftable), no other classes were required to be changed.

4. ISP:
The interface for all gym equipment was fined grained to Liftable and Runnable so that Barbell wouldn't be forced to implement run.

5. LSP:
In the main method, the superclass Barbell was easily substituted in Equipment reference eq with the subclass Electronic Barbell without any problems.
That's because both use the Liftable interface with proper specializations without sacrificing program logic.

6. DIP:
The code in User/Man refrains from referring to any concrete equipment like Barbell and only refers to the Equipment interface.
Similarly, the code in Barbell or Electronic Barbel only refers to the abstract class User and not Man.
Therefore the concrete classes are not coupled.
