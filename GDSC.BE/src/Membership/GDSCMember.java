package Membership;

import Property.Attachment;
import Property.Contribute;
import Property.Networking;

public abstract class GDSCMember implements Attachment, Contribute, Networking {
    String domain;

    GDSCMember(String domain) {
        this.domain = domain;
    }
}
