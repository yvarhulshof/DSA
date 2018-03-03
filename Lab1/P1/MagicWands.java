public class MagicWands{

  public static void main(String[] args) {
    System.out.println(nrOfWandTouches(10));
  }
  public static int nrOfWandTouches(int i){
    if(i == 0) return 1;
    else if(i % 2 == 0) return i/2 + 2;
    else return (i+1)/2 + 2;
  }
}


/*
Suppose you are given a set of small boxes, numbered 1 to n, identical in every respect except that each of the first i contain a pearl whereas the remaining n−i are empty.
You also have two magic wands that can each test whether a box is empty or not in a single touch, except that a wand disappears if you test it on an empty box.

Show that, without knowing the value of i, you can use the two wands to determine all the boxes containing pearls using at most O(n) wand touches.
Express, as a function of n, the asymptotic number of wand touches needed. Next, write the algorithm that determines the number of wand touched needed.
*/

/*
-start by checking the 1st box, then keep moving 2 forwards.
-if the we find an empty box, check the box before the current one:
-if this one is filled, then the first 2(n-2) - 1 boxes are filled (so i is even), it takes i/2 + 2 wand touches
-if this one is full, then the first 2(n-2) boxes are filled (so i is odd), it takes (i+1)/2 + 2 wand touches
-so the asymptotic number of wand touches needed is n but the algorithm runs in O(1)
*/
