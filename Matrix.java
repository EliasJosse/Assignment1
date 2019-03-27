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
		
		Matrix a = new Matrix(2,2);
		Matrix b = new Matrix(2,2);
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++){
				a.setElement(i+1+j, i, j);
				b.setElement(i+1+j, i, j);
			}
		
		System.out.println(a.getElement(0,0));
		System.out.println(b.getElement(1,0));
		System.out.println(b.getElement(0,1));
		System.out.println(b.getElement(1,1));

		Matrix c = a.multiply(b);
		
		System.out.println("multy");
		System.out.println(c.getElement(0,0));
		System.out.println(c.getElement(1,0));
		System.out.println(c.getElement(0,1));
		System.out.println(c.getElement(1,1));
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
	
	public void add(Matrix other){
		if(this.rows==other.rows && this.cols==other.cols){
			for(int r=0;r<this.rows;r++)
				for(int c=0;c<this.rows;c++)
					elmts[r][c] = this.getElement(r,c) + other.getElement(r, c);
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
