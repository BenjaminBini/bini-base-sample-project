package io.bini;

import io.bini.base.mapper.GenericMapperService;
import io.bini.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends BaseService<SampleEntity, SampleDTO, Long> {
    public SampleService(SampleRepository repository, GenericMapperService mapperService) {
        super(repository, mapperService);
    }
}
