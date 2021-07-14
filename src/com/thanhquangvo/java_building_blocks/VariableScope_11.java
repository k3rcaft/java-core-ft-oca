package com.thanhquangvo.java_building_blocks;

public class VariableScope_11 {
    /*
         Local variables—in scope from declaration to end of block
         Instance variables—in scope from declaration until object garbage collected
         Class variables—in scope from declaration until program ends
     */

    static int classVar = 10;

    int instanceVar = 12;

    void blockCode() {
        int localVar = 11;
    }
}
