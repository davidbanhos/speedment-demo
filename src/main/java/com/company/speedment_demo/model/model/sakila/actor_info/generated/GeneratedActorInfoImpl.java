package com.company.speedment_demo.model.model.sakila.actor_info.generated;

import com.company.speedment_demo.model.model.sakila.actor_info.ActorInfo;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.speedment_demo.model.model.sakila.actor_info.ActorInfo}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedActorInfoImpl implements ActorInfo {
    
    private int actorId;
    private String firstName;
    private String lastName;
    private String filmInfo;
    
    protected GeneratedActorInfoImpl() {
        
    }
    
    @Override
    public int getActorId() {
        return actorId;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public Optional<String> getFilmInfo() {
        return Optional.ofNullable(filmInfo);
    }
    
    @Override
    public ActorInfo setActorId(int actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public ActorInfo setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public ActorInfo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public ActorInfo setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "   + Objects.toString(getActorId()));
        sj.add("firstName = " + Objects.toString(getFirstName()));
        sj.add("lastName = "  + Objects.toString(getLastName()));
        sj.add("filmInfo = "  + Objects.toString(OptionalUtil.unwrap(getFilmInfo())));
        return "ActorInfoImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof ActorInfo)) { return false; }
        final ActorInfo thatActorInfo = (ActorInfo)that;
        if (this.getActorId() != thatActorInfo.getActorId()) {return false; }
        if (!Objects.equals(this.getFirstName(), thatActorInfo.getFirstName())) {return false; }
        if (!Objects.equals(this.getLastName(), thatActorInfo.getLastName())) {return false; }
        if (!Objects.equals(this.getFilmInfo(), thatActorInfo.getFilmInfo())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getLastName());
        hash = 31 * hash + Objects.hashCode(getFilmInfo());
        return hash;
    }
}