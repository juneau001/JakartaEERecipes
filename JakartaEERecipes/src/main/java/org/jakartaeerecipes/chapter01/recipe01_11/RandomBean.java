
package org.jakartaeerecipes.chapter01.recipe01_11;

import java.util.Random;

/**
 * Recipe 2-3
 * @author juneau
 */
public class RandomBean implements java.io.Serializable {
    Random randomGenerator = new Random();
    private int randomNumber = 0;

    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        randomNumber = randomGenerator.nextInt();
        return randomNumber;
    }
    
}
