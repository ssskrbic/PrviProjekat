package paket;

public class PrvaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prvi komentar
		
		
		/*viselinijski
		 * *komentar
		 */
		int[] a= {1,2,3,4,5};
		for(int i=0; i<a.length ;i++) {
			if(a[i]%2==0) {
				System.out.println("paran" + a[i]);
			}else {
				System.out.println("neparan" + a[i]);
			}
				
		}
	}

}
