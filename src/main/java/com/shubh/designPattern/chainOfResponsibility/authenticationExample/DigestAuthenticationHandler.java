package com.shubh.designPattern.chainOfResponsibility.authenticationExample;

public class DigestAuthenticationHandler extends AuthenticationHandler {
    public DigestAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("DIGEST")) {
            System.out.println("Handled Digest Authentication ..... ");
        } else {
            super.handleRequest(requestType);
        }
    }
}
