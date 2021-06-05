package com.github.dertseha.codingdojo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    //MavenProjekt

    private static Stream<Arguments> fizzBuzzData() {
        return Stream.of(Arguments.arguments(1, "1"),
                Arguments.arguments(3, "Fizz"),
                Arguments.arguments(5, "Buzz"),
                Arguments.arguments(6, "Fizz"),
                Arguments.arguments(10, "Buzz"),
                Arguments.arguments(15, "FizzBuzz"),
                Arguments.arguments(30, "FizzBuzz"),
                Arguments.arguments(31, "31"));
    }

    @ParameterizedTest
    @MethodSource("fizzBuzzData")
    public void testIfNumberIsRightTranslated(int number, String expectedValue) {
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result, is(expectedValue));
    }

}
//Testschreiben der Rot sein muss
//Produktivcode mit kleinst nötigem aufwand schreiben der den Test Grün sein lässt
//Refactoring (kein neues Verhalten im Porduktivcode schreiben) z.B. Namen ändern für bessere Lesbarkeit, Strukturen ändern um Codeduplication aufzuheben.


//    Die Tests wurden durch den ParameterizedTest testIfNumberIsRightTranslated ersetzt
//    testIfNumberIsRightTranslated erhält die Parameter aus fizzBuzzData
//
//    @Test
//    public void testIfOneisOne() {
//        String result = fizzBuzz(1);
//        assertThat(result, is("1"));
//    }
//
//    @Test
//    public void testIfThreeisFizz() {
//        String result = fizzBuzz(3);
//        assertThat(result, is("Fizz"));
//    }
//
//    @Test
//    public void testIfFiveisBuzz() {
//        String result = fizzBuzz(5);
//        assertThat(result, is("Buzz"));
//    }
//
//    @Test
//    public void testIfFifteenisFizzBuzz() {
//        String result = fizzBuzz(15);
//        assertThat(result, is("FizzBuzz"));
//    }