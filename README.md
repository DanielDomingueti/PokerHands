# PokerHands

Implementation of Problem #54 - Project Euler
https://projecteuler.net/problem=54

Expected output: 376 <br>
Program output:  The 1st player has won 376 times, whereas the 2nd player has won 624 times.
<br><br>

## How the solution works (at a high level)
- First of all, the execute() method in DefineHandCounts is in charge of reading all the lines from the .txt file. <br>
- For each line, it calls the execute(firstHand, secondHand) method of IdentifyRank component in order to identify which hand of cards is the most valuable. This method returns a Counter object representing which hand has the highest ranked cards. <br>
- Once there's the winner hand of the line, the algorithm add up local counter variables firstHandCounter or secondHandCounter accordingly. <br>
- This process is repeated until there's no more lines in the .txt file.<br>
- <i>I've decided to define the winner right after reading each line so I don't need to storage any kind of information for further comparisons.</i> 

<b>What about the execute(firstHand, secondHand) method of IdentifyRank component? How does that work?</b>
- In the first place, both hands are sorted out in descending order. That helps the comparison process for Royal_flush_rank e.g. <br>
- Then the identifyRank(hand) is called for both hands which returns two Classification objects. This method is separated into two strategies. <br>
  - It separates the classification process according to the number of suits of a hand. [rankHandOneSuit(hand) and rankHandManySuits(hand)] <br>
  - The first comparison condition is based on the given poker ranks. If both hands have the same rank value, the highest card of the deck is taken in consideration recursively. At this point if there's no winner and all comparisons ended up in ties, their suits are used for further comparisons. 

<br><br>
## Which object-oriented programming ideas did you apply to solve the problem
- Mainly abstraction for both components and encapsulation for objects.

<br><br>
## Points I like about the solution
- It's quite fast for 1000 lines. 
- Abstracted methods following Dependency Inversion Principle (D from SOLID)
- Accurate comparison methods. They address every kind of combination

<br><br>
## Points I dind't like about the solution
- Methods are too long. e.g. execute() method of DefineHandCounts doesn't satisfy the condition of Single Responsability Principle because the lines are read inside of it. This allows me to define the winner right after reading a line though.
- Component Tests could've been better designed if I had JUnit methods. 
- Commits should've been better organized. 

<br><br>
## Which of the technologies or approaches used were new to you.
- The mapCardsToHand(List<Card> cards) method solution was created based on Map<> and Set<> functionalities. Quite interesting.
