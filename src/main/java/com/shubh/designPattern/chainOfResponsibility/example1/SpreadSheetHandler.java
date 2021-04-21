package com.shubh.designPattern.chainOfResponsibility.example1;

public class SpreadSheetHandler extends DocumentHandler {

    public SpreadSheetHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String filenameExtension) {
        if (filenameExtension.equals("xlss")) {
            System.out.println("Opening xlss file > " + filenameExtension);
        } else {
            super.openDocument(filenameExtension);
        }
    }
}
