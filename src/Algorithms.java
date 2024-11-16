public class Algorithms {

    // Method to reverse a character array
    public char[] reverseArray(char[] inputArray) {
        int left = 0;
        int right = inputArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;

            left++;
            right--;
        }

        return inputArray;
    }
}

