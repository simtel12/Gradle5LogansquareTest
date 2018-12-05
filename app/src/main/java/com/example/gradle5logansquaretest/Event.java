package com.example.gradle5logansquaretest;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(serializeNullCollectionElements = true, serializeNullObjects = true)
public class Event {
    @JsonField
    String name;

    @JsonField(name = "tx")
    String id;
}
