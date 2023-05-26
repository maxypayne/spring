package com.maxim.api.utils.adapters.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatXmlAdapter {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

//    @Override
    public Date unmarshal(String v) throws Exception {
        return sdf.parse(v);
    }

//    @Override
    public String marshal(Date v) throws Exception {
        return sdf.format(v);
    }
}
