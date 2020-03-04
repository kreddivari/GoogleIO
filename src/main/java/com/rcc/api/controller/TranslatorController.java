package com.rcc.api.controller;


import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.rcc.api.dto.PrintersMapDataDTO;
import com.rcc.api.service.impl.TranslatorService;
import com.rcc.api.service.impl.WriteCsvToResponse;
import io.github.millij.poi.SpreadsheetReadException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController
@RequestMapping("/printers")
public class TranslatorController {

    private static final Logger log = LoggerFactory.getLogger(TranslatorController.class);
    @RequestMapping(value = "/data", produces = "text/csv")
    public void getPrintData(HttpServletResponse response) throws IOException, InvalidFormatException, SpreadsheetReadException {
        PrintWriter writer=response.getWriter();
        response.setHeader("Content-Type", "text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "printers_data.csv" + "\"");
        List<PrintersMapDataDTO> printData= TranslatorService.convertcsvtoBeans();
        try {
            WriteCsvToResponse.writeRowsToCsv(writer, printData);
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }
    }
}
