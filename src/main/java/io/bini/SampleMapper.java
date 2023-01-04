package io.bini;

import io.bini.base.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SampleMapper extends GenericMapper<SampleEntity, SampleDTO> {
}
