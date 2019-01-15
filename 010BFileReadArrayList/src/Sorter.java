
public class Sorter {
	String alphaBet = "abcdefghijklmnopqrstuvwxyz0123456789.,?\":;-'";
	public Sorter(char[] c, int[] i) {
			//Bubble List
					for (int p = 0; p<c.length - 1; p++) {
						
						for (int o=0; o<c.length - 1-p; o++) {
							char temp;
							int temp2=0;
							
							if (i[o]<i[o+1]) {
								temp = c[o];
								temp2 = i[o];
								c[o]=c[o+1];
								i[o]=i[o+1];
								c[o+1]=temp;
								i[o+1]=temp2;
							}
						}
					}
					
					for (int b = 0; b< alphaBet.length(); b++) {
						System.out.println(c[b] + ": " + String.valueOf(i[b]));
					}
		}

} 