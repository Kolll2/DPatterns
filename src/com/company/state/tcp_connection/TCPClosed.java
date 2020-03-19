package com.company.state.tcp_connection;

// ConcreteState -->

public class TCPClosed implements TCPState {
    private TCPConnection tcpConnection;

    TCPClosed(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        getSimpleName();
        tcpConnection.setState(tcpConnection.getTspListen());
        System.out.println(" ==> Connection is open");
    }

    @Override
    public void close() {
        getSimpleName();
        System.out.println(" ==> Connection is closed");
    }

    @Override
    public void acknowledge() {

    }
}
