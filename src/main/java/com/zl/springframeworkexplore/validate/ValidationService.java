package com.zl.springframeworkexplore.validate;

public interface ValidationService<V extends ValidationContext> extends Validatable<V> {
    @Override
    default void validate(V validationContext) throws ValidationException {
        Validator<V> validator = new Validator<>();
        buildValidator(validator,validationContext);
        validator.validate(validationContext);
    }

     void buildValidator(Validator<V> validator,V validationContext);
}
