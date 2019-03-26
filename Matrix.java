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
		else throw new IllegalArgumentException  ("Invalid Place"); 
		
		
	}
	
	public void add(Matrix other){
		if(this.rows==other.rows && this.cols==other.cols){
			for(int r=0;r<this.rows;r++)
				for(int c=0;c<this.rows;c++)
					elmts[r][c] = this.getElement(r,c) + other.getElement(r, c);
		}
		else throw new IllegalArgumentException  ("Matrices must match");
	}
	
	public void multiply(Matrix other){
		if(this.rows==other.rows){
			this.elmts = new double[this.cols][other.rows];
		}
		else throw new IllegalArgumentException  ("Matrices must match according to  multiplication");
		
		for(int r=0;r<this.rows;r++)
			for(int c=0;c<this.rows;c++)
				elmts[r][c] = (this.getElement(r,c)) * (other.getElement(r, c)) + (this.getElement(r+1,c)) * (other.getElement(r, c));

		
	}
}
