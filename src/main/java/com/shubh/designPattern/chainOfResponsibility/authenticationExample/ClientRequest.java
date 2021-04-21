package com.shubh.designPattern.chainOfResponsibility.authenticationExample;

public class ClientRequest {

    public static void main(String[] args) {
        AuthenticationHandler authenticationHandler = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));
        authenticationHandler.handleRequest("BASIC");
    }
}
