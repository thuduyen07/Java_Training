package com.thuduyen07.C11_JavaProgram.Basic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * Random number conditions
 * <ol>
 *     <li>uniformly distributed over definite interval</li>
 *     <li>can not guess the previous or next one</li>
 * </ol>
 */
public class RandomNumber extends Base {
    public static void main(String[] args) {

        /** Math.random() --> double in [0.0, 1.0] */
        System.out.println("Random number using Math.random(): " + Math.random());

        // Random number between specified range
        int startNumber = getIntFromConsole("start number");
        int endNumber = getIntFromConsole("end number");
        int randomNumber = (int)(Math.random()*(endNumber-startNumber+1)+startNumber); // not () --> always=1
        System.out.printf("Random number in [%d,%d] is: %d ", startNumber, endNumber, randomNumber);

        /** Random class */
        Random random = new Random();

        int randomInt = random.nextInt(); // [pow(-2,31), pow(2,31)-1]
        System.out.println("\nRandom Int: " + randomInt);

        int randomIntBound = random.nextInt(100); // [0, 100)
        System.out.println("Random Int Bound: " + randomIntBound);

        float randomFloat = random.nextFloat(); // [0.0, 1.0]
        System.out.println("Random Float: " + randomFloat);

        double randomDouble = random.nextDouble(); // [0.0, 1.0]
        System.out.println("Random Double: " + randomDouble);

        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        Boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        /** ThreadLocalRandomClass */ // impossible to share ThreadLocalRandom with multiple threads accidentally //todo hong hiu =((
        System.out.println("--- Thread local random ---");
        System.out.println("Int: " + ThreadLocalRandom.current().nextInt());
        System.out.println("Bound int: " + ThreadLocalRandom.current().nextInt(100)); // [0,100)
        System.out.println("Origin bound int: " + ThreadLocalRandom.current().nextInt(10, 11)); // [origin, bound)
        System.out.println("Float: " + ThreadLocalRandom.current().nextFloat()); // no para
        System.out.println("Long: " + ThreadLocalRandom.current().nextLong());
        System.out.println("Double: " + ThreadLocalRandom.current().nextDouble());
        System.out.println("Boolean: " + ThreadLocalRandom.current().nextBoolean());
        System.out.println("Gaussian: " + ThreadLocalRandom.current().nextGaussian()); // =))

        /** Random number generation in Java 8 */
        generatedRandomInts(10);
        generatedRandomInts(20, 10, 100);
    }

    /** Random number generation methods */
    // generate an int stream with streamSize elements
    public static void generatedRandomInts(int streamSize){
        Random random1 = new Random();
        random1.ints(streamSize).forEach(System.out::println);
    }

    // generate an int stream of streamSize element in [origin, bound]
    public static void generatedRandomInts(int streamSize, int origin, int bound){
        Random random2 = new Random();
        random2.ints(streamSize, origin, bound).forEach(System.out::println);

    }
}

// https://www.javatpoint.com/how-to-generate-random-number-in-java