class Box 
{ 
	double width, height, depth; 
	int boxNo; 
	Box(double w, double h, double d, int num) 
	{ 
		width = w; 
		height = h; 
		depth = d; 
		boxNo = num; 
	} 

	Box() 
	{ 
		// an empty box 
		width = height = depth = 0; 
	} 

	Box(int num) 
	{ 
		this(); 

		boxNo = num; 
	} 

	public static void main(String[] args) 
	{ 
		// create box using only boxNo 
		Box box1 = new Box(1); 

		// getting initial width of box1 
		System.out.println(box1.width); 
	} 
} 
