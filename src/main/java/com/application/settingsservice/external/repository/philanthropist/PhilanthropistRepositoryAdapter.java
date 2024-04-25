package com.application.settingsservice.external.repository.philanthropist;

import com.application.settingsservice.common.value.Philanthropist;
import com.application.settingsservice.external.repository.IPhilanthropistRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class PhilanthropistRepositoryAdapter implements IPhilanthropistRepository {
    private final MongoTemplate mongoTemplate;

    public PhilanthropistRepositoryAdapter(final MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Philanthropist persistPhilanthropist(final Philanthropist philanthropist) {
        Objects.requireNonNull(philanthropist, "Philanthropist repository required non null report, got null.");

        PhilanthropistDocument reportDocument = PhilanthropistModelMapper.toDocument(philanthropist);

        return PhilanthropistModelMapper.toPhilanthropist(mongoTemplate.save(reportDocument));
    }

    @Override
    public Philanthropist getPhilanthropistById(final String identity) {
        final PhilanthropistDocument philanthropistDocument = mongoTemplate.findById(identity, PhilanthropistDocument.class);

        return philanthropistDocument != null ? PhilanthropistModelMapper.toPhilanthropist(philanthropistDocument) : null;
    }
}
