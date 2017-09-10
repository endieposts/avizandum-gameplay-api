package com.endie.avizandum.skillapi.model.deserializers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.endie.avizandum.skillapi.model.Actor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class AllowedActorsListDeserializer extends StdDeserializer<Collection<Actor>>{
    public AllowedActorsListDeserializer() {
        this(null);
    }
 
    public AllowedActorsListDeserializer(Class<?> vc) {
        super(vc);
    }
    
    @Override
    public Collection<Actor> deserialize(
      JsonParser jsonparser, 
      DeserializationContext context) 
      throws IOException, JsonProcessingException {
         
        return null;
    }
}
