public class Connection {
    ConnectionId id;
    ConnectionUri uri;
    ConnectionType type;

    public Connection(ConnectionId id, ConnectionUri uri, ConnectionType type) {
        this.id = id;
        this.uri = uri;
        this.type = type;
    }

    public ConnectionId getId() {
        return id;
    }

    public void setId(ConnectionId id) {
        this.id = id;
    }

    public ConnectionUri getUri() {
        return uri;
    }

    public void setUri(ConnectionUri uri) {
        this.uri = uri;
    }

    public ConnectionType getType() {
        return type;
    }

    public void setType(ConnectionType type) {
        this.type = type;
    }
}
