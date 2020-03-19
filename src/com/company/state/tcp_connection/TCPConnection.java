package com.company.state.tcp_connection;


//  Context -->


public class TCPConnection {
    private TCPState state;

    private TCPState tcpEstablished;
    private TCPState tcpListen;
    private TCPState tcpClosed;


    TCPConnection() {
        tcpEstablished = new TCPEstablished(this);
        tcpListen = new TCPListen(this);
        tcpClosed = new TCPClosed(this);

        setState(getTspEstablished());
    }

    public TCPState getState() {
        return state;
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public TCPState getTspEstablished() {
        return tcpEstablished;
    }

    public TCPState getTspListen() {
        return tcpListen;
    }

    public TCPState getTspClosed() {
        return tcpClosed;
    }

    void open() {
        state.open();
    }

    void close() {
        state.close();
    }

    void acknowledge() {
        state.acknowledge();
    }
}
