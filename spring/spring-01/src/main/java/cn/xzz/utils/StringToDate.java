package cn.xzz.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDate implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("您传入的数据为空！");
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("数据转化失败！");
        }
    }
}
