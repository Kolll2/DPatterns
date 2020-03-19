package com.company.state.tcp_connection;

// ConcreteState -->

public class TCPListen implements TCPState {
    private TCPConnection tcpConnection;

    TCPListen(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        getSimpleName();
    }

    @Override
    public void close() {
        getSimpleName();
        tcpConnection.setState(tcpConnection.getTspClosed());
    }

    @Override
    public void acknowledge() {
        getSimpleName();

    }
}
