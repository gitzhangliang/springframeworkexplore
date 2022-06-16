package com.zl.springframeworkexplore.validate;

import java.util.ArrayList;
import java.util.List;

public class Validator<V extends ValidationContext> implements Validatable<V>{
    private final List<ValidationRule<V>> rules = new ArrayList<>();

    @Override
    public void validate(V validationContext) throws ValidationException {
        for (ValidationRule<V> rule : rules) {
            rule.validate(validationContext);
        }
        clearRules();
    }
    private void clearRules(){
        rules.clear();
    }

    public void addRules(ValidationRule<V> validationRule){
        rules.add(validationRule);
    }
}
