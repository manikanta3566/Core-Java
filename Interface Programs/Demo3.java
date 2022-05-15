interface connection{
	void connect();
	void query();
	void close();
}
class oracle implements connection{
	public void connect() {
		System.out.println("connecting to oracle DB");
	}
	public void query() {
		System.out.println("query oracle DB");
	}
	public void close() {
		System.out.println("closing oracle DB");
	}
}
class sybase implements connection{
	public void connect() {
		System.out.println("connecting to sybase DB");
	}
	public void query() {
		System.out.println("query sybase DB");
	}
	public void close() {
		System.out.println("closing sybase DB");
	}
}
class informix implements connection{
	public void connect() {
		System.out.println("connecting to informix DB");
	}
	public void query() {
		System.out.println("query informix DB");
	}
	public void close() {
		System.out.println("closing informix DB");
	}
}
class ConnectToDb{
void allowconnection(connection ref)
{
	ref.connect();
	ref.query();
	ref.close();
}
}
class Demo3{
	public static void main(String [] args) {
		oracle o=new oracle();
		sybase s=new sybase();
		informix i=new informix();
		ConnectToDb c=new ConnectToDb();
		c.allowconnection(o);
		System.out.println();
		c.allowconnection(s);
		System.out.println();
		c.allowconnection(i);
	}
}