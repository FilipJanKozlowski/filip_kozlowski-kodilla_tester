package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class BmiSources {

    public static Stream<Arguments> provideDataForBmiTesting() {
        return Stream.of(
                Arguments.of(1.80, 40.0, "Very severely underweight"),
                Arguments.of(1.70, 45.0, "Severely underweight"),
                Arguments.of(1.70, 50.0, "Underweight"),
                Arguments.of(1.80, 70.0, "Normal (healthy weight)"),
                Arguments.of(1.80, 85.0, "Overweight"),
                Arguments.of(1.80, 100.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.80, 120.0, "Obese Class II (Severely obese)"),
                Arguments.of(1.80, 140.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 160.0, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.80, 180.0, "Obese Class V (Super Obese)"),
                Arguments.of(1.80, 200.0, "Obese Class VI (Hyper Obese)")
        );
    }
}