package com.journaldev.spring.form.Assignment;

import com.journaldev.spring.form.Assignment.Service.Drawing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrawingApp {

    @Autowired
    private Drawing drawing;

    @RequestMapping(value = "/draw", method = RequestMethod.GET)
    public String drawShape() {
        return drawing.drawShape();
    }
}
