package com.zl.springframeworkexplore.validate;

public interface Validatable<V extends ValidationContext> {
    void validate(V validationContext) throws ValidationException;

}
