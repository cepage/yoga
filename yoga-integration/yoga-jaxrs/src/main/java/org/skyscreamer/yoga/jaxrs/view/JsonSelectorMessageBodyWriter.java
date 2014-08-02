package org.skyscreamer.yoga.jaxrs.view;

import javax.inject.Singleton;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.skyscreamer.yoga.view.JsonSelectorView;

@Singleton
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JsonSelectorMessageBodyWriter extends AbstractInjectedYogaMessageBodyWriter
{
    public JsonSelectorMessageBodyWriter()
    {
        super( new JsonSelectorView() );
    }
}
