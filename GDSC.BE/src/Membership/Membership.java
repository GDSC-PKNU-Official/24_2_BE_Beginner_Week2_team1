package Membership;

public abstract class Membership {
    String domain;

    Membership(String domain) {
        this.domain = domain;
    }

    public abstract void contribute();

    public abstract void networking();

    public abstract void attach();
}
