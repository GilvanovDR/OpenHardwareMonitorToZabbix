/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonSetter;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"id", "Min", "Max"})
public class JsonEntity {

    @JsonProperty("Text")
    String text = "";

    @JsonProperty("Children")
    List<JsonEntity> children = new ArrayList<>();

    @JsonProperty("Value")
    String value = "";

    @JsonProperty("ImageURL")
    Type type;

    @Override
    public String toString() {
        return text + "{" + type + "=" + value + ", (" + children + ")}";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setChildren(List<JsonEntity> children) {
        this.children = children;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonSetter("ImageURL")
    public void setType(String type) {
        this.type = Type.getType(type);
    }
}
