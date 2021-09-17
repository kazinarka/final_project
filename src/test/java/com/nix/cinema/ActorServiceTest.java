package com.nix.cinema;

import com.nix.cinema.model.Actor;
import com.nix.cinema.repository.ActorRepository;
import com.nix.cinema.services.ActorService;
import com.nix.cinema.services.impl.ActorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ActorServiceTest {

    ActorService actorService;
    ActorRepository actorRepository;

    @BeforeEach
    void setUp() {
        actorRepository = mock(ActorRepository.class);
        actorService = new ActorServiceImpl(actorRepository);
    }

    @Test
    void addActorTest() {

    }

    @Test
    void getAllActorsTest() {
        List<Actor> actors = actorService.getAllActors();
        assertEquals(0, actors.size());
        verify(actorRepository).findAll();
        verifyNoInteractions(actorRepository);
    }

    @Test
    void getAllActorsPageTest() {

    }

    @Test
    void getActorByIdTest() {

    }

    @Test
    void deleteActorById() {

    }
}
