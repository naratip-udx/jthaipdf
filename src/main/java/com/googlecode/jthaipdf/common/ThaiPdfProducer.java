package com.googlecode.jthaipdf.common;

import com.googlecode.jthaipdf.itext.ThaiChunk;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Locale;
import java.util.Map;
import net.sf.jasperreports.pdf.classic.ClassicPdfProducer;
import net.sf.jasperreports.pdf.classic.ClassicTextChunk;
import net.sf.jasperreports.pdf.common.PdfProducerContext;
import net.sf.jasperreports.pdf.common.PdfTextChunk;

public class ThaiPdfProducer extends ClassicPdfProducer {

    public ThaiPdfProducer(PdfProducerContext context) {
        super(context);
    }

    @Override
    public PdfTextChunk createChunk(String text, Map<Attribute, Object> attributes, Locale locale) {
        var font = getFont(attributes, locale);
        var chunk = new ThaiChunk(text, font);
        return new ClassicTextChunk(this, chunk, font);
    }
}
