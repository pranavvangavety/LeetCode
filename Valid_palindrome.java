public class Valid_palindrome {
        public static boolean isPalindrome(String s) {
            int i = 0, j = s.length() - 1; // Two pointers

            while (i < j) {
                // Move left pointer to next alphanumeric character
                while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                    i++;
                }
                // Move right pointer to previous alphanumeric character
                while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                    j--;
                }

                // Compare characters (case insensitive)
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false; // Not a palindrome
                }

                // Move both pointers towards the center
                i++;
                j--;
            }

            return true; // It's a palindrome
        }

        public static void main(String[] args) {
            String s = "A man, a plan, a canal: Panama";
            System.out.println(isPalindrome(s)); // Output: true

            String s2 = "race a car";
            System.out.println(isPalindrome(s2)); // Output: false
        }
    }

