package com.mj.proxy;

import com.mj.service.SkillService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillServiceProxy extends SkillService {
    private SkillService target;

    public void setTarget(SkillService target) {
        this.target = target;
    }

    @Override
    public boolean save(Object skill) {
        System.out.println("SkillServiceProxy - 1");
        boolean result = target.save(skill);
        System.out.println("SkillServiceProxy - 2");
        return result;
    }
}
