package com.linkedbear.springboot.assemble.a_module.selector;

import com.linkedbear.springboot.assemble.a_module.component.Bar;
import com.linkedbear.springboot.assemble.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 声名式导入组件
 */
public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("BarImportSelector invoke ......");
        // 接口中已经指明，只能返回类的全限定名称
        return new String[]{
                Bar.class.getName(),
                BarConfiguration.class.getName()
        };
    }
}
