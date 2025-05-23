# More Than

Enter a number between 1 and 10. Write a Java method called moreThan() that checks if the number is 2 more or less than a randomly generated number between the number entered.

* To generate a random number call the randomNbr() method created for you from the main method.The randomNbr() method is to return a random integer back to the main method.
* To prompt the user for a guess call the makeAGuess() method from the main method. The makeAGuess() method is to return the integer inputted back to the main method.

Your method (moreThan) must accept two integer parameters, which is your guess and the randomly generated number, and return a Boolean. If the number passed into the method is two more or less than the random number generated then return true, else false.

Example of calling the method: moreThan(guess, randomNbr);

```
Test Data:

moreThan(10, 5) → false (5 is generated)
moreThan(5, 5) → false (5 is generated)
moreThan(6, 5) → false (5 is generated)
moreThan(5, 7) → true (7 is generated)
moreThan(3, 5) → true (5 is generated)
```
