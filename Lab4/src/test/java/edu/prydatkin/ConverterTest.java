package edu.prydatkin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
    @author lilbl
    @project Lab4
    @class ConverterTest
    @version 1.0.0
    @since 4/10/2025 - 13.22
*/


class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRoman_IV_ThenArabic_4() {
        Assertions.assertEquals(4, Converter.convertRomanToInt("IV"));
    }

    @Test
    void whenRoman_VI_ThenArabic_8() {
        Assertions.assertEquals(8, Converter.convertRomanToInt("VIII"));
    }

    @Test
    void whenRoman_XIV_ThenArabic_14() {
        Assertions.assertEquals(14, Converter.convertRomanToInt("XIV"));
    }

    @Test
    void whenRoman_XXVI_ThenArabic_29() {
        Assertions.assertEquals(29, Converter.convertRomanToInt("XXIX"));
    }

    @Test
    void whenRoman_XL_ThenArabic_40() {
        Assertions.assertEquals(40, Converter.convertRomanToInt("XL"));
    }

    @Test
    void whenRoman_XC_ThenArabic_90() {
        Assertions.assertEquals(90, Converter.convertRomanToInt("XC"));
    }

    @Test
    void whenRoman_XCVI_ThenArabic_96() {
        Assertions.assertEquals(96, Converter.convertRomanToInt("XCVI"));
    }

    @Test
    void whenRoman_CCLVI_ThenArabic_256() {
        Assertions.assertEquals(256, Converter.convertRomanToInt("CCLVI"));
    }

    @Test
    void whenRoman_DCXL_ThenArabic_640() {
        Assertions.assertEquals(640, Converter.convertRomanToInt("DCXL"));
    }

    @Test
    void whenRoman_CM_ThenArabic_900() {
        Assertions.assertEquals(900, Converter.convertRomanToInt("CM"));
    }

}