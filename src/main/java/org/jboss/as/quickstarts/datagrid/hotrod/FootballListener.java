package org.jboss.as.quickstarts.datagrid.hotrod;

import org.infinispan.client.hotrod.annotation.*;
import org.infinispan.client.hotrod.event.ClientEvent;

@ClientListener
public class FootballListener {

    @ClientCacheEntryCreated
    @ClientCacheEntryRemoved
    @ClientCacheEntryModified
    @ClientCacheEntryExpired
    public void handleCacheEvent(ClientEvent clientEvent) {
        System.out.println(clientEvent);
    }

}
