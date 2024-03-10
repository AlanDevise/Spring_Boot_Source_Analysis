package com.linkedbear.springboot.assemble.a_module.anno;

import com.linkedbear.springboot.assemble.a_module.component.Boss;
import com.linkedbear.springboot.assemble.a_module.config.BartenderConfiguration;
import com.linkedbear.springboot.assemble.a_module.registrar.WaiterRegistrar;
import com.linkedbear.springboot.assemble.a_module.selector.BarImportSelector;
import com.linkedbear.springboot.assemble.a_module.selector.WaiterDeferredImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <h2>JavaBean的生成顺序是</h2>
 * <p>ImportSelector -> DeferredImportSelector -> ImportBeanDefinitionRegistrar<p/>
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class,// 最普通的类注入
        BartenderConfiguration.class,   // 一次行注入多个JavaBean
        BarImportSelector.class,        // 声名式导入多个JavaBean，方法中返回类的全限定名称
        WaiterDeferredImportSelector.class, // 声名式导入JavaBean，方法中返回类的全限定名称
        WaiterRegistrar.class})          // 编程式导入1个JavaBean对象
public @interface EnableTavern {

}
