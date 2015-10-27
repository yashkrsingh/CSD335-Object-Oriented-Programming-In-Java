package SNU.geometryUtil;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double costOfPaintingShape(double cost){
		return (this.getArea()*cost);
	}
	
	@Override
	public int compareTo(GeometricObject o) {
		if(this.getArea() > o.getArea())
			return 1;
		else 
			return 0;
	}
	
}
