package com.example.textcountersample;

import com.example.textcountersample.Utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsClassUnitTest {
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_removeExcessiveSpacesFromStringIsCalled_Then_NullPointerExceptionIsThrown(){
        Utils.removeExcessiveSpacesFromString(null);
    }

    @Test
    public void Given_EmptyString_When_removeExcessiveSpacesFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_removeExcessiveSpacesFromStringIsCalled_Then_EmptyStringIsReturned(){
        final String givenString = "   ";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_removeExcessiveSpacesFromStringIsCalled_Then_StringWithoutExcessiveSpacesIsReturned(){
        final String givenString = "Hello   world yey!  ";

        final String expectedResult = "Hello world yey!";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    //Added testing
    @Test
    public void Given_String_then_setStringFirstCapital(){
        final String givenString = "hello and good Bye!";

        final String expectedResult = "Hello and good Bye!";
        final String actualResult = Utils.setStringFirstCapital(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Added testing
    @Test
    public void Given_String_checkIfOnlySpecialCharacters_if_yes_return_True(){
        final String givenString = "#@$@#aa";

        final String expectedResult = "True";
        final String actualResult = Utils.checkIfOnlySpecialCharacters(givenString);

        assertEquals(expectedResult, actualResult);
    }
}
