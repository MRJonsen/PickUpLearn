package com.zip;

import java.io.IOException;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/7/9
 * @Version 1.0
 */
public interface FileHandler {
   String readFile(String path) throws IOException;
}
