package org.skyscreamer.yoga.jaxrs.view;

import javax.inject.Singleton;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.skyscreamer.yoga.view.XhtmlSelectorView;

@Singleton
@Provider
@Produces(MediaType.TEXT_HTML)
public class XhtmlSelectorMessageBodyWriter extends AbstractInjectedYogaMessageBodyWriter
{
    public XhtmlSelectorMessageBodyWriter()
    {
        super( new XhtmlSelectorView() );
    }
}
