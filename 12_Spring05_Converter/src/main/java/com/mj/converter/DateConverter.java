package com.mj.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class DateConverter implements Converter<String, Date> {
    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public Date convert(String s) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat(format);
            return fmt.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
