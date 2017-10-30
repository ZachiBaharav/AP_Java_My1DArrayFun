
/**
 *
 * @author Dr. Baharav
 */

public class Main {

    static public void main(String[] args) {
        
        int[] A ;
        A = new int[5];
        for (int ii=0; ii<5; ++ii)
            A[ii] = ii*ii ;
        
        System.out.println("A");
        for (int ii=0; ii<5; ++ii)
            System.out.println(ii + " :: " + A[ii]);
        
        double[] D = {0,2,4,6,8} ;
        System.out.println("D");
        for (int ii=0; ii<D.length ; ++ii)
            System.out.println(ii + " :: " + D[ii]);
        
        // Array of Strings
        String[] S = new String[3];
        S[0] = "I am nothing";
        S[1] = "I am middle";
        S[2] = "I am three!";
        
        System.out.println("S");
        for (int ii=0; ii<S.length; ++ii)
            System.out.println(ii + " :: " + S[ii]);
        
        // find Max
        // start with max=0, and then explain the problem with negative arrays
        // then go to min value.
        int max = Integer.MIN_VALUE ;
        int idx = 0;
        for (int ii=0; ii<A.length; ++ii)
            if (A[ii]>max) {
                max = A[ii];
                idx = ii;
            }
        
        System.out.println("Maximum value: A[" + idx + "] = " + max );

        // another pattern
        max = A[0] ;    // you need to know there's at least one value
        idx = 0;
        for (int ii=1; ii<A.length; ++ii)
            if (A[ii]>max) {
                max = A[ii];
                idx = ii;
            }
        System.out.println("Maximum value: A[" + idx + "] = " + max );
        
        
        // find min
        int min = Integer.MAX_VALUE ;
        idx = 0;
        for (int ii=0; ii<A.length; ++ii)
            if (A[ii]<max) {
                min = A[ii];
                idx = ii;
            }
        
        System.out.println("Minimum value: A[" + idx + "] = " + min );

                
        // Return the longest string in the array
        
        
        
        
        // Interested?
        System.out.println("Max value = Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        int calcMax = (int) (Math.pow(2, 31)-1) ;
        System.out.println("Max value = The same as " + calcMax );
        
        
        // switch two numbers
        System.out.println("BEFORE:");
        for (int ii=0; ii<S.length; ++ii)
            System.out.println(ii + " :: " + S[ii]);

        int i = 1;
        int j = 2;
        String tmp = S[1];
        S[1] = S[2] ;
        S[2] = tmp;

        System.out.println("AFTER:");
        for (int ii=0; ii<S.length; ++ii)
            System.out.println(ii + " :: " + S[ii]);
        
        
        
        // insert a number
        // prepare
        final int NC = 6;
        int[] C = new int[NC];
        int lc = 0;
        
        C[lc] = 1;
        lc++;
        C[lc++] = 2;
        C[lc++] = 3;
        C[lc++] = 4;
        
        System.out.println("Printing Array C:");
        for (int ii=0; ii<NC ; ++ii)
            System.out.println(ii + " :: " + C[ii]);

        // Insert the number 99 in location 2
        int idxInsert = 2;
        int valInsert = 99;
        for (int ii=lc-1; ii>=idxInsert ; --ii)
            C[ii+1] = C[ii];
        C[idxInsert] = valInsert;
        lc++;
        
        System.out.println("Printing Array C:");
        for (int ii=0; ii<NC ; ++ii)
            System.out.println(ii + " :: " + C[ii]);

        printArray(C,"****Printing Array C:");
        

        
        // Remove the number at location 1
        int idxRemove = 1;
        for (int ii=idxRemove; ii<lc ; ++ii)
            C[ii] = C[ii+1];
        lc--;
        
        printArray(C,"****After removing element at index :" + idxRemove);
        


        // From Litvin's book:
        // All questions are from chapter 9, very relevantto us.
        // Pages 259 and 260

        // Question 7 from the book, quadratic equation
        // Question 9 from the book, pythagorean triples
        // Question 11 from the book, Fibonnaci numbers
        
    }
    
    
    
    static void printArray(int[] a, String msg) {
        System.out.println(msg);
        for (int ii=0; ii<a.length ; ++ii)
            System.out.println(ii + " :: " + a[ii]);
    }
    
}
