package com.rcc.api.service.impl;


import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.rcc.api.dto.PrintersMapDataDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.*;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class WriteCsvToResponse {

    private static final Logger LOGGER = LoggerFactory.getLogger(WriteCsvToResponse.class);
    public static void writeRowsToCsv(PrintWriter write, List<PrintersMapDataDTO> rows)
            throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        ICsvBeanWriter writer = new CsvBeanWriter(
                write, CsvPreference.EXCEL_PREFERENCE);
        try {
            final String[] nameMapping = new String[]{"place","alternative_name_or_spellings","state_province_or_district","press_name","alternative_name_or_spelling_of_press","name_of_newspaper_journal_printed","first_book_printed","beginning_year","beginning_month","ending_year","ending_month","date_notes","proprietor_founder","manager_superintendent","editor","printer","patron","location","date_est_or_earliest_record","source","id","notes","lat","lon","startplace","endplace","photo_link","title_of_photo","photo_credit","added_by","comments","year"};
            writer.writeHeader(nameMapping);
            for (PrintersMapDataDTO p : rows) {
                writer.write(p, nameMapping);
            }
        } finally {
            writer.close();
        }
    }
    public static void writeBeans(PrintWriter writer, List<PrintersMapDataDTO> cities) {

        try {

            ColumnPositionMappingStrategy<PrintersMapDataDTO> mapStrategy= new ColumnPositionMappingStrategy<>();
            mapStrategy.setType(PrintersMapDataDTO.class);
            String[] columns = new String[]{"place","alternative_name_or_spellings","state_province_or_district","press_name","alternative_name_or_spelling_of_press","name_of_newspaper_journal_printed","first_book_printed","beginning_year","beginning_month","ending_year","ending_month","date_notes","proprietor_founder","manager_superintendent","editor","printer","patron","location","date_est_or_earliest_record","source","id","notes","lat","long","startplace","endplace","photo_link","title_of_photo","photo_credit","added_by"};
                    //"cell_letter","cell_star","cell_end","cell_count","single","range","cell_range1","cell_range2","cell_range3","group1","group2","group3"};
            mapStrategy.setColumnMapping(columns);
            StatefulBeanToCsv<PrintersMapDataDTO> btcsv = new StatefulBeanToCsvBuilder<PrintersMapDataDTO>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mapStrategy)
                    .withSeparator(',')
                    .build();

            btcsv.write(cities);

        } catch (CsvException ex) {
            LOGGER.error("Error mapping Bean to CSV", ex);
        }
    }
}
