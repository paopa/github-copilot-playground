package github.copilot.playground.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestWhiteboardServiceTest
{
    @Test
    void isPalindrome()
    {
        WhiteboardService service = new WhiteboardService();
        assertTrue(service.isPalindrome("racecar"));
        assertFalse(service.isPalindrome("hello"));
    }
}