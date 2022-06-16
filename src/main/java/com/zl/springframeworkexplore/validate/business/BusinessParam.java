package com.zl.springframeworkexplore.validate.business;

import com.zl.springframeworkexplore.validate.InternalValidationRule;
import com.zl.springframeworkexplore.validate.ValidationException;

public class BusinessParam implements InternalValidationRule<BusinessParam> {
    public int count;
    public String name;
    public int id;

    @Override
    public void validate() throws ValidationException {
        if (name == null) {
            throw new ValidationException("name不能为空");
        }
    }
}
