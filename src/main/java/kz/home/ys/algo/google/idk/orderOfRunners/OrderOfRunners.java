package kz.home.ys.algo.google.idk.orderOfRunners;

import java.util.*;

class OrderOfRunners {

    public List<Character> orderOfRunners(char[] before, char[] after) {
        /* topological sort?
         1) can we be confident that E is not before C,B, and A respectively? - my suggestion is NO -> so topological sort is our approach?
            if there is an example: =
            A->B
            B->C
            A->C
            C->D
            E->D

            1.1) add A on stack
            1.2) add E on stack because it looks like a root
            1.3) pop A and pop E and mark then as visited
            1.4) continue for A and after all iterations continue for E

         2) there is one problem is possibility of cycle:
            A->B
            B->A


        */

        return null;
    }
}