package com.company.state.tcp_connection;

// ConcreteState -->

public class TCPEstablished implements TCPState {
    private TCPConnection tcpConnection;

    TCPEstablished(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        getSimpleName();
        System.out.println(" ==> Connection is open");
        tcpConnection.setState(tcpConnection.getTspListen());
    }

    @Override
    public void close() {
        getSimpleName();
        System.out.println(" ==> OK: Connection is closed");
        tcpConnection.setState(tcpConnection.getTspClosed());
    }

    @Override
    public void acknowledge() {

    }


}
