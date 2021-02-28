package com.franktran;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
    printer.printRecord("Frank", "Member", 28);
    printer.printRecord("Henry", "BO", 34);
    printer.printRecord("Bean", "API", 34);
  }
}
