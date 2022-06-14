package com.endava.tmd.soj.junit5.p04;

// Provocare: Copiati metodele de test din tema de la p02, si adaugati ceea ce lipseste astfel incat
// sa fie testate si scenariile urmatoare. La ultima metoda, in cazul in care testul nu trece,
// adaugati adnotarea necesara astfel incat sa apara ca si "skipped"

import org.junit.jupiter.api.*;

import static com.endava.tmd.soj.junit5.p04.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Tests for my sum method")
class ComputationUtilsTest {


    @Test
    @DisplayName("0 + 0 = 0")
    void zeroShouldNotChangeZero() {
        assertThat(sum(0, 0)).isZero();
    }

    @Test
    @DisplayName("1 + 0 = 1")
    void zeroShouldNotChangePositive() {
        assertThat(sum(1, 0)).isEqualTo(1);
    }

    @Test
    @DisplayName("-1 + 0 = -1")
    void zeroShouldNotChangeNegative() {
        assertThat(sum(-1, 0)).isEqualTo(-1);
    }

    @Test
    @DisplayName("2 + 2 = 4")
    void twoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(sum(2, 2)).isEqualTo(4);
    }

    @Test
    @DisplayName("-2 + -2 = -4")
    void twoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {
        assertThat(sum(-2, -2)).isEqualTo(-4);
    }

    @Test
    @DisplayName("-2 + 12 = 10")
    void oneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(sum(-2, 12)).isEqualTo(10);
    }

    @Test
    @DisplayName("-12 + 2 = -10")
    void oneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(sum(-12, 2)).isEqualTo(-10);
    }

    @Test
    @DisplayName("2147483647 + 0 = 2147483647")
    void zeroShouldNotChangeMaxInt() {
        assertThat(sum(Integer.MAX_VALUE, 0)).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    @DisplayName("2147483647 + -7 = 2147483640")
    void maxIntAndANegativeNumber() {
        assertThat(sum(Integer.MAX_VALUE, -7)).isEqualTo(2147483640);
    }

    @Test
    @DisplayName("-2147483648 + 0 = -2147483648")
    void zeroShouldNotChangeMinInt() {
        assertThat(sum(Integer.MIN_VALUE, 0)).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    @DisplayName("-2147483648 + 8 = -2147483640")
    void minIntAndAPositiveNumber() {
        assertThat(sum(Integer.MIN_VALUE, 8)).isEqualTo(-2147483640);
    }

    @Test
    @DisplayName("-2147483648 + 2147483647 = -1")
    void minIntAndMaxInt() {
        assertThat(sum(Integer.MIN_VALUE, Integer.MAX_VALUE)).isEqualTo(-1);
    }



    @Test
    @DisplayName("2147483647 + 10 = 2147483657")
    @Disabled("skipped")
    void whatToDoWhenSumExceedsMaxIntegerValue() {
        assertThat(sum(Integer.MAX_VALUE, 10)).isEqualTo(2147483657l);
    }


}
