package com.thanhquangvo.methods_and_encapsulation.access_modifier;

import com.thanhquangvo.methods_and_encapsulation.access_modifier.a.PrivateAM;
import com.thanhquangvo.methods_and_encapsulation.access_modifier.a.PublicAM;
import com.thanhquangvo.methods_and_encapsulation.access_modifier.b.DefaultAM;
import com.thanhquangvo.methods_and_encapsulation.access_modifier.b.ProtectedAM;

/**
 * public protected + all classes in other packages
 * protected default access + chill classes
 * default private + other classes in the same package
 * private only accessible within the same class
 */
public class AccessModifierCaller extends ProtectedAM {

    public static void main(String[] args) {
        AccessModifierCaller accessModifierCaller = new AccessModifierCaller();
        accessModifierCaller.modifierCall();
    }

    void modifierCall() {
        PublicAM publicAM = new PublicAM();
        publicAM.publicMethod();

        protectedMethod();

        DefaultAM defaultAM = new DefaultAM();
        // cannot call method because they are not same package

        PrivateAM privateAM = new PrivateAM();
        // cannot call method because private
    }
}
