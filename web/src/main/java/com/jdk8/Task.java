package com.jdk8;

/**
 * Created by pig on 2017/6/20.
 */

public class Task {
    private final Status status;
    private final Integer points;

    Task( final Status status, final Integer points ) {
        this.status = status;
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format( "[%s, %d]", status, points );
    }
}

