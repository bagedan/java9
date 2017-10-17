package com.greetings.com.greetings;

public interface MyInterface {
    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    // This method is not part of the public API exposed by MyInterface
    private void init() {
        System.out.println("Initializing");
    }
}
