package com.microservicios.reportlistener.repositories;

import com.microservicios.reportlistener.documents.ReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {
}
