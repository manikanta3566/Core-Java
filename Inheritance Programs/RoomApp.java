class Room{
	int l,b;

Room(int x, int y){
	l=x;
	b=y;
}
void area() {
	int res;
	res=l*b;
	System.out.println("area=" + res);
}
}
class Bedroom extends Room{
	int h;
	Bedroom(int x , int y, int z){
		super(x,y);
		h=z;
		
	}
	void volume() {
		int res;
		res=l*b*h;
		System.out.println("volume=" + res);
	}
}
class RoomApp{
	public static void main(String [] args) {
		Bedroom b=new Bedroom(10,20,30);
		b.area();
		b.volume();
	}
}
