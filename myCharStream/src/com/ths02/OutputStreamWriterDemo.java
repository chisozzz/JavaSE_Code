package com.ths02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*

 */
public class OutputStreamWriterDemo {
    public static void main(String[] args)throws IOException {
        OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));
        osw.write(97);
        osw.flush();
        char[]chs={'a','b','c','d','e'};
        osw.write(chs);
        osw.write(chs,0, chs.length);
        osw.write(chs,1,3);
        String s="hello";
        osw.write(s);
        osw.write(s,0,s.length());
        osw.write(s,1,3);

        osw.close();
    }
}
