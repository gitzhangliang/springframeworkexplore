package com.zl.springframeworkexplore.validate.business;

import com.zl.springframeworkexplore.validate.ValidationService;
import com.zl.springframeworkexplore.validate.Validator;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    private DbService dbService = new DbService();

    public void save(BusinessParam param){
        ((ValidationService<BusinessParam>)(Validator<BusinessParam> validator, BusinessParam validationContext) -> {
            validator.addRules(new BusinessDbRule(dbService.getCount(validationContext.id)));
            validator.addRules(param);
        }).validate(param);
        System.out.println("保存成功");
    }

    public static void main(String[] args) {
        BusinessService service = new BusinessService();
        BusinessParam param = new BusinessParam();
        param.id = 100;
        param.count = 903;
        service.save(param);
        param.id = 100;
        param.count = 900;
        service.save(param);
    }
}


