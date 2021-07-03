package Generic.Max;

public class MaxInt {
	private Integer x,y,z;
	
	
	
	public MaxInt(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static Integer maxInt(Integer a, Integer b, Integer c) {
		Integer max= a;
		if(b.compareTo(max) > 0) {
			max=b;
		}
		if (c.compareTo(max) > a) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		Integer a=9,b=5,c=7;
		Integer max= maxInt(a,b,c);
		System.out.println(max);
		
	}
}
