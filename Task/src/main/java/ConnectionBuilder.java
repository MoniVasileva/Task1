public class ConnectionBuilder {
    ConnectionId id;
    ConnectionUri uri;
    ConnectionType type;

    public ConnectionBuilder(ConnectionId id, ConnectionUri uri, ConnectionType type) {
        this.id = id;
        this.uri = uri;
        this.type = type;
    }

    public ConnectionBuilder setId(ConnectionId id) {
        this.id = id;
        return this;
    }

    public ConnectionBuilder setUri(ConnectionUri uri) {
        this.uri = uri;
        return this;
    }

    public ConnectionBuilder setType(ConnectionType type) {
        this.type = type;
        return this;
    }
    public Connection build(){
        return new Connection(id,uri,type);
    }
}
