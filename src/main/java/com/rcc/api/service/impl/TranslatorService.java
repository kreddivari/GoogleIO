package com.rcc.api.service.impl;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import com.rcc.api.dto.PrintersMapDataDTO;
import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsReader;
import io.github.millij.poi.ss.reader.XlsxReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TranslatorService {

    public static List<PrintersMapDataDTO> convertcsvtoBeans() throws IOException, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, SpreadsheetReadException {
        TranslatorUtil.downloadFile("", "");
        String fileName = "data/pressdata.xlsx";
        ClassLoader classLoader = new TranslatorUtil().getClass().getClassLoader();
        final File xlsxFile=new File(classLoader.getResource(fileName).getFile());
        final XlsxReader xlsReader = new XlsxReader();
        List<PrintersMapDataDTO> employees = xlsReader.read(PrintersMapDataDTO.class, xlsxFile,0);
        return employees;
    }

}

