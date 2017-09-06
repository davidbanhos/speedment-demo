package com.company.speedment_demo;

import com.company.speedment_demo.model.SpeedmentDemoApplication;
import com.company.speedment_demo.model.SpeedmentDemoApplicationBuilder;
import com.company.speedment_demo.model.model.sakila.actor.Actor;
import com.company.speedment_demo.model.model.sakila.actor.ActorManager;
import com.company.speedment_demo.model.model.sakila.film.Film;
import com.company.speedment_demo.model.model.sakila.film.FilmManager;
import com.company.speedment_demo.model.model.sakila.film_actor.FilmActor;
import com.company.speedment_demo.model.model.sakila.film_actor.FilmActorManager;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Your name
 */
public class Main {



    public static void main(String... param) {
        SpeedmentDemoApplication app = new SpeedmentDemoApplicationBuilder()
                .withPassword("my-secret-pw")
                .build();

        FilmManager films = app.getOrThrow(FilmManager.class);
        ActorManager actors = app.getOrThrow(ActorManager.class);
        FilmActorManager filmActors = app.getOrThrow(FilmActorManager.class);

        // your application logic here

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter Film ID ");
        final int id = Integer.decode(scn.nextLine().trim());
        System.out.println("Film ID " + id + films.stream()
                .filter(Film.FILM_ID.equal(id))                    // find the films we are looking for
                .findAny()                                         // we know that ID is unique
                .map(f ->  " has title " + f.getTitle())           // map film instance to the desired output
                .orElse(" not found."));                           // provide meaningful output for no film found


        System.out.println("Please enter actor last name ");
        final String actorName = scn.nextLine().trim();
        Set<Integer> selectedActorIds = actors.stream()
                .filter(Actor.LAST_NAME.equalIgnoreCase(actorName))
                .mapToInt(Actor.ACTOR_ID.getter())                      // turning the stream into a stream of actor IDs
                .boxed()                                                // turning IntStream into Stream<Integer>
                .collect(Collectors.toSet());

        if (selectedActorIds.isEmpty()) {
            System.out.println("No actor with last name " + actorName + " found.");
        } else {
            System.out.println("Films with actor with last name " + actorName + ":");
            filmActors.stream()
                    .filter(FilmActor.ACTOR_ID.in(selectedActorIds))
                    .map(films.finderBy(FilmActor.FILM_ID))  // the stream of films we are looking for
                    .map(Film.TITLE.getter())                // the stream of film titles
                    .sorted()
                    .forEach(title -> System.out.println(" " + title));
        }

        app.stop();

    }
}