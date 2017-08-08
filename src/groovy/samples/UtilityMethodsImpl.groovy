package groovy.samples

import samples.java.UtilityMethods
import java.security.spec.PKCS8EncodedKeySpec

class UtilityMethodsImpl implements UtilityMethods {

	@Override
	public int[] oddArray(int[] nums) {
		
		def odds = nums.findAll({x->x%2==1})
		
		return odds;
	}

	@Override
	public boolean isOdd(int x) {
		// TODO Auto-generated method stub
		return x%2==1;
	}

}
