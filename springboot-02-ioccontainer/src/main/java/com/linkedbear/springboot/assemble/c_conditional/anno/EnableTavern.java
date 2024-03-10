package com.linkedbear.springboot.assemble.c_conditional.anno;

import com.linkedbear.springboot.assemble.c_conditional.component.Boss;
import com.linkedbear.springboot.assemble.c_conditional.config.BartenderConfiguration;
import com.linkedbear.springboot.assemble.c_conditional.registrar.WaiterRegistrar;
import com.linkedbear.springboot.assemble.c_conditional.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({
        Boss.class,
        BartenderConfiguration.class,
        BarImportSelector.class,
        WaiterRegistrar.class})
public @interface EnableTavern {

}
