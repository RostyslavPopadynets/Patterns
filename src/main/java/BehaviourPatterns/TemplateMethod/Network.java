package BehaviourPatterns.TemplateMethod;

/**
 * Base class of social network.
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            sendData(message.getBytes());
            logOut();
            return true;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract void sendData(byte[] data);
    abstract void logOut();
}
