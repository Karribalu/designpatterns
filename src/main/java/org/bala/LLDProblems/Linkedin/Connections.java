package org.bala.LLDProblems.Linkedin;

public class Connections {
    private final String source;
    private final String dest;
    private ConnectionStatus connectionStatus;

    public Connections(String source, String dest) {
        this.source = source;
        this.dest = dest;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
}
