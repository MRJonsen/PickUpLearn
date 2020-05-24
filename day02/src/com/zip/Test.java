package com.zip;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/7/8
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        List<String> items = new ArrayList<>();
//        items.add("/Users/chenbin/百度云盘/35.会员版(2.0)-就业课(2.0)-Maven高级/60.maven高级.zip");
//        items.add("/Users/chenbin/Desktop/tomcat-native.tar.gz");
//        for (int i = 0; i < items.size(); i++) {
//            String item = items.get(i);
//            String charSequence = item.subSequence(item.lastIndexOf(".") + 1, item.length()).toString();
//            ThreadPoolUtils.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        FileHandler aClass = null;
//                        if (charSequence.equalsIgnoreCase("zip")) {
//                            aClass = (FileHandler) Class.forName("com.zip.ZipImpl").newInstance();
//                        }else if(charSequence.equalsIgnoreCase("gz")){
//                            aClass = (FileHandler) Class.forName("com.zip.GzipImpl").newInstance();
//                        }
//
//                        if (aClass != null) {
//                            String files = aClass.readFile(item);
//                            File file = new File(charSequence);
//                            FileWriter fileWriter = new FileWriter(file+".txt");
//                            fileWriter.write(files);
//                            fileWriter.flush();
//                            fileWriter.close();
//                        }
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//        }
        List<String> strings = traverseFolder("/Users/chenbin/百度云盘/35.会员版(2.0)-就业课(2.0)-Maven高级");
        System.out.println(strings);
    }

    public static List<String> traverseFolder(String path) {
        List<String> zips = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        if (file2.getAbsolutePath().endsWith("zip")){ //添加zip文件
                            zips.add(file2.getAbsolutePath());
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        return zips;
    }
}
