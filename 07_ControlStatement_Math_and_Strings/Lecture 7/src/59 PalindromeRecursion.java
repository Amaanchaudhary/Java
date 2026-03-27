class PalindromeRecursion {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("You String is " +
                (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        int firstIndex = 0;
        int lastIndex = str.length() - 1;
        if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
            return false;
        }

        String newStr = str.substring(1, lastIndex);
        return isPalindrome(newStr);
    }
}
