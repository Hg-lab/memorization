package com.memorization.domain.term;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TermRepository extends JpaRepository<Term, Long> {

    List<Term> findByGlossaryId(Long glossaryId);

}
