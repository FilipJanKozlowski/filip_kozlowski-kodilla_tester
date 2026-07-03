package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private boolean postmarked;

    public Stamp(String stampName, String stampDimensions, boolean postmarked) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.postmarked = postmarked;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public boolean isPostmarked() {
        return postmarked;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return postmarked == stamp.postmarked && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, postmarked);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", postmarked=" + postmarked +
                '}';
    }
}