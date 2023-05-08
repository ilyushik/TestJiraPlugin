package com.atlassian.plugins.tutorial.rest.test;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "something")
public class TestModel {
    @XmlAttribute
    private int number;

    @XmlElement(name = "value")
    private String string;

    public TestModel(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public TestModel() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
