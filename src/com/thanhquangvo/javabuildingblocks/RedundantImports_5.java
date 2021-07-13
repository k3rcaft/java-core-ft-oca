package com.thanhquangvo.javabuildingblocks;
// don't need import java lang package
import java.lang.System;
// don't need import java lang package
import java.lang.*;

import java.util.Random;
// you just need import line 7 to use Random class
import java.util.*;
// not good, shouldn't import the package
import java.nio.*;

// import java.nio.*.*; wildcard just active when it must be at the end;

// cannot import methods in the class
import java.nio.file.Paths.*;

//don't need import class same package
public class RedundantImports_5 {

    public static void main(String[] args) {
        Random random = new Random();
    }
}
