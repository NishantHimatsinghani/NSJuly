package Oct5thCode;

public class RottenTomatoes {

  public static void main(String[] args) {

    /*
    Given a matrix(2D array) of dimension m*n where each cell in the matrix can have values 0, 1 or 2
    which has the following meaning:

0: Empty cell
1: Cells have fresh tomato
2: Cells have rotten tomato
Determine what is the minimum time required so that all the oranges become rotten.
A rotten tomato at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right).
If it is impossible to rot every orange then simply return -1.

Input:  arr[][C] = { {2, 1, 0, 2, 1},
                     {1, 0, 1, 2, 1},
                     {1, 0, 0, 2, 1}};
Output: 2
All oranges can become rotten in 2-time frames.
Explanation:
At 0th time frame:
{2, 1, 0, 2, 1},
{1, 0, 1, 2, 1},
{1, 0, 0, 2, 1}}

At 1st time frame:
 {2, 2, 0, 2, 2}
 {2, 0, 2, 2, 2}
 {1, 0, 0, 2, 2}

At 2nd time frame:
 {2, 2, 0, 2, 2}
 {2, 0, 2, 2, 2}
 {2, 0, 0, 2, 2}

 QUEUE :
 At any point of time, we have the position of all the 2's in our queue
  State of Queue :
  at 0th frame : (0,0) (0,3) (1,3) (2,3) (null)

  Now we process these 2's one by one and keep on removing them from the queue
  processing involves :
    going up, down, left, right -- i.e. process the immediate neighbours of the current level rotten tomato
    if any value is 1 :
      then we change it to 2 and we add that position in the queue
    else :
      continue

    At 1st time frame : (null) (1,0) (0,1) (0,4) (1,2) (1,4) (2,4) (null)

    At 2nd time frame : so on and so forth

    Basically, like this, we traverse every next immediate level only
    And we need to calculate how many levels do we traverse
    Number of levels traversed is our solution

    Everytime we encounter null, we increment the counter
    At the end, we :
      check if all tomatoes are rotten :
        if yes :
          return counter
        else return -1
     */




  }
}
