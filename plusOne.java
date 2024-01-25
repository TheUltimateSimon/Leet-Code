class plusOne {
    public int[] plusOne(int[] digits) {
        // Since you add from right to left, start at index length - 1.
        int lastDigit = digits.length - 1;

        // If the last digit is less than 9, just add one.
        if(digits[lastDigit] < 9)
        {
            digits[lastDigit]++;
            return digits;
        }

        // If the last digit is first digit and is >= 9, add a tenth and change it to 0.
        else if(lastDigit < 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        // While the current index, starting at the last digit is 9 or more, set the current index to 0.
        // Go down the index, if the index is now 8 or less, add by one and return.
        // If not, keep changing the current index to 0 until you get to the last digit.
        while (digits[lastDigit] >= 9)
        {
            digits[lastDigit] = 0;
            lastDigit--;
            if((lastDigit < 0))
            {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                return digits;
            }
        }
        digits[lastDigit]++;
        return digits;
    }
}
