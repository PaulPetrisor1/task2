package com.matillion.task2.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int positionId;

    @Column(length = 30)
    private String positionTitle;

    @Column(length = 30)
    private String payType;

    @Column(precision = 10, scale = 4)
    private double minScale;

    @Column(precision = 10, scale = 4)
    private double maxScale;

    @Column(length = 30)
    private String managementRole;


    public Position() {
        // needed by JPA
    }

    public Position(String positionTitle, String payType, float minScale, float maxScale, String managementRole) {
        this.positionTitle = positionTitle;
        this.payType = payType;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.managementRole = managementRole;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public double getMinScale() {
        return minScale;
    }

    public void setMinScale(double minScale) {
        this.minScale = minScale;
    }

    public double getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(double maxScale) {
        this.maxScale = maxScale;
    }

    public String getManagementRole() {
        return managementRole;
    }

    public void setManagementRole(String managementRole) {
        this.managementRole = managementRole;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionTitle='" + positionTitle + '\'' +
                ", payType='" + payType + '\'' +
                ", minScale=" + minScale +
                ", maxScale=" + maxScale +
                ", managementRole='" + managementRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return positionId == position.positionId &&
                Double.compare(position.minScale, minScale) == 0 &&
                Double.compare(position.maxScale, maxScale) == 0 &&
                Objects.equals(positionTitle, position.positionTitle) &&
                Objects.equals(payType, position.payType) &&
                Objects.equals(managementRole, position.managementRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionId, positionTitle, payType, minScale, maxScale, managementRole);
    }

}
