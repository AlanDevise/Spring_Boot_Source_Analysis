package com.linkedbear.springboot.assemble.c_conditional.condition;

import com.linkedbear.springboot.assemble.c_conditional.component.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBossCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 使用BeanDefinition而不是Bean做判断是因为考虑到条件适配时Boss对象可能尚未创建，导致匹配条件出现偏差
        return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}
