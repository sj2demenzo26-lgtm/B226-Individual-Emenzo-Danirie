
package day14.activity;


public class Activity10_Emenzo {
    
    public static void main(String args[]){
        
        // 1. Math.abs() -> Strips away any negative sign to give the absolute distance from zero.
        int stepsBackward = -5;
        int absoluteDistance = Math.abs(stepsBackward); 
        System.out.println("1. Math.abs(-5) = " + absoluteDistance);
        System.out.println("   Explanation: Ignores whether a number is positive or negative and gives you the raw distance.");

        // 2. Math.max() -> Compares two numbers and returns the larger value.
        double itemPriceA = 150.50;
        double itemPriceB = 299.99;
        double maxPrice = Math.max(itemPriceA, itemPriceB);
        System.out.println("\n2. Math.max(150.50, 299.99) = " + maxPrice);
        System.out.println("   Explanation: Compares two numbers and picks the highest one.");

        // 3. Math.min() -> Compares two numbers and returns the smaller value.
        int scorePlayer1 = 45;
        int scorePlayer2 = 32;
        int lowestScore = Math.min(scorePlayer1, scorePlayer2);
        System.out.println("\n3. Math.min(45, 32) = " + lowestScore);
        System.out.println("   Explanation: Compares two numbers and picks the lowest one.");

        // 4. Math.pow() -> Raises a base number to the power of a given exponent (base^exponent).
        double base = 3;
        double exponent = 4; 
        double powerResult = Math.pow(base, exponent);
        System.out.println("\n4. Math.pow(3, 4) = " + powerResult);
        System.out.println("   Explanation: Multiplies a number by itself a specific number of times (3 * 3 * 3 * 3).");

        // 5. Math.sqrt() -> Calculates the square root of a number.
        double area = 64;
        double sideLength = Math.sqrt(area);
        System.out.println("\n5. Math.sqrt(64) = " + sideLength);
        System.out.println("   Explanation: The reverse of squaring. It asks: 'What number times itself equals this number?'");

        // 6. Math.round() -> Rounds a decimal value to the nearest whole integer (.5 and up goes up).
        double rating = 4.67;
        long roundedRating = Math.round(rating);
        System.out.println("\n6. Math.round(4.67) = " + roundedRating);
        System.out.println("   Explanation: Standard rounding to the nearest whole number. .5 or higher goes up.");

        // 7. Math.ceil() -> Rounds a decimal UP to the next mathematical integer ("ceiling").
        double boxesNeeded = 3.2;
        double finalBoxes = Math.ceil(boxesNeeded);
        System.out.println("\n7. Math.ceil(3.2) = " + finalBoxes);
        System.out.println("   Explanation: Always rounds UP to the next whole number, no matter how small the decimal is.");

        // 8. Math.floor() -> Rounds a decimal DOWN by chopping off the decimal portion ("floor").
        double levelProgress = 14.99;
        double currentLevel = Math.floor(levelProgress);
        System.out.println("\n8. Math.floor(14.99) = " + currentLevel);
        System.out.println("   Explanation: Always rounds DOWN by cutting off the decimal completely to keep the whole number.");

        // 9. Math.random() -> Generates a pseudo-random decimal number between 0.0 (inclusive) and 1.0 (exclusive).
        double randomFraction = Math.random();
        System.out.println("\n9. Math.random() = " + randomFraction);
        System.out.println("   Explanation: Spits out a completely unpredictable random decimal between 0.0 and 1.0.");

        // 10. Math.log() -> Calculates the natural logarithm (base e) of a number.
        double naturalLog = Math.log(2.71828); 
        System.out.println("\n10. Math.log(2.71828) = " + naturalLog);
        System.out.println("   Explanation: Natural log. It measures how many times base 'e' must multiply to hit a number.");

        // 11. Math.log10() -> Calculates the base-10 logarithm of a number.
        double logBase10 = Math.log10(1000); 
        System.out.println("\n11. Math.log10(1000) = " + logBase10);
        System.out.println("   Explanation: Base-10 log. It counts things in steps of 10 (10 to what power equals 1000?).");

        // 12. Math.exp() -> Returns Euler's number 'e' raised to the power of x (e^x).
        double expResult = Math.exp(1);
        System.out.println("\n12. Math.exp(1) = " + expResult);
        System.out.println("   Explanation: Exponential growth. The opposite of a log, it makes numbers skyrocket fast.");

        // Convert 45 degrees to radians because Java trig methods require radians
        double radians = Math.toRadians(45); 

        // 13. Math.sin() -> Returns the trigonometric sine of an angle.
        double sinValue = Math.sin(radians);
        System.out.println("\n13. Math.sin(45 degrees) = " + sinValue);
        System.out.println("   Explanation: Used with a continuous timer to create smooth, bobbing wave patterns.");

        // 14. Math.cos() -> Returns the trigonometric cosine of an angle.
        double cosValue = Math.cos(radians);
        System.out.println("\n14. Math.cos(45 degrees) = " + cosValue);
        System.out.println("   Explanation: Pairs with sine to handle perfectly smooth circular motions like loading spinners.");

        // 15. Math.tan() -> Returns the trigonometric tangent of an angle.
        double tanValue = Math.tan(radians);
        System.out.println("\n15. Math.tan(45 degrees) = " + tanValue);
        System.out.println("   Explanation: Measures the steepness of a slope or the spread angle of something like a flashlight beam.");
    }
    
    
    
}
