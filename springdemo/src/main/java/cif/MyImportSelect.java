package cif;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: JavaDemo
 * @description:
 * @author: jonsen
 * @create: 2020-05-12 13:52
 **/
public class MyImportSelect implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[0];
    }
}
