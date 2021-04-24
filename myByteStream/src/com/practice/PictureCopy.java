package com.practice;

import org.junit.Test;

import java.io.*;

public class PictureCopy {
    @Test
    public void test1(){
        //图片的复制,使用junit测试单元，相对路径是在模块中
        //使用字节流的子类文件的字节流进行读取和写入
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("mn.jpg");
            File desFile = new File("mn复制.jpg");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(desFile);
            int len;
            byte[] bytes = new byte[5];
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test2(){
        //使用BufferedOutputStream和BufferInputStream对非文本文件进行读取写入
        //提供了一个缓冲区8k，读取了一定的大小再一次性使用FileOutputStream写入或者读取
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("mn.jpg");
            File desFile = new File("mn2.jpg");
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(desFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes))!= -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//外层流关闭时，内层流会自动关闭，内层流就是节点流，缓冲流就是中间流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test3(){
        //这样对GBK编码的文件，会自动转换成UTF-8，编解码出错，乱码
        //使用缓冲流对文本文件进行处理
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File srcFile = new File("窗里窗外.txt");
            File desFile = new File("text1.txt");
            br = new BufferedReader(new FileReader(srcFile));//传入FileReader文件的字符流，节点流
            bw = new BufferedWriter(new FileWriter(desFile));//传入真正使用的节点流
//            int len;
//            char[] chs = new char[1024];
//            while ((len = br.read(chs))!= -1){
//                bw.write(chs,0,len);
//                bw.flush();
//            }
            String data;
            while ((data = br.readLine())!= null){
                bw.write(data);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test4(){
        //需要使用转换流，字符和字节流之间转换，用于不同文件的转码和解码
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            FileInputStream fis = new FileInputStream(new File("窗里窗外.txt"));
            FileOutputStream fos = new FileOutputStream(new File("text1.txt"));
            isr = new InputStreamReader(fis,"GBK");
            osw = new OutputStreamWriter(fos,"GBK");
            int len;
            char[] bytes = new char[1024];
            while ((len= isr.read(bytes))!=-1){
                osw.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test5() {//使用对象输出流，将对象写入文件，用于传输，序列化对象，该类需要实现Serializable接口，有一个常量serialVersionUID
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Student.dat"));
            oos.writeObject(new Student(1, "张三", 23));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Test
    public void test6() {//使用对象输入流，将文件中的对象读取
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Student.dat"));
            Student stu = (Student) ois.readObject();
            System.out.println(stu);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
