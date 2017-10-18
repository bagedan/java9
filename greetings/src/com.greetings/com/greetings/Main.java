package com.greetings;
import com.other.TestAccess;
import org.astro.World;
import com.other.module.Other;

public class Main {
    public static void main(String[] args) {
        Other.doStuff();
        TestAccess.main();
        System.out.format("Greetings %s!%n", World.name());
    }
}
