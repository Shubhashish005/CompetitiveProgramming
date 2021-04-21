package com.shubh.designPattern.chainOfResponsibility.example1;

public class ClientRequest {

    public static void main(String[] args) {

        DocumentHandler documentHandler = new SpreadSheetHandler(new SlideshowDocumentHandler(new TextDocumentHandler(null)));

        documentHandler.openDocument("txt");

        documentHandler.openDocument("xlss");
    }
}
