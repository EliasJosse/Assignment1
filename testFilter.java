
public class testFilter{
	

	public static String[] filter(String[] a, Filter f){
		int pointer = 0;
		for(int i=0;i<a.length;i++){
			if(f.accept(a[i])){
				a[pointer] = a[i];
				pointer++;
			}
			
		}
		String[] b = new String[pointer];
		for(int i=0;i<pointer;i++){
			b[i] = a[i];
		}
		return b;
	}
	
	public static void main(String[] args){
		String[] words = {"hej","detta","e","en","massa","olika","ord"};
		Filter f = new maxThreeFilter();
		words = testFilter.filter(words, f);
		for (int j = 0; j < words.length; j++) {
			System.out.println(words[j]);
		}
	
	}

}