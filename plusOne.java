class plusOne {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits.length - 1;
        if(digits[lastDigit] < 9)
        {
            digits[lastDigit]++;
            return digits;
        }
        else if(lastDigit < 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
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
