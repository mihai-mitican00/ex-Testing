package com.endava.tmd.soj.junit5.p01;

// Provocari:
// 1. Adaugati adnotarea neecesara pentru a rula prima metoda ca si un test unitar
// 2. Rulati prima metoda ca si un test unitar
// 3. Decomentati asertiile din primul test, si efectuati importurile necesare. Rulati testul din nou.
// 4. Adaugati o linie care sa determine testul sa fie "failed". La sfarsit commentati acea linie
// 5. Completati celelalte metode astfel incat sa reprezinte scenarii de testare


import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p01.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputationUtilsTest {

    @Test
    void zeroShouldNotChangeZero() {
        // JUnit Assertion
         assertEquals(0, sum(0, 0));

        // AssertJ Assertion
         assertThat(sum(0, 0)).isZero();

         //following line fails the test
        // assertThat(sum(0 , 1)).isEqualTo(0);
    }

    @Test
    void zeroShouldNotChangePositive() {
        assertThat(sum(1, 0)).isEqualTo(1);
    }

    @Test
    void zeroShouldNotChangeNegative() {
        assertThat(sum(-1, 0)).isEqualTo(-1);
    }

    @Test
    void twoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(sum(2, 2)).isEqualTo(4);
    }

    @Test
    void twoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {

        assertThat(sum(-2, -2)).isEqualTo(-4);
    }

    @Test
    void oneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(sum(-2, 12)).isEqualTo(10);
    }

    @Test
    void oneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(sum(-12, 2)).isEqualTo(-10);
    }

}
