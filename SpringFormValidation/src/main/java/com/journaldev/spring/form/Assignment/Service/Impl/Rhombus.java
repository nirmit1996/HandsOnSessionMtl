package com.journaldev.spring.form.Assignment.Service.Impl;

import com.journaldev.spring.form.Assignment.Pojos.Point;
import com.journaldev.spring.form.Assignment.Service.Quadrilateral;
import org.springframework.stereotype.Component;

@Component("Rhombus")
public class Rhombus implements Quadrilateral {
    @Override
    public String Draw() {
        return "================= Rhombus ================";
    }


    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private Point pointFour;

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Point getPointThree() {
        return pointThree;
    }

    public void setPointThree(Point pointThree) {
        this.pointThree = pointThree;
    }

    public Point getPointFour() {
        return pointFour;
    }

    public void setPointFour(Point pointFour) {
        this.pointFour = pointFour;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rhombus{");
        sb.append("pointOne=").append(pointOne);
        sb.append(", pointTwo=").append(pointTwo);
        sb.append(", pointThree=").append(pointThree);
        sb.append(", pointFour=").append(pointFour);
        sb.append('}');
        return sb.toString();
    }
}
