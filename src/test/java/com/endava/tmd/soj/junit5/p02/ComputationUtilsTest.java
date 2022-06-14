package com.endava.tmd.soj.junit5.p02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p02.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// Provocare: Copiati metodele de test din tema anterioara, si adaugati adnotarile necesare astfel incat:
// 1. Sa fie afisat "Tests for my sum method" in loc de "ComputationUtilsTest"
// 2. La fiecare test sa fie afisata suma. De exemplu "zeroShouldNotChangeZero" ar trebui sa fie inlocuit cu "0 + 0 = 0"


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

}
