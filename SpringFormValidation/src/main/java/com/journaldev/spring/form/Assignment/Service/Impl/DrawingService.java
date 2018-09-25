package com.journaldev.spring.form.Assignment.Service.Impl;

import com.journaldev.spring.form.Assignment.Service.Drawing;
import com.journaldev.spring.form.Assignment.Service.Quadrilateral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DrawingService implements Drawing {

    @Autowired
    @Qualifier("Square")
    private Quadrilateral quadrilateral;

    @Override
    public String drawShape() {
        return quadrilateral.Draw();
    }
}
