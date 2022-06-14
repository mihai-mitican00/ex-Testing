package com.endava.tmd.soj.junit5.p03.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.endava.tmd.soj.junit5.p03.s1.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// Provocare: Copiati metodele de test din tema anterioara, si adaugati adnotarile necesare astfel incat
// sa fie rulate testele in ordine alfabetica. Modificati numele metodelor de test astfel incat metodele
// sa fie executate in ordinea in care sunt scrise

@DisplayName("Tests for my sum method")
@TestMethodOrder(MethodOrderer.MethodName.class)
public class ComputationUtilsTest {


    @Test
    @DisplayName("0 + 0 = 0")
    void aZeroShouldNotChangeZero() {
        assertThat(sum(0, 0)).isZero();
    }

    @Test
    @DisplayName("1 + 0 = 1")
    void bZeroShouldNotChangePositive() {
        assertThat(sum(1, 0)).isEqualTo(1);
    }

    @Test
    @DisplayName("-1 + 0 = -1")
    void cZeroShouldNotChangeNegative() {
        assertThat(sum(-1, 0)).isEqualTo(-1);
    }

    @Test
    @DisplayName("2 + 2 = 4")
    void dTwoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(sum(2, 2)).isEqualTo(4);
    }

    @Test
    @DisplayName("-2 + -2 = -4")
    void eTwoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {
        assertThat(sum(-2, -2)).isEqualTo(-4);
    }

    @Test
    @DisplayName("-2 + 12 = 10")
    void fOneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(sum(-2, 12)).isEqualTo(10);
    }

    @Test
    @DisplayName("-12 + 2 = -10")
    void gOneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(sum(-12, 2)).isEqualTo(-10);
    }



}
