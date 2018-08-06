package com;

/**
 * Created by ly_dapanglian on 2018/8/6.
 */
public class Business {

    public String asciiToString(String value){
        StringBuffer sbu = new StringBuffer();
        String[] hexs = value.split(" ");
        for (int i = 0; i < hexs.length; i++) {
            int dec = Integer.parseInt(hexs[i],16);
            sbu.append((char) dec);
        }
        return sbu.toString();
    }
}
