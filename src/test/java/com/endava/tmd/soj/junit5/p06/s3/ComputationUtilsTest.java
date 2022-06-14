package com.endava.tmd.soj.junit5.p06.s3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static com.endava.tmd.soj.junit5.p06.s3.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;

// Provocare: Rescrieti cele doua teste parametrizate din sectiunea 1 astfel incat sa existe
// cate o metoda care sa furnizeze valorile parametrilor. Dar, nu se vor mai folosi valorile
// explicite pentru valoarea minima si maxima acceptata de Java pentru tipul de date intreg,
// ci se vor folosi Integer.MIN_VALUE, respectiv Integer.MAX_VALUE
// Se va utiliza adnotarea @MethodSource.
class ComputationUtilsTest {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @MethodSource("validArguments")
    void twoNumbersSumWithValidArguments(int a, int b, int result) {
        assertThat(sum(a, b)).isEqualTo(result);
    }

    @ParameterizedTest(name = "{0} + {1} \u21D2 Overflow")
    @MethodSource("invalidArguments")
    void twoNumbersSumWithInvalidArguments(int a, int b) {
        assertThatThrownBy(() -> sum(a, b))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Overflow while computing the sum");
    }

    static List<Arguments> validArguments(){
        return List.of(
                arguments(0, 0, 0),
                arguments(1,0,1),
                arguments(-1,0,-1),
                arguments(2,2,4),
                arguments(-2,-2,-4),
                arguments(-2,12,10),
                arguments(-12,2,-10),
                arguments(Integer.MAX_VALUE, 0, Integer.MAX_VALUE),
                arguments(Integer.MAX_VALUE, -7, 2147483640),
                arguments(Integer.MIN_VALUE, 0, Integer.MIN_VALUE),
                arguments(Integer.MIN_VALUE, 8, -2147483640),
                arguments(Integer.MIN_VALUE, Integer.MAX_VALUE, -1));
    }

    static List<Arguments> invalidArguments(){
        return List.of(
                arguments(Integer.MAX_VALUE, 1),
                arguments(Integer.MIN_VALUE, -1));
    }
}
