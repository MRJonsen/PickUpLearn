package com.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/7/8
 * @Version 1.0
 */
public class ZipImpl implements FileHandler {

    @Override
    public String readFile(String path) throws IOException {
        ZipEntry zipEntry = null;
        HashSet<String> hashSet = new HashSet<>();
        File file = new File(path);
        if (file.exists()) { //判断文件是否存在
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file), Charset.forName("GBK")); //解决包内文件存在中文时的中文乱码问题
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                if (!zipEntry.isDirectory()) { //遇到文件夹就跳过
                    hashSet.add(zipEntry.getName());
                }

            }
            zipInputStream.close();
        }
        return hashSet.toString();

    }
}
