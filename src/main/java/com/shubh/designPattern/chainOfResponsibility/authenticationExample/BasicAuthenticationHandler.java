package com.shubh.designPattern.chainOfResponsibility.authenticationExample;

public class BasicAuthenticationHandler extends AuthenticationHandler {
    public BasicAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("BASIC")) {
            System.out.println("Handled Basic Authentication ..... ");
        } else {
            super.handleRequest(requestType);
        }
    }
}
