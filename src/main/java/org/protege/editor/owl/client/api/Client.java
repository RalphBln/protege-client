package org.protege.editor.owl.client.api;

import edu.stanford.protege.metaproject.api.AuthToken;
import edu.stanford.protege.metaproject.api.User;

public interface Client extends ClientRequests, PolicyMediator, RegistryMediator {

    AuthToken getAuthToken();

    User getUser();
}
