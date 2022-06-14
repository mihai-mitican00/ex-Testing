package com.endava.tmd.soj.junit5.p03.s2;

// Provocare: Copiati metodele de test din tema anterioara (p02), si adaugati adnotarile necesare astfel incat
// sa fie rulate testele in functie de adnotarea de ordine specificata pe fiecare metoda de test. Adnotarea de ordine
// trebuie sa fie pusa pe fiecare metoda de test astfel incat metodele sa fie executate in ordinea in care sunt scrise

import org.junit.jupiter.api.*;

import static com.endava.tmd.soj.junit5.p03.s2.ComputationUtils.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Tests for my sum method")
public class ComputationUtilsTest {


    @Test
    @Order(1)
    @DisplayName("0 + 0 = 0")
    void ZeroShouldNotChangeZero() {
        assertThat(sum(0, 0)).isZero();
    }

    @Test
    @Order(2)
    @DisplayName("1 + 0 = 1")
    void ZeroShouldNotChangePositive() {
        assertThat(sum(1, 0)).isEqualTo(1);
    }

    @Test
    @Order(3)
    @DisplayName("-1 + 0 = -1")
    void ZeroShouldNotChangeNegative() {
        assertThat(sum(-1, 0)).isEqualTo(-1);
    }

    @Test
    @Order(4)
    @DisplayName("2 + 2 = 4")
    void TwoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(sum(2, 2)).isEqualTo(4);
    }

    @Test
    @Order(5)
    @DisplayName("-2 + -2 = -4")
    void TwoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {
        assertThat(sum(-2, -2)).isEqualTo(-4);
    }

    @Test
    @Order(6)
    @DisplayName("-2 + 12 = 10")
    void OneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(sum(-2, 12)).isEqualTo(10);
    }

    @Test
    @Order(7)
    @DisplayName("-12 + 2 = -10")
    void OneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(sum(-12, 2)).isEqualTo(-10);
    }

}
