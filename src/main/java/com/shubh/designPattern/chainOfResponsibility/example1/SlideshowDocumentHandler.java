package com.shubh.designPattern.chainOfResponsibility.example1;

public class SlideshowDocumentHandler extends DocumentHandler {

    public SlideshowDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String filenameExtension) {
        if (filenameExtension.equals("ppt")) {
            System.out.println("Opening ppt file > " + filenameExtension);
        } else {
            super.openDocument(filenameExtension);
        }
    }
}
