package StructuralPatterns.Proxy;

public class RobotBombDefuserProxy extends RobotBombDefuser {

    private RobotBombDefuser robotBombDefuser;
    private int communicationWaveLength;
    private int connectionAttempts = 3;
    private boolean lostConnection = false;

    public RobotBombDefuserProxy(int communicationWaveLength) {
        robotBombDefuser = new RobotBombDefuser();
        communicationWaveLength = communicationWaveLength;
    }

    public void walkStraightForward(int steps) {
        ensureConnectedWithRobot();
        if (!lostConnection) {
            robotBombDefuser.walkStraightForward(steps);
        }
    }

    public void turnRight() {
        ensureConnectedWithRobot();
        if (!lostConnection) {
            robotBombDefuser.turnRight();
        }
    }

    public void turnLeft() {
        ensureConnectedWithRobot();
        if (!lostConnection) {
            robotBombDefuser.turnLeft();
        }
    }

    public void defuseBomb() {
        ensureConnectedWithRobot();
        if (!lostConnection) {
            robotBombDefuser.defuseBomb();
        }
    }

    /**
     * Hаш проксі просто передає запити до справжнього об’єкту і
     * завжди перед цим перевіряє чи з’єднання не пропало, і, якщо пропало, то
     * пробує тричі його відновити. Якщо і після цього не виходить, то виводимо помилку.
     */
    private void ensureConnectedWithRobot() {
        lostConnection = false;
        if (robotBombDefuser == null) {
            robotBombDefuser = new RobotBombDefuser();
            robotBombDefuser.connectWireless(communicationWaveLength);
        }

        for (int i = 0; i < connectionAttempts; i++) {
            if (!robotBombDefuser.isConnected()) {
                robotBombDefuser.connectWireless(communicationWaveLength);
            } else {
                break;
            }
        }
        if(!robotBombDefuser.isConnected()) {
            lostConnection = true;
            System.out.println("No connection with remote bomb" +
                    "diffuser robot could be made after few attempts.");
        }
    }

    public boolean isLostConnection() {
        return lostConnection;
    }
}
