package com.thanhquangvo.java_building_blocks.referencees_vs_primitives_8;

    // primitive types that hold their values in the memory
public class PrimitiveTypes {
    // true false
    boolean booleanType;
    // 8-bit integral value
    byte byteType;
    // 16-bit
    short shortType;
    // 32-bit
    int intType;
    // 64-bit
    long longType;
    // 32-bit floating-point value
    float floatType;
    // 64-bit
    double doubleType;
    // 16-bit Unicode value
    char charType;

    // literal is number is present in the code. Ex: int a = 10 => 10 is literal
    // default of number in Java is int.
    // when set a max number than int scope by long, you need use "L" mark
    // recommend use L replace l because l look like 1
    long longCase = 3123456789L;

    //some format Java support for number type
    //octal format by 0 first
    int octalInt = 04444;

    //hexadecimal format by 0x first
    int hexadecimalInt = 0x4444;

    //binary format by 0x first
    int binaryInt = 0b01010101;

    //Java permit use underscore the declare explicit number;
    int otherFormatInt = 100_00_00;
    double otherFormatDouble = 100_0.0_00;

    //error format
//    double otherFormatDouble1 = 100_.00_00;
//    double otherFormatDouble2 = 100_00_00_;
}
