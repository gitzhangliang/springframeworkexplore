package com.zl.springframeworkexplore.validate.business;

import com.zl.springframeworkexplore.validate.ValidationException;
import com.zl.springframeworkexplore.validate.ValidationRule;

public class BusinessDbRule implements ValidationRule<BusinessParam> {
    private final int countDb;
    public BusinessDbRule(int count){
        this.countDb = count;
    }
    @Override
    public void validate(BusinessParam validationContext)  {
        if(countDb<validationContext.count){
            throw new ValidationException("数量不足");
        }
    }
}
