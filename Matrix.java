package vecka1;


public class Matrix {

	private double[][] elmts;
	private int rows;
	private int cols;
	
	public Matrix(int rows, int cols) throws IllegalArgumentException{
		
		if(rows<=0 || cols<=0){
			
			throw new IllegalArgumentException  ("Invalid size"); 
		}
			
		this.rows = rows;
		this.cols = cols;
		elmts = new double[rows][cols];
	
		
	}
			

	public static void main(String[] args) {
		
		//Create two 2x2 matrices with values [1,2][2,3]
		Matrix a = new Matrix(2,2);				
		Matrix b = new Matrix(2,2);
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++){
				a.setElement(i+1+j, i, j);
				b.setElement(i+1+j, i, j);
			}
		
		//setElemnt works
		System.out.println("Values");
		System.out.println(a.getElement(0,0));
		System.out.println(b.getElement(1,0));
		System.out.println(a.getElement(0,1));
		System.out.println(b.getElement(1,1));
		System.out.println();
		//test add, expected [2,4][4,8]
		Matrix add_ab = a.add(b);
		System.out.println("added");
		
		System.out.println(add_ab.getElement(0,0));
		System.out.println(add_ab.getElement(1,0));
		System.out.println(add_ab.getElement(0,1));
		System.out.println(add_ab.getElement(1,1));
		System.out.println();

		//test multiply, expected [5,8][8,13]
		Matrix mult_ab = a.multiply(b);
		
		System.out.println("multiplied");
		System.out.println(mult_ab.getElement(0,0));
		System.out.println(mult_ab.getElement(1,0));
		System.out.println(mult_ab.getElement(0,1));
		System.out.println(mult_ab.getElement(1,1));
		
		
	}
	
	
	
	public void setElement(double value, int row,int col) throws IllegalArgumentException{
		if(row<rows || row>=0 && col<cols || col>=0 ){
			elmts[row][col] = value;
		  
		}
		else throw new IllegalArgumentException  ("Invalid Place"); 
	}
	
	public double getElement(int row,int col){
		if(row<rows || row>=0 && col<cols || col>=0 ){
			return elmts[row][col];
		}
		else throw new IllegalArgumentException  ("Invalid Position"); 
	}
	
	public Matrix add(Matrix other){
		if(this.rows==other.rows && this.cols==other.cols){
			Matrix newMatrix = new Matrix(this.rows, other.cols);
			for(int r=0;r<this.rows;r++)
				for(int c=0;c<this.rows;c++)
					newMatrix.elmts[r][c] = this.getElement(r,c) + other.getElement(r, c);
			return newMatrix;
		}
		else throw new IllegalArgumentException  ("Matrices must match");
		
		
	}
	
	
	public Matrix multiply(Matrix other){
		if(this.cols!=other.rows){
			throw new IllegalArgumentException  ("Matrices must match according to multiplication");
		}
		Matrix newMatrix = new Matrix(this.rows, other.cols);
		for(int r=0;r<this.rows;r++){
			for(int c=0;c<other.cols;c++){
				for(int k=0;k<this.cols;k++){
					newMatrix.elmts[r][c] += (this.elmts[r][k]) * (other.elmts[k][c]);
				}
			}
		}
		return newMatrix;
	}
}
