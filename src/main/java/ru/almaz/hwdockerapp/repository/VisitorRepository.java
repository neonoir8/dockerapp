package ru.almaz.hwdockerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.almaz.hwdockerapp.entity.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
