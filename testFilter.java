package vecka1;

public class testFilter{

	
	public static String[] filter(String[] a, Filter f){
		int pointer = 0;
		for(int i=0;i<a.length;i++){
			if(accept(a[i])){
				a[pointer] = a[i];
				pointer++;
			}
			
		}
		String[] b = new String[pointer+1];
		for(int i=0;i<pointer;i++){
			b[i] = a[i];
		}
		return b;
	}

	public static boolean accept(String x) {
		if(x.length()<=3){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		
	}

}
