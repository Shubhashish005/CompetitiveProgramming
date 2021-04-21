package com.shubh.designPattern.chainOfResponsibility.authenticationExample;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

    public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("CCA")) {
            System.out.println("Handled Client Certificate Authentication ..... ");
        } else {
            super.handleRequest(requestType);
        }
    }
}
