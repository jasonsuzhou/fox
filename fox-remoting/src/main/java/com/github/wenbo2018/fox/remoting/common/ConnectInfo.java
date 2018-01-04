package com.github.wenbo2018.fox.remoting.common;


/**
 * Created by shenwenbo on 2017/3/19.
 */
public class ConnectInfo {

    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ConnectInfo(String host, int port) {
        this.host = host;
        this.port = port;
    }
}
