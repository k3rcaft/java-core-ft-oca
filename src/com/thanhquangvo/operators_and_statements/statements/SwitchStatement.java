package com.thanhquangvo.operators_and_statements.statements;

public class SwitchStatement {

    public static void main(String[] args) {
        simpleSwitch();
        notBreakSwitch();
        errorConditionCaseSwitch(10);
    }

    /**
     * Switch just support for:
     * int and Int
     * byte and Byte
     * short and Short
     * char and Character
     * String
     * enum
     */
    static void simpleSwitch() {
        final int a = 10;
        switch (a) {
            case 5: // value to compare must be a constant value in compile time (final var, literal, enum)
                System.out.println(5);
                break;
            default: // if will jump this when all condition statement is not valid
                System.out.println("this is default statement");
                break;
            case 7:
                System.out.println(10);
                break;
        }
    }

    static void notBreakSwitch() {
        final int a = 5;
        switch (a) {
            // if we have not break the statement will execute all operators of all cases (from matching position and go down)
            // until the last statement or find a break;
            case 5:
                System.out.println(5);
            default:
                System.out.println("this is default statement");
            case 7:
                System.out.println(10);
                break;
        }
    }

    static void errorConditionCaseSwitch(final int finalInt) {
//        final int a = 10;
//        switch (a) {
//// not same type
//            case "a":
//                System.out.println(5);
//                break;
//// not accept value from params, despite it's final params (it's need valid in compile time)
//            case finalInt:
//                System.out.println(10);
//                break;
//        }
    }
}
