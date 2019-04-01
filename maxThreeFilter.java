
public class maxThreeFilter implements Filter{
	public boolean accept(String x) {
		if(x.length()<=3){
			return true;
		}
		return false;
	}
}


