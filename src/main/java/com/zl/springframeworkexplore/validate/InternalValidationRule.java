package com.zl.springframeworkexplore.validate;

public interface InternalValidationRule<V extends InternalValidationRule> extends ValidationContext,ValidationRule<V>{
    void validate();
    @Override
    default void validate(V validationContext) throws ValidationException{
        validationContext.validate();
    }


}
