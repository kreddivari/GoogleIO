package com.rcc.api.service.impl;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;

/**
 * A utility that downloads a file from a URL.
 * @author www.codejava.net
 *
 */
public class TranslatorUtil {
    private static final int BUFFER_SIZE = 4096;

    /**
     * Downloads a file from a URL
     *
     * @param URL HTTP URL of the file to be downloaded
     * @param saveDir path of the directory to save the file
     * @throws IOException
     */
    public static void downloadFile(String URL, String saveDir)throws IOException {
        String fileURL = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTBd7loP4AEAJQRkfmbTUKk-Rx5jktb2dm8cCEKudlICIMyht56jUjcg9NaLT2B3Ej5rp5jYuHOeueh/pub?output=xlsx";
        URL website = new URL(fileURL);

        String fileName = "data/pressdata.xlsx";
        ClassLoader classLoader = new TranslatorUtil().getClass().getClassLoader();

        File file = new File(classLoader.getResource(fileName).getFile());

        try (
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(file);
        ) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }

    public static String prepareGroup(Map data) throws Exception {
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        VelocityContext context = new VelocityContext();
        context.put("data", data);

        /*
         *   get the Template
         */

        Template t = ve.getTemplate( "./templates/group.vm" );

        /*
         *  now render the template into a Writer, here
         *  a StringWriter
         */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );
        return writer.toString();
    }
}