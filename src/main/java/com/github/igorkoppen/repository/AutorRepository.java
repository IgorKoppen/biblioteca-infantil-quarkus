package com.github.igorkoppen.repository;

import com.github.igorkoppen.model.Autor;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutorRepository implements PanacheRepository<Autor> { }
