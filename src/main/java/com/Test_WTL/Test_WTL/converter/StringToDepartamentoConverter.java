package com.Test_WTL.Test_WTL.converter;

import com.Test_WTL.Test_WTL.domain.DepartamentoEntity;
import com.Test_WTL.Test_WTL.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoConverter implements Converter<String, DepartamentoEntity> {

    @Autowired
    private DepartamentoService service;
    @Override
    public DepartamentoEntity convert(String text) {
        if(text.isEmpty()){
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
}
