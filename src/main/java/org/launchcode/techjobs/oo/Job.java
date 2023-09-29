package org.launchcode.techjobs.oo;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Job {

    private static int nextId = 1;
    private final int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + StringUtils.defaultIfBlank(name, "Data not available") + "\n" +
                "Employer: " + StringUtils.defaultIfBlank(employer != null ? employer.toString() : null, "Data not available") + "\n" +
                "Location: " + StringUtils.defaultIfBlank(location != null ? location.toString() : null, "Data not available") + "\n" +
                "Position Type: " + StringUtils.defaultIfBlank(positionType != null ? positionType.toString() : null, "Data not available") + "\n" +
                "Core Competency: " + StringUtils.defaultIfBlank(coreCompetency != null ? coreCompetency.toString() : null, "Data not available") + "\n";
    }


}
