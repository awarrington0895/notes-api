package com.okta.developer.notes

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface NotesRepository : JpaRepository<Note, Long> {
    fun findAllByUser(name: String, pageable: Pageable): Page<Note>
    fun findAllByUserAndTitleContainingIgnoreCase(name: String, term: String, pageable: Pageable): Page<Note>
}