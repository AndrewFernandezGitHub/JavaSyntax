package com.syntax.JavaClass23;

public class Car {
    void start() {
        System.out.println("use keys to start me");
    }

    void stop() {
        System.out.println("Use breaks to stop me");
    }

    void park() {
        System.out.println("Park me manually");
    }
}

    class BMW extends Car {
    void start() {
        System.out.println("Start me with button");
    }

    void stop() {
        System.out.println("Can use breaks or I can auto break");
    }

    void park() {
        System.out.println("use parking sensors to park me");
    }
}
    class Tesla extends Car {
        void start() {
            System.out.println("Start me with button");
        }

        void stop() {
            System.out.println("Can use breaks or I can auto break");
        }

        void park() {
            System.out.println("use parking sensors to park me");
        }

    }

    class Toyota extends Car {
        void start() {
            System.out.println("Start me with button");
        }

        void stop() {
            System.out.println("Can use breaks or I can auto break");
        }

        void park() {
            System.out.println("use parking sensors to park me");
        }

    }

    class Suzuki extends Car {
        void start() {
            System.out.println("Start me with button");
        }

        void stop() {
            System.out.println("Can use breaks or I can auto break");
        }

        void park() {
            System.out.println("use parking sensors to park me");
        }
    }

