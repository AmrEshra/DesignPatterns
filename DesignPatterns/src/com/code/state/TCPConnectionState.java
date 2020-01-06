package com.code.state;

public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;


}
