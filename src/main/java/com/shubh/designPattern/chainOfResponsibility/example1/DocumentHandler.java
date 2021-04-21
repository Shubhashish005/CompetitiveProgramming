package com.shubh.designPattern.chainOfResponsibility.example1;

public abstract class DocumentHandler {

    DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void openDocument(String filenameExtension) {
        if (next != null) {
            next.openDocument(filenameExtension);
        }
    }
}
