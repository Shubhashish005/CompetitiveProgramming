package com.shubh.designPattern.chainOfResponsibility.example1;

public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String filenameExtension) {
        if (filenameExtension.equals("txt")) {
            System.out.println("Opening txt file > " + filenameExtension);
        } else {
            super.openDocument(filenameExtension);
        }
    }
}
