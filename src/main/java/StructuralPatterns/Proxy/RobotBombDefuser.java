package StructuralPatterns.Proxy;

import java.util.Random;

public class RobotBombDefuser {

    private Random random = new Random();
    private int robotConfiguredWavelength = 41;
    private boolean isConnected = false;

    void connectWireless(int communicationWaveLength) {
        if(communicationWaveLength == robotConfiguredWavelength) {
            isConnected = isConnectedImitatingConnectivityIssues();
        }
    }

    public boolean isConnected() {
        isConnected = isConnectedImitatingConnectivityIssues();
        return isConnected;
    }

    private boolean isConnectedImitatingConnectivityIssues()
    {
        // Імітуємо погане з’єднання (працює в 4 із 10 спробах)
        return random.nextInt(10) < 4;
    }

    public void walkStraightForward(int steps) {
        System.out.println("Did " + steps + " steps forward...");
    }

    public void turnRight() {
        System.out.println("Turned right...");
    }

    public void turnLeft() {
        System.out.println("Turned left...");
    }

    public void defuseBomb() {
        System.out.println("Cut red or green or blue wire...");
    }


}
