package com.googlecode.jthaipdf.common;

import net.sf.jasperreports.pdf.common.PdfProducer;
import net.sf.jasperreports.pdf.common.PdfProducerContext;
import net.sf.jasperreports.pdf.common.PdfProducerFactory;

public class ThaiPdfProducerFactory implements PdfProducerFactory {

    @Override
    public PdfProducer createProducer(PdfProducerContext context) {
        return new ThaiPdfProducer(context);
    }
}
