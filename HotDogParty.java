//Hot dog party

import javax.swing.JOptionPane;

class HotDogParty {
    public static void main(String[] args) {

        //We're having a hot dog party and we need to know how many hot dogs and buns we need.
        //There are 10 hot dogs in a package and 8 buns in a package. We also want to calculate how many 
        //hot dogs and buns will be left over.
        // First we need to define our integers and strings.
        // We'll then get the input data from the user with JOptionPane.

        int peopleAttending, dogsDesired, dogsPackage,
                bunsPackage, totalDogs;

        String people, dogs;

        people = JOptionPane.showInputDialog(
                "How many people will be at the hot dog party?");
        dogs = JOptionPane.showInputDialog(
                "How many hot dogs will each person eat?");

        peopleAttending = Integer.parseInt(people);
        dogsDesired = Integer.parseInt(dogs);

        dogsPackage = 10;
        bunsPackage = 8;

        totalDogs = peopleAttending * dogsDesired;

        // Next we'll need to calculate how many packets of dogs and buns we'll need
        // depending on the input data.
        // I made these if/else statements since the formula changes based on if some
        // items are left over.
        // Without the if statements, the integer would round down giving us the wrong
        // amount of dogs/buns.

        int dogPacksNeeded, bunPacksNeeded;

        if (totalDogs % dogsPackage != 0)
            dogPacksNeeded = (totalDogs / dogsPackage) + 1;
        else
            dogPacksNeeded = totalDogs / dogsPackage;

        if (totalDogs % bunsPackage != 0)
            bunPacksNeeded = (totalDogs / bunsPackage) + 1;
        else
            bunPacksNeeded = totalDogs / bunsPackage;

        // Now we'll need to start thinking about caluclating how many items are left
        // over.
        // I added the integers dogPacksLeft and bunPacksLeft since the Needed integers
        // cannot equal zero.

        int dogsLeftover, bunsLeftover, dogPacksLeft, bunPacksLeft;

        dogPacksLeft = totalDogs % dogsPackage;
        bunPacksLeft = totalDogs % bunsPackage;

        if (totalDogs % dogsPackage != 0)
            dogPacksLeft = (totalDogs / dogsPackage) + 1;
        else
            dogPacksLeft = totalDogs / dogsPackage;

        if (totalDogs % bunsPackage != 0)
            bunPacksLeft = (totalDogs / bunsPackage) + 1;
        else
            bunPacksLeft = totalDogs / bunsPackage;

        // Let's make sure that the dogPacksNeeded integers cannot equal zero.

        if (dogPacksNeeded < 1)
            dogPacksNeeded = 1;
        if (bunPacksNeeded < 1)
            bunPacksNeeded = 1;

        // It's time to display our calculated number of dogs and buns!

        JOptionPane.showMessageDialog(null, "Number of hot dog packages needed = " + dogPacksNeeded);
        JOptionPane.showMessageDialog(null, "Number of hot dog bun packages needed = " + bunPacksNeeded);

        // Almost there. We need to make sure our left over items run correctly.
        // I made these if/else statements so we get the correct number of items.
        // This gives us the correct amount even when the dogs needed are only a few.

        if (totalDogs > 10)
            dogsLeftover = ((dogPacksLeft * 10)) - totalDogs;
        else
            dogsLeftover = (10 - totalDogs);

        if (totalDogs > 8)
            bunsLeftover = ((bunPacksLeft * 8)) - totalDogs;
        else
            bunsLeftover = (8 - totalDogs);

        // Finally, we need to display the amount of dogs and buns left over.
        // I made these if statements so that they will not run if there are no items
        // left over.
        // It looks like a lot but this was the way I figured out how to always get the
        // right answer.
        // The first draft was simple, but I would get wrong answers when testing things
        // like 1 person at party eating 1 hotdog.

        if (dogsLeftover != 0)
            JOptionPane.showMessageDialog(null, "Hot dogs left over = " + dogsLeftover);
        if (bunsLeftover != 0)
            JOptionPane.showMessageDialog(null, "Hot dog buns left over = " + bunsLeftover);

        System.exit(0);
    }
}