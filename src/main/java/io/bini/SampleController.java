package io.bini;

import io.bini.base.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class SampleController extends BaseController<SampleEntity, SampleDTO, Long> {

    @Autowired
    public SampleController(SampleService service) {
        super(service);
    }
}
