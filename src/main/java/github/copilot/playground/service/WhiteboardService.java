package github.copilot.playground.service;

public class WhiteboardService
{
    // is palindrome?
    public boolean isPalindrome(String word)
    {
        int left = 0;
        int right = word.length() - 1;
        while (left < right)
        {
            if (word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // method will remove any given substring from a string
    public String removeSubstring(String word, String substring)
    {
        return word.replace(substring, "");
    }

    // count the number of times a substring occurs in a string
    public int countSubstring(String word, String substring)
    {
        int count = 0;
        int index = 0;
        while (index != -1)
        {
            index = word.indexOf(substring, index);
            if (index != -1)
            {
                count++;
                index += substring.length();
            }
        }
        return count;
    }
}
