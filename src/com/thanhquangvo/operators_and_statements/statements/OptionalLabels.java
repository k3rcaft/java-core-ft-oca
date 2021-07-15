package com.thanhquangvo.operators_and_statements.statements;

/**            label       break      continue
 * if          *(if then)    X          X
 * while       *             *          *
 * do while    *             *          *
 * for         *             *          *
 * switch      *             *          X
 */
public class OptionalLabels {

    //label just support for if else, switch, loops
    public static void main(String[] args) {
        labelIf();
        labelFor();
    }

    static void labelIf() {
        int a = 7;
        ELSE:
        if (a < 6) {
            System.out.println("statement 1");
        } else if (a > 7) {
            System.out.println("statement 2");
        } else {
            System.out.println("statement 3");
        }
    }

    static void labelFor() {
        LABEL:
        for (int i = 5; i < 10; i++) {
            LABEL2:
            for (int y = 5; y < 10; y++) {
                if (i == 7) {
                    continue LABEL;
                }
                System.out.println("label for");
            }
        }
    }
}
